import threading
#import time 

class medidor (threading.Thread):
    """
    def metodo para inicializar la clas:
        variable para el tipo
        variable para el ancho
        variable para el alto
        variable resultado donde voya a devolver la superficie

    def donde se ejecuta el codigo
        si es un rectangulo en el resultado la superficie de un rectangulo
        sino devuelvo la superficie del triangulo

    creo 4 objetos de tipo hilo y le pado el tipo de superficie que va a medir y la medida.
    Mi programa principal espera a que todos lo0s hilos terminen y suma las superficies de cada hilo y pone ese suma.
    """
    def __init__ (self, tipo, ancho, alto):
        super().__init__()
        self.tipo = tipo
        self.ancho = ancho
        self.alto = alto
        self.superficie = 0

    def run(self):
        if self.tipo == "cuadrado":
            self.superficie=self.ancho*self.alto
        if self.tipo == "triangulo":
            self.superficie=(self.ancho*self.alto)/2

f1 = medidor("cuadrado")
