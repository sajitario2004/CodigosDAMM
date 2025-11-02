import subprocess

# Lanzamos el comando ping
proceso = subprocess.Popen(
["ping", "-c", "5", "google.com"], # -c 5 = hacer 5 pings (Linux/Mac)
stdout=subprocess.PIPE, # Envía la salida hacia python.
text=True #puede ser en modo texto o modo binario.
)

print("Haciendo ping en tiempo real...\n")

# Leemos línea por línea mientras el proceso sigue activo
numPing = 1
for linea in proceso.stdout:
    aux = linea.split("(")
    aux = aux[1].split(")")
    ip = aux[0]
    aux=linea.split(":")
    datos = aux[1]
    print(f"El servidor {ip} nos envia los datos {datos}")
print("\nPing terminado.")