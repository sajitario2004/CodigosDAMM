"""
Realizar un programa python para el Cálculo de la superficie de un cuadrado
conociendo uno de sus lados.
La superficie se calcula de la siguiente forma: superficie = lado x lado
a) usar las variables necesarias
b) solicitar al usuario que introduzca el valor del lado del cuadrado
c) crear una variable con la fórmula del cálculo de la superficie
d) mostrar por pantalla el valor calculado de la superficie
"""
print("vamos a calcular el area de un cuadrado")
#pedimos al usuario los lados
lado1 = int(input("dime el tamaño del lado 1\n"))
lado2 = int(input("dime el tamaño del lado 2\n"))

print("El are del cuadrado es ", (lado1*lado2))#tambien se puede hacer con "superficie = lado1*lado2" y imprimir superficie