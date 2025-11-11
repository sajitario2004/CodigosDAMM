"""
6. Estadística básica con listas (1 punto)
a) Calcula el mínimo, máximo y suma de una lista de números enteros. (0,3
puntos)
b) Crea una lista de 10 números aleatorios y realiza los cálculos. (0,3 puntos)
c) Muestra los resultados en formato “El mínimo es X, el máximo es Y, la suma
es Z”. (0,4 puntos)
"""

import random

lista_num = [] 
[lista_num.append(random.randint(1,100)) for i in range(1,11)]

lista_num.sort()
num_max = lista_num[-1:]
num_min = lista_num[0]

print(f"El numero minimo es {num_min} y el numero maximo es {num_max}\n la lista es: {lista_num}")

