import threading # sin usar lock
import time


def suma_uno():
    global g
    lock.acquire() # es lo mismo que with lock que aparece mas abajo
    a = g
    time.sleep(0.001)
    g = a+1
    lock.release() # finaliza el lock de arriba

def suma_tres():
    global g
    with lock: # funciona de la misma manera que el de arriba
        a = g
        time.sleep(0.001)
        g = a+3

hilos = []
g=0
lock = threading.Lock()
for func in [suma_uno,suma_tres]:
    hilos.append(threading.Thread(target=func))
    hilos[-1].start()

for hilo in hilos:
    hilo.join()

print(g)