import threading #Otra forma
import time

g = 1

def suma_uno():
    global g
    with lock:
        a=g
        time.sleep(1)
        g = a+1

def suma_tres():
    global g
    with lock:
        a=g
        time.sleep(1)
        g =a+3

lock = threading.Lock()
hilos = []

for i in [suma_uno,suma_tres]:
    hilos.append(threading.Thread(target=i))
    hilos[-1].start() # -1 señala al último elemento de la lista.

print("hola como tas")

for hilo in hilos:
    hilo.join()

print(g)

hola = threading.Condition
hola.notify_all