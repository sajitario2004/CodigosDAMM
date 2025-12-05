import threading
import time
import random

class Local:
    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.semaforo = threading.Semaphore(capacidad)
        self.lock_print = threading.Lock()

    def entrar(self, persona):
        # Verificar si está lleno SIN bloquear
        if not self.semaforo.acquire(blocking=False):
            with self.lock_print:
                print(f"!! {persona.nombre} está esperando para entrar.")
            # Aquí SI espera a que haya sitio, pero SIN mensaje repetido
            self.semaforo.acquire()

        with self.lock_print:
            print(f"-> {persona.nombre} ENTRA al local.")

        # Tiempo dentro del local
        tiempo_estancia = random.randint(5, 10)
        time.sleep(tiempo_estancia)

        with self.lock_print:
            print(f"<- {persona.nombre} SALE del local después de {tiempo_estancia}s.")

        self.semaforo.release()


class Persona(threading.Thread):
    contador = 1
    lock_contador = threading.Lock()

    def __init__(self, local):
        super().__init__()
        self.local = local

        with Persona.lock_contador:
            self.nombre = f"Persona-{Persona.contador}"
            Persona.contador += 1

    def run(self):
        self.local.entrar(self)


class GeneradorPersonas(threading.Thread):
    def __init__(self, local):
        super().__init__()
        self.local = local

    def run(self):
        while True:
            p = Persona(self.local)
            p.start()

            # Llegan entre 1 y 3 segundos
            time.sleep(random.randint(1, 2))


if __name__ == "__main__":
    local = Local(capacidad=5)

    generador = GeneradorPersonas(local)
    generador.start()
