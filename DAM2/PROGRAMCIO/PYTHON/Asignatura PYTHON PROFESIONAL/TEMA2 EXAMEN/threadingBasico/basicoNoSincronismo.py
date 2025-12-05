import threading
import time
"""2 hilos que se ejecutan sin sincronismo"""
def printear(var1):
    time.sleep(0.001)
    for i in range(1,20):
        print(var1)

hilo1 = threading.Thread(target=printear, args=("hola1",))
hilo2 = threading.Thread(target=printear, args=("hola2",))

hilo1.start()
hilo2.start()
