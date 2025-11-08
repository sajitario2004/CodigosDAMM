""" 
3-8.Ver el mundo: piensa en al menos cinco lugares del mundo que te gustarían
para visitar.
• Almacenar las ubicaciones en una lista. Asegúrese de que la lista no esté en orden alfabético.
• Imprima su lista en su orden original. No se preocupe por imprimir la lista de forma ordenada;
simplemente imprímalo como una lista de Python sin formato.
• Utilice sorted() para imprimir su lista en orden alfabético sin modificar el
lista real.
• Demuestre que su lista todavía está en su orden original imprimiéndola.
• Utilice sorted() para imprimir su lista en orden alfabético inverso sin cambiar
el orden de la lista original.
• Demuestre que su lista todavía está en su orden original imprimiéndola nuevamente.
• Utilice reverse() para cambiar el orden de su lista. Imprima la lista para mostrar que
El orden ha cambiado.
• Utilice reverse() para cambiar el orden de su lista nuevamente. Imprime la lista para mostrar
ha vuelto a su orden original.
• Utilice sort() para cambiar su lista para que se almacene en orden alfabético. Imprime el
lista para mostrar que su orden ha sido cambiado.
• Utilice sort() para cambiar su lista para que se almacene en orden alfabético inverso.
Imprima la lista para mostrar que su orden ha cambiado.
"""

lista_lugares = ['Nueva York', 'Amsterdam', 'Rio de janeiro', 'Japon', 'Maiami']
print(f"la lista sin estar en orden original: \n {lista_lugares} \n")

#este solo almacena en una variable,vamos que hace un return de la lista cambiada
lista_alfabetica1 = sorted(lista_lugares)
print(f"la lista con orden alfabetico: \n {lista_lugares}\n")

lista_lugares.reverse()
print(f"la lista con orden inverso es: \n {lista_lugares}\n")

lista_lugares.reverse()
print(f"lista otra vez invertida para volver a su orden original: \n {lista_lugares}\n")

lista_lugares.sort()
print(f"lista en orden alfabetico: \n {lista_lugares}\n")

lista_lugares.sort(reverse=True)
print(f"lista con orden alfabetico inverso: \n {lista_lugares}\n")




