""" 
3-6. Más invitados: Acabas de encontrar una mesa más grande, por lo que ahora hay más espacio
disponible. Piensa en tres invitados más para invitar a cenar.
• Comience con su programa del Ejercicio 3-4 o 3-5. Agregue una llamada print() al
final de su programa, informando a la gente que encontró una mesa más grande.
• Utilice insert() para agregar un nuevo invitado al principio de su lista.
• Utilice insert() para agregar un nuevo invitado al medio de su lista.
• Utilice append() para agregar un nuevo invitado al final de su lista.
• Imprima un nuevo conjunto de mensajes de invitación, uno para cada persona de su lista.
"""
lista_cena = ['iker','serena','Jay W. Forrester']

def insertar_al_principio(lista, persona):
    lista.insert(0, persona)
    return lista

def insertar_al_medio(lista, persona):
    lista.insert(int(len(lista)/2), persona)
    return lista

def insertar_al_final(lista, persona):
    lista.append(persona)
    return lista

lista_cena = insertar_al_principio(lista_cena, 'mario')
lista_cena = insertar_al_medio(lista_cena, 'tomy')
lista_cena = insertar_al_final(lista_cena, 'profe santana')


print(f"Los invitados actuales son:\n {lista_cena}")