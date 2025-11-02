import subprocess
import urllib.parse

termino = input("Ingrese el termino de busqueda")
termino_codificado = urllib.parse.quote(termino)
url = f"https://www.google.com/search?q=(termino_codificado)"

subprocess.run("xdg-open",url)

print("El navegador se ha abierto en un proceso hijo")