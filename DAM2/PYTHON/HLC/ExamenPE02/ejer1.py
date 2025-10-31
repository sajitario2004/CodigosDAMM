"""
a) Crea las variables necesarias
b) Solicita los valores de a y b al usuario.
c) realiza las conversiones de tipos necesarias
d) Simula el ejemplo para los siguienes valores de a y b:
a = 4 y b = 9
a = 23 y b = 12
e) Muestra los resultados por consola usando print de dichos cálculos (mostrar el valor
de c)
"""
import math
a = int(input("introduce a"))
b = int(input("introduce b"))
#calculo con math sqrt la raiz cuadrada
c = math.sqrt((a**2)+(b**2))
print("la respuesta es ",c)