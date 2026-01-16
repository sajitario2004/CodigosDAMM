class CuentaBancaria:
    def __init__(self, nombre_cuenta, saldo):
        self.__nombre_cuenta = nombre_cuenta
        self.__saldo = saldo
        self.historial = []
        
    def mostrar_saldo(self):
        return self.__saldo
    
    def ingresar(self, cantidad):
        dic = {"operacion": "ingreso", "cantidad": cantidad}
        self.historial.append(dic)
        self.__saldo += cantidad
        
    def retirar(self, cantidad):
        if cantidad > self.__saldo:
            print("No se puede retirar esa cantidad dinero insuficiente")
        else: 
            dic = {"operacion": "retirada", "cantidad": cantidad}
            self.historial.append(dic)
            self.__saldo -= cantidad
            
    def mostrar_info(self):
        print(f"El nombre de la cuenta es: {self.__nombre_cuenta}")
        print(f"El saldo de la cuenta es: {self.__saldo}")
        print("Las operaciones hechas en la cuenta son:")
        for i in self.historial:
            print(f"\t{i}")

    def mostrar_historial(self):
        print("Las operaciones hechas en la cuenta son:")
        for i in self.historial:
            print(f"\t{i}")
            
    def get_nombre_cuenta(self):
        return self.__nombre_cuenta
    
    def set_nombre_cuenta(self, nombre_cuenta):
        self.__nombre_cuenta = nombre_cuenta
        
        
