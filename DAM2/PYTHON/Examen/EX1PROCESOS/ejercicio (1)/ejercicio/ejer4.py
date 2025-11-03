'''
    Escribe un programa en Python, ejer4.py, que:
    ◦ Usa el comando de linux md5sum que saca el hash de un archivo. El hash es un número único que si el archivo no cambia es siempre igual. Cualquier cambio provocará un  cambio en el número. 
    ◦ Pide una cadena de texto, le realiza el md5sum, usando subprocess.Popen y lo muestra por pantalla.
    ◦ El programa sigue pidiendo una nueva frase y realizando lo dicho en el segundo punto hasta que se para con la cadena ‘salir’.
'''
import subprocess

#while True:
    #input1 = input("dime la frase")
    #proceso = subprocess.Popen(["md5sum"])