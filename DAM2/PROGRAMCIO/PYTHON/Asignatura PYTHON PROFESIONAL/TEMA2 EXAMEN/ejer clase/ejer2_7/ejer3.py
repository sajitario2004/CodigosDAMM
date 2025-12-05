import threading
import time

stop_event = threading.Event()

def hilo_objetivo():
    while not stop_event.is_set():
        print("[OBJETIVO] Ejecutando...")
        time.sleep(1)
    print("[OBJETIVO] Abortado correctamente.")

def hilo_abortador():
    time.sleep(5)  # dejamos funcionar 5s
    print("[ABORTADOR] Pidiendo ABORTO...")
    stop_event.set()


h1 = threading.Thread(target=hilo_objetivo)
h2 = threading.Thread(target=hilo_abortador)

h1.start()
h2.start()

h1.join()
h2.join()

print("\n=== EJERCICIO 4 TERMINADO ===")
