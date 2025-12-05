import threading
import time

class Contador:
    def __init__(self):
        self.value = 0
        self.lock = threading.Lock()  # protege self.value

    def incrementar(self):
        # sección crítica: sólo un hilo a la vez
        with self.lock:
            tmp = self.value
            time.sleep(0.01)  # simula trabajo
            self.value = tmp + 1

class Worker(threading.Thread):
    def __init__(self, contador, veces):
        super().__init__()
        self.contador = contador
        self.veces = veces

    def run(self):
        for _ in range(self.veces):
            self.contador.incrementar()

c = Contador()
hilos = [Worker(c, 100) for _ in range(5)]
for h in hilos: 
    h.start()
for h in hilos: 
    h.join()
print("Total:", c.value)  # debe ser 500
