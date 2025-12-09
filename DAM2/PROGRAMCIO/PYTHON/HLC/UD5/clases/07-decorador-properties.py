class Perro():
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.edad = edad
    
    def habla(self):
        print(f"mi nombre es {self.__nombre} y digo: miau")
        
        
    def __validar_cadena(self, cadena):
        return isinstance(cadena, str)  
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre):
        if self.__validar_cadena(nombre):
            if nombre.strip():
                self.__nombre = nombre
                print("nombre cambiado")
   
    @classmethod
    def factory(cls):
        return cls("chanchito feliz", 4)
    
    
perro = Perro("Choclo", 5)

print(perro)