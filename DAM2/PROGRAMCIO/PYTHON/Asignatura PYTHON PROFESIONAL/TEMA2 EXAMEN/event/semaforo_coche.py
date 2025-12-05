import threading
import time
import random

event = threading.Event()

class Semaforo(threading.Thread):
    def __init__(self, event):
        super().__init__()
        self.event = event
        self.personas = []
        self.coches = []
        self.cont_personas = 1
        self.cont_coches = 1

    def generar_personas(self):
        while True:
            self.personas.append(f"Persona{self.cont_personas}")
            print(f"==> {self.personas[-1]} ha llegado al paso de cebra")
            print(f"Personas esperando: {self.personas}\n")
            self.cont_personas += 1
            time.sleep(random.randint(1,2))

    def generar_coches(self):
        while True:
            self.coches.append(f"Coche{self.cont_coches}")
            print(f"==> {self.coches[-1]} ha llegado al paso de cebra")
            print(f"Coches esperando: {self.coches}\n")
            self.cont_coches += 1
            time.sleep(1)

    def run(self):
        while True:
            # Verde -> pasan personas
            if self.event.is_set():
                if len(self.personas) > 0:
                    cruzando = self.personas.pop(0)
                    print(f"🚶 {cruzando} está cruzando...")
                    time.sleep(1)
            # Rojo -> pasan coches
            else:
                if len(self.coches) > 0:
                    cruzando = self.coches.pop(0)
                    print(f"🚗 {cruzando} está pasando...")
                    time.sleep(1)


# Crear semaforo
semaforo = Semaforo(event)
semaforo.start()

# Crear generadores
threading.Thread(target=semaforo.generar_coches, daemon=True).start()
threading.Thread(target=semaforo.generar_personas, daemon=True).start()

# Ciclo del semaforo
while True:
    print("\n🟢 SEMAFORO VERDE (pasan personas)\n")
    event.set()
    time.sleep(5)

    print("\n🔴 SEMAFORO ROJO (pasan coches)\n")
    event.clear()
    time.sleep(10)
