import threading
import time

def escribeY():
    for i in range(200):
        #time.sleep(0.2) #Esto provoca cambios de contexto, saca el hilo del procesador por que lo duerme
        print("Y")


def escribeX():
    for i in range(200):
        #time.sleep(0.2)
        print("X")
    print("hola como tas")

hilo = threading.Thread(target=escribeY)
hilo.start()
hilo.join()

hilo2 = threading.Thread(target=escribeX)
hilo2.start()
hilo2.join()

print("adios")






