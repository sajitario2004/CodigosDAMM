import threading #sin usar lock.
import time

g =7

def suma_uno():
    global g
    a=g
    time.sleep(0.001)
    g=a+1

def suma_tres():
    global g
    a=g
    time.sleep(0.001)
    g =a+3

hilos = []

for i in [suma_tres,suma_uno]:
    hilos.append(threading.Thread(target=i))
    hilos[-1].start() # -1 señala al último elemento de la lista.


for hilo in hilos:
    hilo.join()


print(g)