import threading

class figura(threading.Thread):
    
    def __init__(self,tipo,ancho,alto):
        super().__init__()
        self.tipo=tipo
        self.ancho=ancho
        self.alto=alto
        self.superficie=0
        
    def run(self):
        if self.tipo=="cuadrado":
            self.superficie=self.ancho*self.alto
        elif self.tipo=="triangulo":
            self.superficie=(self.ancho*self.alto)/2.0
            

f1 = figura("triangulo", 10,12)
f1.start()     
f2=figura("cuadrado",8,12)
f2.start()
f3=figura("cuadrado",6,5)
f3.start()
f4=figura("triangulo",2,5)
f4.start()

f1.join()
f2.join()
f3.join()
f4.join()

print(f1.superficie+f2.superficie+f3.superficie+f4.superficie)

