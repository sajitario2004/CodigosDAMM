import threading
import time
import random

lock_print = threading.Lock()

class Banco:
    def __init__(self, cajeros):
        self.semaforo = threading.Semaphore(cajeros)

    def usar_cajero(self, cliente):
        if self.semaforo.acquire(blocking=False):
            with lock_print:
                print(f"-> {cliente} usando cajero")
        else:
            with lock_print:
                print(f"!! {cliente} esperando turno")
            self.semaforo.acquire()
            with lock_print:
                print(f"-> {cliente} ahora usando cajero")
        
        time.sleep(random.randint(1,3))
        with lock_print:
            print(f"<- {cliente} terminó en cajero")
        self.semaforo.release()

class Cliente(threading.Thread):
    contador = 1
    lock_contador = threading.Lock()

    def __init__(self, banco):
        super().__init__()
        self.banco = banco
        with Cliente.lock_contador:
            self.nombre = f"Cliente-{Cliente.contador}"
            Cliente.contador += 1

    def run(self):
        self.banco.usar_cajero(self.nombre)

if __name__ == "__main__":
    banco = Banco(4)
    while True:
        c = Cliente(banco)
        c.start()
        time.sleep(random.randint(1,2))
