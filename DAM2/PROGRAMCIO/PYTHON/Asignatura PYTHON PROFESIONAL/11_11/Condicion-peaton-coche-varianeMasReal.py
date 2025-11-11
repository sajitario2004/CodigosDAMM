import time
import random
import threading

class Cruce:
    def __init__(self):
        self.condition = threading.Condition()
        self.peatones_cruzando=0
        self.peatonesEnCruce=[]
        self.cochesEnCruce=[]
        self.coches_cruzando=0

def coche(numCoche, cruce):
    print(f"Llega el coche {numCoche}")
    