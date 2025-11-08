""" 
3-10. Cada función: piensa en cosas que podrías almacenar en una lista. Por ejemplo, tu
Podrías hacer una lista de montañas, ríos, países, ciudades, idiomas o cualquier cosa.
más te gustaría. Escriba un programa que cree una lista que contenga estos elementos y
luego utiliza cada función introducida en este capítulo al menos una vez.
"""
import random


lista_paises = ['España', 'Alemania', 'Estados Unidos', 'Rusia', 'China']

def lista_reversed():
    global lista_paises
    lista_paises.reverse()
    return lista_paises

def eliminar_pais_random():
    global lista_paises
    lista_paises.pop(random.randint(0, (len(lista_paises)-1)))
    return lista_paises

print(f"La lista de paises es la siguiente: \n{lista_paises}\n pero yo vivo en {lista_paises[0]}\n",
      f"Aqui estaria la lista de los paises ordenada alfabeticamente \n{sorted(lista_paises)}\n",
      f"Asi se veria la lista invertida \n{lista_reversed()}\n",
      f"Y la cantidad de paises que hay en la lista es de {len(lista_paises)}\n",
      f"Aunque como no me gusta un pais lo voy a eliminar\n {eliminar_pais_random()}")

