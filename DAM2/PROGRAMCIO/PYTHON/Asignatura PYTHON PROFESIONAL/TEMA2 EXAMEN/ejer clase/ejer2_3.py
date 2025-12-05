import threading

def mostrar_secuencia(n1, n2):
    if n1 < n2:
        for i in range(n1, n2 + 1):
            print(i, end=" ")
        print()  # Salto de línea
    else:
        print("Error: n1 no es menor que n2")

# --- Programa principal ---
n1 = 3
n2 = 10

# Creamos el hilo, pasándole n1 y n2
hilo = threading.Thread(target=mostrar_secuencia, args=(n1, n2))

# Mostramos desde el hilo principal la resta
print(f"Resultado de la resta (n2 - n1): {n2 - n1}")

# Iniciamos el hilo
hilo.start()

# Esperamos a que finalice
hilo.join()

print("Fin del programa")
