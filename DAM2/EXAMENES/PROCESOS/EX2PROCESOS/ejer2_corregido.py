import threading
import time
import random

class ArchivoTXT:
    def __init__(self):
        self.text = []
        self.lock = threading.Lock()

    def escribir(self, texto):
        with self.lock:
            self.text.append(texto)
            time.sleep(0.1)

    def leer(self, numLinea):
        with self.lock:
            print(self.text[numLinea])

    def cont_lineas(self):
        return len(self.text)

    def formatear(self):
        with self.lock:
            self.text.clear()

class HiloEscritor(threading.Thread):
    def __init__(self, archivo, id_hilo):
        super().__init__()
        self.archivo = archivo
        self.id_hilo = id_hilo

    def run(self):
        texto = f"Hilo {self.id_hilo} está escribiendo"
        self.archivo.escribir(texto)

archivo = ArchivoTXT()

while True:

    hilos = []
    for id_hilo in range(3):
        for _ in range(random.randint(1, 5)):
            h = HiloEscritor(archivo, id_hilo)
            hilos.append(h)
            h.start()

    for h in hilos:
        h.join()

    print("---- LECTOR LEYENDO ---")
    for i in range(archivo.cont_lineas()):
        archivo.leer(i)

    print("---- FIN DE LECTURA ---")
    archivo.formatear()

    time.sleep(1)
