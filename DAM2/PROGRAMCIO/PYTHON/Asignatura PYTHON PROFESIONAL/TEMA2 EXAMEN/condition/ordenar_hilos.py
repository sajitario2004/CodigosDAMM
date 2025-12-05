import threading

class Ordenador:
    def __init__(self):
        self.cond = threading.Condition()
        self.turno = 0

    def esperar_turno(self, mi_turno):
        with self.cond:
            while self.turno != mi_turno:
                self.cond.wait()
            # hago mi trabajo
            print("Hilo", mi_turno, "ejecuta")
            self.turno += 1
            self.cond.notify_all()
