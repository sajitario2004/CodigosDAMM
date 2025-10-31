"""
Realizar un programa python para realizar dicho cálculo de dicha ecuación de grado 3.
Los valores del resultado una vez sustituida la x se asignarán a la variable y.
a) Crea dicha fórmula y asignala a una variable y
b) simula el ejemplo para los valores siguientes de x: x = 0, x = 1 y x = -1 ( mostrar los
resultados por pantalla.
c) Realiza la conversión de dichos valores de x a flotante (número real), y realiza los
cálculos con ellos.
d) Solicita al usuario que introduzca el valor de x (valor real por parte del usuario ), y
muestra el valor de y (resultado de realizar los cálculos para obtener el resultado de
dicha ecuación ).
"""

x = int(input("Introduce el numero para la funcion\n"))

#ago una funcion que calcule 3x³-2x²+3x-1
def calc_fun(num):
    return ((3*x)**3-(2*x)**2+(3*x)-1)

print("la respuesta de x = ", x, " es ",calc_fun(x))