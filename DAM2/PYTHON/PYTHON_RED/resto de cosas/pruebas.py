import threading
import time

def Saludo():
    time.sleep(3)
    print ("Hola en el hijo")
    

t = threading.Thread(target=Saludo)
t.start

print("Hola en el padre")