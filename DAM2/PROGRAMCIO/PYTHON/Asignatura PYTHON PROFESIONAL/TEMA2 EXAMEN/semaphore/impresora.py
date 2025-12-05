"""
Ejercicio 1: Imprenta con sólo 2 impresoras

Crea un programa donde varios hilos intentan imprimir documentos, 
pero solo hay 2 impresoras disponibles.
Cada hilo debe simular imprimir (por ejemplo con sleep()).
"""
import threading
import time
import random

semaforo = threading.Semaphore(2)
lock_print = threading.Lock()  # Para que los prints no se mezclen

class Impresora(threading.Thread):
    def __init__(self, semaforo, num_impresora):
        super().__init__()
        self.semaforo = semaforo
        self.num = num_impresora

    def run(self):
        sm = self.semaforo

        # Intentamos adquirir el semáforo sin bloquear para ver si hay impresora libre
        if sm.acquire(blocking=False):
            with lock_print:
                print(f"-> Imprimiendo documento {self.num}...")
            time.sleep(3)  # Tiempo de impresión
            with lock_print:
                print(f"<- Documento {self.num} impreso.")
            sm.release()
        else:
            # Si no hay impresora libre, avisamos y esperamos a que haya sitio
            with lock_print:
                print(f"!! La impresora está ocupada, documento {self.num} esperando...")
            sm.acquire()  # Espera hasta que haya impresora libre
            with lock_print:
                print(f"-> Ahora imprimiendo documento {self.num}...")
            time.sleep(3)
            with lock_print:
                print(f"<- Documento {self.num} impreso.")
            sm.release()

# Generar hilos de manera continua
cont = 0
while True:
    cont += 1
    im = Impresora(semaforo, cont)
    im.start()
    time.sleep(random.randint(1, 2))
