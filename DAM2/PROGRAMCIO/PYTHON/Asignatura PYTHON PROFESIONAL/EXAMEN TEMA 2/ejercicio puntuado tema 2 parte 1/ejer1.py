import threading
import time
import random

#bloqueador que organiza todo
lock = threading.Lock()

def ordenador(lock, ordenador, trabajos):
   print(f"ordenador{ordenador} solicita imprimir")
   #bloqueamos para que no se ejecuten varios hilos a el mismo tiempo
   with lock:
        print(f"ordenador{ordenador} comienza a imprimir")
        for i in trabajos:
           print(f"ordenador{ordenador} imprime trabajo: {i}")
           time.sleep(1)
        print(f"ordenador{ordenador} terminado de imprimir")
        
           
array_ordenadores = []

#aqui genera los ordenadores
for num_pc in range(1,4):
    trabajo = []
    #hago un numero aleatorio de trabajos entre 1 y 5
    for num_trabajo in range(1, random.randint(1,6)):
        trabajo.append(num_trabajo)
    #hago y ejecuto el hilo
    hilo = threading.Thread(target=ordenador, args=(lock, f"{num_pc}", trabajo,))
    hilo.start()
    # lo añado a un array para luego
    array_ordenadores.append(hilo)
    #esperamos para que entre otro odenador
    time.sleep(random.randint(1,2))

#obligamos a que acaben todos los ordenadores para imprimir la ultima linea
for i in array_ordenadores:
    i.join()

print("Trabajos impresos")