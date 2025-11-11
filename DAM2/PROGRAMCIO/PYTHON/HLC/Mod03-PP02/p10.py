""" 
4-10. Slices: utilizando uno de los programas que escribió en este capítulo, agregue varios
líneas al final del programa que hacen lo siguiente:
• Imprimir el mensaje Los primeros tres elementos de la lista son:. Luego use una rebanada para
imprima los primeros tres elementos de la lista de ese programa.
• Imprimir el mensaje Tres elementos del medio de la lista son:. Luego usa un
corte para imprimir tres elementos desde el medio de la lista.
• Imprimir el mensaje Los últimos tres elementos de la lista son:. Luego use una rebanada para
Imprima los últimos tres elementos de la lista.
"""

lista_pizzas = ['margarita', 'pepperoni', 'cuatro quesos', 'hawaiiana', 'vegetariana', 'barbacoa', 'cuatro estaciones']
print("Los primeros tres elementos de la lista son:")
for pizza in lista_pizzas[:3]:
    print(pizza)


print("\nTres elementos del medio de la lista son:")
if len(lista_pizzas) % 2 == 0:
    for pizza in lista_pizzas[int(len(lista_pizzas)/2-1):int(len(lista_pizzas)-1)]:
        print(pizza)
else:
    for pizza in lista_pizzas[int(len(lista_pizzas)/2):int(len(lista_pizzas)-1)]:
        print(pizza)


print("\nLos últimos tres elementos de la lista son:")
for pizza in lista_pizzas[-3:]:
    print(pizza)


    