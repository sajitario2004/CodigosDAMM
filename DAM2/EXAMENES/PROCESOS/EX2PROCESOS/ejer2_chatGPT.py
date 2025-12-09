import threading
import random
import time

# ======= Variables Globales =======
archivo_txt = []
num_linea_global = 1
hilos_parados = 0

lock_archivo = threading.Lock()
lock_num = threading.Lock()

# Eventos
evento_parar = threading.Event()
evento_continuar = threading.Event()

# ==================================


class HiloEscritor(threading.Thread):
    def __init__(self, id_hilo):
        super().__init__()
        self.id_hilo = id_hilo
        self.parado = False

    def run(self):
        global archivo_txt, num_linea_global, hilos_parados

        while True:

            # Si el lector ordena parar
            if evento_parar.is_set():
                print(f"hilo {self.id_hilo} parado")
                with lock_archivo:
                    hilos_parados += 1
                # Espera a que lo vuelvan a activar
                evento_continuar.wait()
                evento_continuar.clear()

            # Sigue escribiendo
            cant_lineas = random.randint(1, 5)

            for _ in range(cant_lineas):

                if evento_parar.is_set():
                    break  # Se para si lo mandan parar

                with lock_num:
                    linea_actual = num_linea_global
                    num_linea_global += 1

                texto = f"hilo {self.id_hilo} linea {linea_actual}"

                with lock_archivo:
                    archivo_txt.append(texto)

                print(f"hilo {self.id_hilo} está escribiendo")

                time.sleep(1)  # Simula escritura real


class HiloLector(threading.Thread):
    def run(self):
        global hilos_parados, archivo_txt

        while True:
            time.sleep(6)  # Cada 6 segundos detiene a los escritores

            # ---- PARAR HILOS ----
            evento_parar.set()

            # Esperar a que los 3 hilos estén parados
            while True:
                with lock_archivo:
                    if hilos_parados == 3:
                        break
                time.sleep(0.1)

            # ---- LEER ----
            print("----LECTOR LEYENDO---")
            with lock_archivo:
                for linea in archivo_txt:
                    print(linea)
            print("----FIN DE LECTURA------")

            # ---- LIMPIAR Y REACTIVAR ----
            with lock_archivo:
                archivo_txt.clear()
                hilos_parados = 0

            evento_parar.clear()
            evento_continuar.set()


# ==================================
#              MAIN
# ==================================

escritores = [HiloEscritor(i) for i in range(3)]
lector = HiloLector()

for h in escritores:
    h.start()

lector.start()
