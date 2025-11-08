import threading
import time
def hilo():
    for i in range(10):
        print("hilo no daemon foregroud")
        time.sleep(1)

t = threading.Thread(target=hilo)
t.daemon = False
t.start()

print("hilo principal")