import threading, time, random

class Recurso:
    def __init__(self, max_conn):
        self.sem = threading.Semaphore(max_conn)

    def usar(self, id):
        with self.sem:
            print(f"{id} entra")
            time.sleep(random.uniform(0.1,0.4))
            print(f"{id} sale")

rec = Recurso(3)
hilos = [threading.Thread(target=rec.usar, args=(i,)) for i in range(8)]
for h in hilos: h.start()
for h in hilos: h.join()
