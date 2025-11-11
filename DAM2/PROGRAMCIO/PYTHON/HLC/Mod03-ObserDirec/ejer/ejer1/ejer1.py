"""
1. Manipulación básica de listas (2 punto)
a) Crea una lista con 5 nombres de personas. (0,2 puntos)
b) Añade dos nombres más a la lista. (0,2 puntos)
c) Imprime todos los nombres usando un bucle for. (0,3 puntos)
d) Elimina el tercer nombre de la lista y vuelve a mostrar la lista. (0,3 puntos)
"""

lista_personas = ['angel', 'serena', 'labubu', 'dario', 'nacho']

lista_personas.append('noah')
lista_personas.append('ivan')

[print(persona) for persona in lista_personas]
    
