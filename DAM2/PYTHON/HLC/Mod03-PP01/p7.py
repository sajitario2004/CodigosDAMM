""" 
3-7. Lista de invitados cada vez más reducida: acaba de descubrir que su nueva mesa no funcionará
Llegue a tiempo para la cena y ahora tendrá espacio para solo dos invitados.
• Comience con su programa del Ejercicio 3-6. Agregue una nueva línea que imprima un
mensaje que dice que solo puedes invitar a dos personas a cenar.
• Utilice pop() para eliminar invitados de su lista uno a la vez hasta que solo queden dos.
Los nombres permanecen en su lista. Cada vez que saque un nombre de su lista, imprima un
mensaje a esa persona haciéndole saber que lamentas no poder invitarla
a cenar.
• Imprima un mensaje para cada una de las dos personas que aún están en su lista, permitiéndoles
Sé que todavía están invitados.
• Utilice del para eliminar los dos últimos nombres de su lista, de modo que tenga un espacio vacío.
lista. Imprima su lista para asegurarse de tener una lista vacía al final de
su programa.
"""
import p6

import random

lista = p6.lista_cena

print(f"\nsolo poder invitar a 2 invitados de la lista anterior")

#elimino de manera aleatoria a personas asta que solo quedan 2
while (len(lista) != 2):
    lista.pop(random.randint(0, (len(lista)-1)))

print(f"Los unicos 2 invitados son {lista[0]} y {lista[1]}")