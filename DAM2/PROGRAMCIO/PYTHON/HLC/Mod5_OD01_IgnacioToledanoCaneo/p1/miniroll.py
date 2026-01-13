
class Personaje:

    def __init__(self, nombre, vida, ataque, defensa):
        self.nombre=nombre
        self.vida = vida
        self.ataque = ataque
        self.defensa = defensa
        self.__vida_original= 100

        
    def atacar(self, enemigo):
        if self.vida == 0:
            print("Estas muerto no puedes atacar")
            if enemigo.esta_vivo():
                if enemigo != self:
                    cantidad_danio = enemigo.vida - enemigo.defensa
                    enemigo.recibir_danio(cantidad_danio)
                else:
                    print("no te puedes atacar a ti mismo cazurro")
            else:
                print(f"El enemigo {enemigo.nombre} esta muerto, no le puedes atacar")
            
    def recibir_danio(self,cantidad):
        if self.vida < cantidad:
            self.vida = 0
            print("has muerto")
        else:
            self.vida -= cantidad
            
    def esta_vivo(self):
        if self.vida == 0:
            return False
        return True