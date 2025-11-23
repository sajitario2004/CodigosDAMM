import threading
import time

def tiempo():
    print()
    print()
    contador= 0
    while True:
        time.sleep(1)
        contador+=1
        print(contador, " Segundos")


entrada = input("Deseas salir")

x = threading.Thread(target=tiempo, daemon=True)
x.start()