
def make_car(fabricante, modelo, **caracteristicas):
    caracteristicas["fabricante"] = fabricante  
    caracteristicas["modelo"] = modelo
    
    return caracteristicas

car1 = make_car("subaru", "outback", color="marron", motor="v8")
car2 = make_car("308", "peugeot", color="rojo", kilometraje="34.000")

print(car1)
print(car2)