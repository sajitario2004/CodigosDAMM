import threading
import time
import random

lock_print = threading.Lock()

class Laboratorio:
    def __init__(self, capacidad):
        self.semaforo = threading.Semaphore(capacidad)

    def entrar(self, cientifico):
        if self.semaforo.acquire(blocking=False):
            with lock_print:
                print(f"-> {cientifico} entra al laboratorio")
        else:
            with lock_print:
                print(f"!! {cientifico} esperando para entrar")
            self.semaforo.acquire()
            with lock_print:
                print(f"-> {cientifico} ahora entra al laboratorio")
        
        time.sleep(random.randint(1,4))
        with lock_print:
            print(f"<- {cientifico} sale del laboratorio")
        self.semaforo.release()

class Cientifico(threading.Thread):
    contador = 1
    lock_contador = threading.Lock()

    def __init__(self, lab):
        super().__init__()
        self.lab = lab
        with Cientifico.lock_contador:
            self.nombre = f"Científico-{Cientifico.contador}"
            Cientifico.contador += 1

    def run(self):
        self.lab.entrar(self.nombre)

if __name__ == "__main__":
    lab = Laboratorio(5)
    while True:
        c = Cientifico(lab)
        c.start()
        time.sleep(random.randint(1,2))
