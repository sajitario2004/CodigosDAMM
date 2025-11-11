"""
3. Copiar listas (2 punto)
a) Define una lista con tus comidas favoritas. (0,4 puntos)
b) Haz una copia de la lista y añádele una comida distinta. (0,8 puntos)
c) Demuestra que son listas diferentes añadiendo elementos a ambas y
mostrando el resultado. (0,8 puntos)
"""

lista_comida = ['kebap', 'patatas fritas', 'espaguetis']

lista_nueva = lista_comida[:]
lista_nueva.append('pizza')


print("Esta es la lista antigua: ", lista_comida)
print("Esta es la lista nueva: ", lista_nueva)