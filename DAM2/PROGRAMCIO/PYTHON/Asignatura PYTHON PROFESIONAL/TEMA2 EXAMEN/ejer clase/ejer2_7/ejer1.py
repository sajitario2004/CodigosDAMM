import threading
import time

evento_parar = threading.Event()

def trabajador():
    while not evento_parar.is_set():   # trabaja mientras NO esté activado el evento
        print("[TRABAJADOR] Trabajando...")
        time.sleep(1)
    print("[TRABAJADOR] DETENIDO correctamente.")

def controlador():
    time.sleep(5)   # dejamos trabajar 5 segundos
    print("[CONTROLADOR] Ordenando detener...")
    evento_parar.set()


h1 = threading.Thread(target=trabajador)
h2 = threading.Thread(target=controlador)

h1.start()
h2.start()

h1.join()
h2.join()

print("\n=== EJERCICIO 2 COMPLETADO ===")
