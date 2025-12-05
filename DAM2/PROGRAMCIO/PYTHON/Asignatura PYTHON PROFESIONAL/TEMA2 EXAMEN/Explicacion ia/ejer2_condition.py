import threading
import time
import random

class Buffer:
    def __init__(self):
        self.items = []
        self.cond = threading.Condition()

    def producir(self, item):
        with self.cond:
            self.items.append(item)
            self.cond.notify()  # despierta a un consumidor

    def consumir(self):
        with self.cond:
            while not self.items:
                self.cond.wait()  # espera hasta que haya items
            return self.items.pop(0)

class Prod(threading.Thread):
    def __init__(self, buf): super().__init__(); self.buf = buf
    def run(self):
        for i in range(5):
            time.sleep(random.random())
            self.buf.producir(i)
            print("Producido", i)

class Cons(threading.Thread):
    def __init__(self, buf): super().__init__(); self.buf = buf
    def run(self):
        for _ in range(5):
            item = self.buf.consumir()
            print("Consumido", item)

b = Buffer()
p = Prod(b); c = Cons(b)
p.start(); c.start()
p.join(); c.join()
