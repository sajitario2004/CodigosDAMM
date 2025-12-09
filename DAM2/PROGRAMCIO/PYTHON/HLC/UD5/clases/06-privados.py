class Perro():
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.edad = edad
    
    def habla(self):
        print(f"mi nombre es {self.__nombre} y digo: miau")
        
        
    def __validar_cadena(self, cadena):
        return isinstance(cadena, str)  
    
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        if self.__validar_cadena(nombre):
            self.__nombre = nombre
            print("nombre cambiado")
            
            
   
    @classmethod
    def factory(cls):
        return cls("chanchito feliz", 4)
    
perro1 = Perro.factory()

perro1.habla()

perro1.set_nombre("MANOLO")

perro1.habla()