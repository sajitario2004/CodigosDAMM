""" 
3-5. Cambio de lista de invitados: acaba de enterarse de que uno de sus invitados no puede asistir
cena, por lo que deberás enviar un nuevo conjunto de invitaciones. Tendrás que pensar en
alguien más a quien invitar.
• Comience con su programa del Ejercicio 3-4. Agregue una llamada print() al final de
su programa, indicando el nombre del invitado que no puede asistir.
• Modifica tu lista, reemplazando el nombre del huésped que no puede asistir con el
nombre de la nueva persona que estás invitando.
• Imprima un segundo conjunto de mensajes de invitación, uno para cada persona que aún esté en
tu lista.
"""

lista_cena = ['iker','jorge','Jay W. Forrester']

print(f"que paso compi soy {lista_cena[1]} y no podre asistir a tu cena")

lista_cena[1] = 'serena'

print(f"hola buenas {lista_cena[1]}, te vienes a cenar?")
