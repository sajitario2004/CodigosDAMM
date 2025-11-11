""" 
4-1.Pizzas: piensa en al menos tres tipos de tu pizza favorita. Guarde estos
nombres de pizza en una lista y luego use un bucle for para imprimir el nombre de cada pizza.
• Modifica tu bucle for para imprimir una oración usando el nombre de la pizza,
en lugar de imprimir solo el nombre de la pizza. Para cada pizza, debes
tener una línea de salida que contenga una declaración simple como Me gusta el pepperoni
pizza.
Agregue una línea al final de su programa, fuera del bucle for, que indique
cuánto te gusta la pizza. La salida debe constar de tres o más líneas.
sobre los tipos de pizza que te gustan y luego una oración adicional, como
¡Realmente amo la pizza!
"""

lista_pizzas = ['margarita', 'pepperoni', 'cuatro quesos']

for pizza in lista_pizzas:
    print(f"Me gusta la pizza de {pizza}.")

print("¡Realmente amo la pizza!")