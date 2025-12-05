import threading
import time
import random

# Evento que indica cuándo los datos están listos
evento_datos_listos = threading.Event()

datos = None   # lo llenará el productor


def productor():
    global datos
    print("[PRODUCTOR] Preparando datos...")
    time.sleep(random.uniform(2, 5))  # Simula preparación
    datos = [random.randint(1, 100) for _ in range(5)]
    print("[PRODUCTOR] Datos listos:", datos)

    evento_datos_listos.set()  # señal a los hilos


def consumidor(id_hilo):
    print(f"[CONSUMIDOR {id_hilo}] Esperando datos...")
    evento_datos_listos.wait()  # Espera hasta que el productor haga set()
    print(f"[CONSUMIDOR {id_hilo}] Leyendo datos:", datos)
    suma = sum(datos)
    print(f"[CONSUMIDOR {id_hilo}] Resultado procesado: suma={suma}")


# -------------------- PROGRAMA PRINCIPAL --------------------

# 1 productor
h_prod = threading.Thread(target=productor)
h_prod.start()

# 4 consumidores
consumidores = []
for i in range(4):
    h = threading.Thread(target=consumidor, args=(i,))
    h.start()
    consumidores.append(h)

# Esperamos a todos
h_prod.join()
for c in consumidores:
    c.join()

print("\n=== PROGRAMA TERMINADO ===")
