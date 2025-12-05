import threading
import time

class printeador(threading.Thread):
    def __init__(self, texto):
        super().__init__()
        self.texto = texto

    def run(self):
        for i in range(1,20):
            print(self.texto)
        print(f"final de {threading.enumerate}")

p1 = printeador("hola soy hilo1")
p2 = printeador("hola soy hilo2")

p1.start()
p1.join()

p2.start()
p2.join()
