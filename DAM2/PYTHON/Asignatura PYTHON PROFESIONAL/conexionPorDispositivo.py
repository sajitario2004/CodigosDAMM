import subprocess
import urllib.parse

termino = input("Ingrese el termino a buscar: ")
termino_codificado = urllib.parse.quote(termino)
url = f"https://www.google.com/search?q={termino_codificado}"


comando = ["xdg-open", url]
subprocess.run(comando)

print("Comando ejecutado")
