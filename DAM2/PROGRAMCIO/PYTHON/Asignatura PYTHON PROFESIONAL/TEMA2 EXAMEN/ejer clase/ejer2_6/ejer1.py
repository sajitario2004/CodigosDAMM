import threading
import time

g = 0
lock = threading.Lock()

class MiHilo(threading.Thread):
    def __init__(self, inc):
        super().__init__()
        self.inc = inc

    def run(self):
        global g
        with lock:
            a = g
            time.sleep(0.001)
            g = a + self.inc


# ----------- PROGRAMA PRINCIPAL -------------
hilos = []

# Creamos 2 hilos: uno +1 y otro +3
for inc in (1, 3):
    hilo = MiHilo(inc)
    hilo.start()
    hilos.append(hilo)

for h in hilos:
    h.join()

print("Valor final de g =", g)
