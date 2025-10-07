import subprocess

proceso = subprocess.Popen(
    ["ping", "-c", "4", "www.google.com"],
    stdout=subprocess.PIPE,
    stderr=subprocess.PIPE,
    text=True
)

print("haciendo ping a la pagina web")

numPing = 1
for linea in proceso.stdout:
    print(f"{numPing}>>", linea.strip())
    numPing += 1

