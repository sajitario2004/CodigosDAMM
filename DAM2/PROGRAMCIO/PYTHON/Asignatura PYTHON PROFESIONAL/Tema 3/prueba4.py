import threading

class VerificadorEstado:
    def __init__(self):
        self.evento = threading.Event()

    def verificar(self):
        estado = "activado" if self.evento.is_set() else "desactivado"
        print(f"[Verificador] El evento está {estado}.")

    def ejecutar(self):
        self.verificar()
        self.evento.set()
        self.verificar()

# Ejecutar
ejercicio4 = VerificadorEstado()
ejercicio4.ejecutar()
