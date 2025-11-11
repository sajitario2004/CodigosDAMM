"""
2. Slicing de listas (2 punto)
a) Muestra los tres primeros elementos de una lista de números del 1 al 10.
(0,6 puntos)
b) Muestra los tres últimos elementos de esa lista. (0,6 puntos)
c) Muestra los elementos del índice 4 al 7. (0,8 puntos)
"""

lista_num= []

[lista_num.append(i) for i in range(1,11)]

print("Muestra los 3 ultimos: ",lista_num[-3:])
print("Muestra los elementos entre el 4 y el 7", lista_num[3:7])


