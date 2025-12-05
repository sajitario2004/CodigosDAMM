import threading
import time
import random

cola_impresion = []
lock = threading.Lock()

def productor():
    for i in range(10):     # genera 10 trabajos
        time.sleep(random.uniform(0.5, 2))   # Simula tiempo de creación
        trabajo = f"Trabajo {i}"
        with lock:
            cola_impresion.append(trabajo)
            print(f"[PRODUCTOR] Añadido: {trabajo}")

def impresora():
    while True:
        with lock:
            if cola_impresion:
                trabajo = cola_impresion.pop(0)
                print(f"[IMPRESORA] Imprimiendo -> {trabajo}")
            else:
                trabajo = None

        if trabajo:
            time.sleep(random.uniform(1, 4)) # Simula impresión
        else:
            time.sleep(0.5)  # Esperando trabajos

# ------------ PROGRAMA PRINCIPAL --------------
t_prod = threading.Thread(target=productor)
t_imp = threading.Thread(target=impresora, daemon=True)

t_prod.start()
t_imp.start()

t_prod.join()

print("\n==> No hay más trabajos, el programa finaliza.\n")
