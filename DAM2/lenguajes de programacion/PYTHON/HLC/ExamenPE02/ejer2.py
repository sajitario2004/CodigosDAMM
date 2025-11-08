"""
a) crear las variables necesarias para crear dichos cálculos
b) usar la función round con dos decimales para mostrar resultados de millas y
kilómetros convertidos
"""

print("elige; \n",
      "1. de millas a kilometros\n",
      "2. de kilometros a millas\n")

km = 12.25
mll = 7.61

eleccion = input()
if eleccion == "1":
    a = float(input("introduce las millas\n"))
    #calculo de millas a kilometros
    respuesta = a*mll/km
elif eleccion == "2":
    a = float(input("introduce los kilometros\n"))
    #calculo de kilometros a millas
    respuesta = a*km/mll
else:
    print("opcion no valida")

print(respuesta)