import threading
import time
import random

lock_print = threading.Lock()

class Parking:
    def __init__(self, plazas):
        self.semaforo = threading.Semaphore(plazas)

    def entrar(self, coche):
        if self.semaforo.acquire(blocking=False):
            with lock_print:
                print(f"-> {coche} ha entrado al parking.")
        else:
            with lock_print:
                print(f"!! {coche} esperando para entrar al parking.")
            self.semaforo.acquire()
            with lock_print:
                print(f"-> {coche} ahora ha entrado al parking.")
        
        # Tiempo estacionado
        time.sleep(random.randint(2,5))
        with lock_print:
            print(f"<- {coche} ha salido del parking.")
        self.semaforo.release()

class Coche(threading.Thread):
    contador = 1
    lock_contador = threading.Lock()

    def __init__(self, parking):
        super().__init__()
        self.parking = parking
        with Coche.lock_contador:
            self.nombre = f"Coche-{Coche.contador}"
            Coche.contador += 1

    def run(self):
        self.parking.entrar(self.nombre)

if __name__ == "__main__":
    parking = Parking(3)
    while True:
        c = Coche(parking)
        c.start()
        time.sleep(random.randint(1,2))
