#####
#Crear 5 procesos hijos usando os.fork()
#Cada hijo debe:
#   -Calcular la suma del os numeros del 1 al N, donde N = PID del hijo % 1000(para variar los numeros)
#   -Imprimir us PID y el resultado de la suma
#   -Terminar correctamente (os.exit)
#El padre debe :
#   -Imprimir un mensaje cada vez que crea un hijo: "Creando hijo con PID x"
#   -Esperar a que todos los hijos terminen
#   -Imprimir todos lso hinjos han terminado
####

import os

