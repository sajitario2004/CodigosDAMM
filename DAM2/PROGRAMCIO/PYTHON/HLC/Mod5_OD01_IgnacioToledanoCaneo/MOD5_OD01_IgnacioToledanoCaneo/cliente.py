from cuenta_bancaria import CuentaBancaria

class Cliente:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cuentas_bancarias = []

    # Agrega una cuenta bancaria
    def agregar_cuenta(self, cuenta):
        self.cuentas_bancarias.append(cuenta)
    
    
            
def main():
    if __name__ == "__main__":
        cliente1 = Cliente 