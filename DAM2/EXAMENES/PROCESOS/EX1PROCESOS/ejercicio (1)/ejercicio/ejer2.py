'''
Crea un program en python que haga lo siguiente:
Pregunte por un directorio. Si se quiere listar el directorio actual no se introduce nada
El programa debe reportar cuando el directorio no es correcto por fallo del usuario.
No vale contar ni '.' ni '..' que son el directorio actual y el padre.
'''
import subprocess

input0 = input("desea listar el directorio actual. SI / NO\n")

if input0.lower() == "no":
    input1 = input("dime el directorio\n")

    try:
        resultado = subprocess.run(["ls","-a",input1],text=True,capture_output=True)
        print(resultado.stdout)
    except:
        print("la ruta no es valida")
else:
    resultado = subprocess.run(["ls", "-a"],text=True,capture_output=True)
    print(resultado.stdout)