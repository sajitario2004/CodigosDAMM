import threading
import time
import random

lock_print = threading.Lock()

class BaseDatos:
    def __init__(self, conexiones):
        self.semaforo = threading.Semaphore(conexiones)

    def consulta(self, usuario):
        if self.semaforo.acquire(blocking=False):
            with lock_print:
                print(f"-> {usuario} usando conexión a la base de datos")
        else:
            with lock_print:
                print(f"!! {usuario} esperando conexión")
            self.semaforo.acquire()
            with lock_print:
                print(f"-> {usuario} ahora usando conexión")
        
        time.sleep(random.randint(1,3))
        with lock_print:
            print(f"<- {usuario} liberó conexión")
        self.semaforo.release()

class Usuario(threading.Thread):
    contador = 1
    lock_contador = threading.Lock()

    def __init__(self, db):
        super().__init__()
        self.db = db
        with Usuario.lock_contador:
            self.nombre = f"Usuario-{Usuario.contador}"
            Usuario.contador += 1

    def run(self):
        self.db.consulta(self.nombre)

if __name__ == "__main__":
    db = BaseDatos(3)
    while True:
        u = Usuario(db)
        u.start()
        time.sleep(random.randint(1,2))
