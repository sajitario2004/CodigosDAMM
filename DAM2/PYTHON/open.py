import subprocess

# Lanzamos el comando ping
proceso = subprocess.Popen(
["ping", "-c", "5", "google.com"], # -c 5 = hacer 5 pings (Linux/Mac)
stdout=subprocess.PIPE, # Envía la salida hacia python.
stderr=subprocess.PIPE, # Envía la salida de error hacia python.
text=True #puede ser en modo texto o modo binario.
)

print("Haciendo ping en tiempo real...\n")

# Leemos línea por línea mientras el proceso sigue activo
numPing = 1
for linea in proceso.stdout:
    print(f"{numPing} >>", linea.strip())
    numPing+=1

print("\nPing terminado.")
