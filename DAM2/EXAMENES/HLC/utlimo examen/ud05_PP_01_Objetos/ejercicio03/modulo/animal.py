class Animal:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad= edad
        
    def hablar(self):
        print("HACE UN SONIDO")
        
    def show_me(self):
        txt = f"El nombre es: {self.__nombre} y la edad es {self.__edad}"
        return txt
    
       
        