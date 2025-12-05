import threading
import time
import random

class Cuenta:
    def __init__(self, saldo):
        self.saldo = saldo
        self.lock = threading.Lock()

    def retirar(self, cantidad, nombre):
        with self.lock:   # evita que dos hilos retiren a la vez
            if self.saldo >= cantidad:
                print(f"{nombre} retira {cantidad}")
                time.sleep(0.1)
                self.saldo -= cantidad
                print(f"Nuevo saldo: {self.saldo}")
            else:
                print(f"{nombre} NO puede retirar {cantidad}, saldo insuficiente.")

class HiloRetirada(threading.Thread):
    def __init__(self, cuenta, nombre):
        super().__init__()
        self.cuenta = cuenta
        self.nombre = nombre

    def run(self):
        for _ in range(3):
            cantidad = random.randint(10, 50)
            self.cuenta.retirar(cantidad, self.nombre)
            time.sleep(random.uniform(0.2,1))


# ------ PROGRAMA PRINCIPAL -------
cuenta = Cuenta(200)
hilos = []

for i in range(5):
    h = HiloRetirada(cuenta, f"Hilo-{i}")
    h.start()
    hilos.append(h)

for h in hilos:
    h.join()

print("\nSaldo final de la cuenta =", cuenta.saldo)
