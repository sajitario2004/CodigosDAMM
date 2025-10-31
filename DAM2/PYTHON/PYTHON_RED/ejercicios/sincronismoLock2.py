import threading
import time

class Contador:
    def __init__(self, lock):
        self.g = 0
        self.lock = lock

    def suma_uno(self):
        with self.lock:
            a = self.g
            time.sleep(0.001)
            self.g = a + 1

    def suma_tres(self):
        with self.lock:
            a = self.g
            time.sleep(0.001)
            self.g = a + 3

class HiloOperacion(threading.Thread):
    def __init__(self, funcion):
        super().__init__()
        self.funcion = funcion

    def run(self):
        self.funcion()

lock = threading.Lock()
contador = Contador(lock)


hilos = [
    HiloOperacion(contador.suma_uno),
    HiloOperacion(contador.suma_tres)
]

for hilo in hilos:
    hilo.start()

for hilo in hilos:
    hilo.join()

print(f"Valor final de g: {contador.g}")
