import random
import threading
import time 
 
class archivo_txt():
    
    def __init__(self):
        self.text = []
        self.lock1 = threading.Lock()
        self.lock2 = threading.Lock()
        self.condition = threading.Condition()
        
    def escribir(self, texto):
        with self.lock1:
            self.text.append(texto)
            time.sleep(1)
        
    def leer(self, numLinea):
        with self.lock2:
            print(self.text[numLinea])
            
    
        
    def cont_lineas(self):
        return self.text.__len__()
            
    def formatear(self):
        self.text=[]
        
        


class hilo_escritor(threading.Thread):
    def __init__(self, archivo_txt, num_hilo):
        super().__init__()
        self.archivo_txt = archivo_txt
        self.num_hilo = num_hilo
        
    def run(self):
        texto_final = f"hilo {self.num_hilo} esta escribiendo" 
        self.archivo_txt.escribir(texto_final)

archivo = archivo_txt()

while True:
    hilo1 = hilo_escritor(archivo, "0")
    for i in range(1,random.randint(1,20)):
        hilo1.start()
    
    hilo2 = hilo_escritor(archivo, "1")
    for i in range(1,random.randint(1,20)):
        hilo2.start()
    
    hilo3 = hilo_escritor(archivo, "2")
    for i in range(1,random.randint(1,20)):
        hilo3.start()
        
    hilo1.join()
    hilo2.join()
    hilo3.join()
    
    print("----LECTOR LEYENDO---")
    
    for i in range(0, int(archivo.cont_lineas())):
        archivo.leer(i)
    
    archivo.condition.notify_all()

    with archivo.condition.wait():
        print("----FIN DE LECTURA------")
    archivo.formatear()
    