import threading
import time

class EsperadorBasico:
    def __init__(self):
        self.evento = threading.Event()

    def trabajador(self):
        print("[Trabajador] Esperando señal...")
        self.evento.wait()
        print("[Trabajador] ¡Señal recibida!")

    def jefe(self):
        print("[Jefe] Preparando señal...")
        time.sleep(2)
        self.evento.set()
        print("[Jefe] Señal enviada.")

    def ejecutar(self):
        t1 = threading.Thread(target=self.trabajador)
        t2 = threading.Thread(target=self.jefe)
        t1.start()
        t2.start()
        t1.join()
        t2.join()

# Ejecutar
ejercicio1 = EsperadorBasico()
ejercicio1.ejecutar()
