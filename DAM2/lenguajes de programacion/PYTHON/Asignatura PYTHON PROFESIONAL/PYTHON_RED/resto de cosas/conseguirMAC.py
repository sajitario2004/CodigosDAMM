import subprocess

salida = subprocess.Popen(["ip", "a"], stdout=subprocess.PIPE, text=True)
for linea in salida.stdout:
    if linea[0].isdigit():
        if int (linea[0])>1:
            aux = linea.split(":")
            interfaz = aux[1]
    elif linea.find("link/ether")>-1:
        aux = linea.split("link/ether")
        aux = aux[1].split("brd")
        print(f"{interfaz} : {aux[0]}")