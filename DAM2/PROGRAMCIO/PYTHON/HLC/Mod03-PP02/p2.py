""" 
4-2.Animales: Piensa en al menos tres animales diferentes que tengan una característica común.
Almacene los nombres de estos animales en una lista y luego use un bucle for para
Imprime el nombre de cada animal.
• Modifique su programa para imprimir una declaración sobre cada animal, como A
El perro sería una gran mascota.
• Añade una línea al final de tu programa, indicando qué tienen estos animales en
común. Podrías imprimir una oración, como Cualquiera de estos animales
¡Haz una gran mascota!
"""

lista_animales = ['perro', 'gato', 'conejo']

for animal in lista_animales:
    if animal == 'perro':
        print(f"Un {animal} sería una gran mascota.")
    elif animal == 'gato':
        print(f"Un {animal} te araña.")
    else:
        print(f"Un {animal} sería una gran mascota.")

print("Cualquiera de estos animales ¡Haz una gran mascota!")
