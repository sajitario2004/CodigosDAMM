import threading 
import time

def tarea_del_hilo():
    hilo_actual = threading.current_thread()
    print(f'Nombre: {hilo_actual.name}, identificador: {hilo_actual.ident}' )
    time.sleep(3)

hilo = []

for i in range(5):
    hilo = threading.Thread(target=tarea_del_hilo)
    hilo.start()
    hilos.apennd(hilo)

print(f'hilos activos en el princiapl: {threading.active_count()}')

for hilo in hilos:
    hilo.join()

