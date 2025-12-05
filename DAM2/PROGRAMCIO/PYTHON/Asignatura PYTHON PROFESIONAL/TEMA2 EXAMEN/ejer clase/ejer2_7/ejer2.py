import threading
import time
import random

permitir_peatones = threading.Event()
permitir_coches = threading.Event()

# Al principio pasan peatones
permitir_peatones.set()

def peaton(id):
    while True:
        if permitir_peatones.is_set():
            print(f"[PEATON {id}] CRUZANDO")
            time.sleep(random.uniform(0.5,1.2))
        else:
            time.sleep(0.2)  # espera turno

def coche(id):
    while True:
        if permitir_coches.is_set():
            print(f"(COCHE {id}) PASANDO")
            time.sleep(random.uniform(0.5,1.2))
        else:
            time.sleep(0.2)  # espera turno

def controlador():
    while True:
        # 10 s peatones
        permitir_coches.clear()
        permitir_peatones.set()
        print("\n--- SOLO PEATONES (10s) ---")
        time.sleep(10)

        # 5 s coches
        permitir_peatones.clear()
        permitir_coches.set()
        print("\n--- SOLO COCHES (5s) ---")
        time.sleep(5)

# ---------- PROGRAMA PRINCIPAL ----------
threading.Thread(target=controlador, daemon=True).start()

# peatones
for i in range(3):
    threading.Thread(target=peaton, args=(i,), daemon=True).start()

# coches
for j in range(3):
    threading.Thread(target=coche, args=(j,), daemon=True).start()

print("Cruce funcionando... (Ctrl+C para parar)\n")
while True:
    time.sleep(1)
