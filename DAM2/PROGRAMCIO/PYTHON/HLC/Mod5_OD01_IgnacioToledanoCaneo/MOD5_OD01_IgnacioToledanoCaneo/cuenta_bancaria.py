class CuentaBancaria:
    # Constructor que contrulle la cuenta bancaria
    def __init__(self,nombre_cuenta ,titular, saldo):
        self.nombre_cuenta= nombre_cuenta
        self.titular=titular
        self.__saldo=saldo
        self.movimientos = Movimientos()
    
    # Metodo de depositar en la cuenta
    def depositar(self, cantidad):
        self.movimientos.depo(cantidad, self.__saldo)
    
    # Metodo de retirada en la cuenta
    def retirar(self, cantidad):
        self.movimientos.reti(cantidad, self.__saldo)
    
    # Mostrar el saldo de la cuenta
    def mostrar_saldo(self):
        print(f"Su saldo es {self.__saldo}")

    # Muestra una todos los movimientos de la cuenta linea a linea y tabulado
    def mostrar_movimientos(self):
        print(f"Lista de movimientos de {self.titular}:")
        for i in self.movimientos.movimientos:
            print(f"\t{i}")
    
    # Metodos ToString
    def __str__(self):
        return f"nombre de la cuenta:{self.nombre_cuenta}\ntitular:{self.titular}\nsaldo:{self.__saldo}"
    
#Clase para almacenar movimientos en una lista de diccionarios
class Movimientos:
    def __init__(self):
        self.movimientos = []
        
    def depo(self, cantidad, saldo_actual):
        saldo_actual += cantidad
        self.movimientos.append({"tipo":"deposito", "cantidad":cantidad, "saldo actual":saldo_actual})
    
    def reti(self, cantidad, saldo_actual):
        if cantidad>saldo_actual:
            print("\nNo se puede hacer la operacion, saldo insuficiente.")
        else:
            saldo_actual -= cantidad
            self.movimientos.append({"tipo":"retirada", "cantidad":cantidad, "saldo actual":saldo_actual})
  