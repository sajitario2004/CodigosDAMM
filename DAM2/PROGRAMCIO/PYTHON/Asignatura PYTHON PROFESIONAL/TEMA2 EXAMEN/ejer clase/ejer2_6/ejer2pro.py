import threading
import time
import random

mutex = threading.Lock()

def peaton(nombre):
    for _ in range(2):
        print(f"[PEATON {nombre}] Quiere cruzar")
        with mutex:
            print(f"[PEATON {nombre}] CRUZANDO...")
            time.sleep(random.uniform(1, 3))
            print(f"[PEATON {nombre}] Cruzó")
        time.sleep(random.uniform(1, 3))


def coche(nombre):
    for _ in range(2):
        print(f"(COCHE {nombre}) Quiere pasar")
        with mutex:
            print(f"(COCHE {nombre}) PASANDO...")
            time.sleep(random.uniform(1, 3))
            print(f"(COCHE {nombre}) Pasó")
        time.sleep(random.uniform(1, 3))


# ------------ PROGRAMA PRINCIPAL --------------
hilos = []

# 3 coches y 3 peatones mezclados
for i in range(3):
    hilos.append(threading.Thread(target=peaton, args=(i,)))
    hilos.append(threading.Thread(target=coche, args=(i,)))

for h in hilos:
    h.start()

for h in hilos:
    h.join()

print("\n=== Cruce finalizado correctamente ===")
