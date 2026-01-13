class CuentaBancaria:
    def __init__(self, titular, saldo):
        self.titular = titular
        self.__saldo = saldo
    
    def mostrar_saldo(self):
        print(f"Saldo actual: {self.__saldo}.")
        
cuenta1 = CuentaBancaria("Nacho", 100)

cuenta1.mostrar_saldo()

print(f"{cuenta1.__saldo}")