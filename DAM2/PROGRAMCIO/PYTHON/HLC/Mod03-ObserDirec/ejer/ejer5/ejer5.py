"""
5. List comprehensions (1 punto)
a) Crea una lista de los cuadrados de los 10 primeros números naturales
usando list comprehension. (0,4 puntos)
b) Genera una lista de cubos entre 1 y 10 con list comprehension. (0,3 puntos)
c) Muestra ambas listas. (0,3 puntos)
"""

lista_cuadrados = []
[lista_cuadrados.append(i**2) for i in range(1,11)]

lista_cubos = []
[lista_cubos.append(i**3) for i in range(1,11)]

print(f"Aqui tienes la lista 1: {lista_cuadrados}\nAqui tienes la lista 2: {lista_cubos}")