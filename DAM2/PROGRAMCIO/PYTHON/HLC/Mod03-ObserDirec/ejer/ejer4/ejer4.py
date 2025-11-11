"""
4. Listas numéricas y función range (2 punto)
a) Crea una lista de números del 1 al 20 usando la función range. (0,6 puntos)
b) Genera una lista con los múltiplos de 3 entre 1 y 30. (0,6 puntos)
c) Muestra los números pares de la lista usando slicing. (0,8 puntos)
"""

lista_num=[]
[lista_num.append(i) for i in range(1,21)]
print("Esta es la lista del 1 al 20: ")

#b
lista_num2= []
for i in range(1,31):
    if i %3 == 0:
        lista_num2.append(i) 
print(lista_num2)

#c
lista_aux=lista_num2[1::2]
print(lista_aux)

"""
lista_aux2 = []
for num in lista_aux:
    if num % 2:
        lista_aux2.append()

print(lista_aux2)
"""
