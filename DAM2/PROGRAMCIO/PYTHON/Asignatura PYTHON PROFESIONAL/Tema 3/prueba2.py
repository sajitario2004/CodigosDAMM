import threading
import time

class CicloConClear:
    def __init__(self):
        self.evento = threading.Event()

    def trabajador(self):
        while True:
            print("[Trabajador] Esperando señal...")
            self.evento.wait()
            print("[Trabajador] Trabajando...")
            time.sleep(1)
            self.evento.clear()

    def controlador(self):
        for _ in range(3):
            time.sleep(2)
            print("[Controlador] Activando señal...")
            self.evento.set()

    def ejecutar(self):
        t1 = threading.Thread(target=self.trabajador)
        t2 = threading.Thread(target=self.controlador)
        t1.start()
        t2.start()
        t1.join(timeout=8)

# Ejecutar
ejercicio2 = CicloConClear()
ejercicio2.ejecutar()
