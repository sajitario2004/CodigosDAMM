import threading

class BoundedBuffer:
    def __init__(self, capacity):
        self.buf = []
        self.cap = capacity
        self.cond = threading.Condition()

    def put(self, item):
        with self.cond:
            while len(self.buf) >= self.cap:
                self.cond.wait()      # espera espacio
            self.buf.append(item)
            self.cond.notify_all()   # notifica productores y consumidores

    def get(self):
        with self.cond:
            while not self.buf:
                self.cond.wait()      # espera items
            item = self.buf.pop(0)
            self.cond.notify_all()
            return item
