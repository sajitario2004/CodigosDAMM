"""
Crea un hilo que le pasemos dos numeros enteros n1 y n2 y escriba la secuencia comprendida
entre ambos numeros si n1 < n2
"""

import threading

suma = 0

n1 = 5
n2 = 15

def imprime_numeros(n1, n2):
    global suma    
    while (n1 <= n2):
        print(n1)
        n1 += 1
        suma+1



if (n1<n2): 
    hilo = threading.Thread(target=imprime_numeros, args=(n1,n2))
    hilo.start()
    hilo.join()
    print(suma)

# threading.current_thread().name nos dice el nombre de el hilo lectura/escritura
threading.current_thread().



