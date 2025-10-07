import subprocess

while True:
    texto = input("Escribe algo o 'salir' para terminar")

    if texto.lower() == "salir":
        print("Saliendo...")
        break

    try:
        proceso=subprocess.Popen(['tr "a-z" "A-Z"'],
                                stdin=subprocess.PIPE,
                                stdout=subprocess.PIPE,
                                stderr=subprocess.PIPE)
        
        salida, error = proceso.communicate(input=texto.encode())
        if proceso.returncode == 0:
            print("Salida:", salida.decode().strip())
        else:
            print("Error:", error.decode().strip())
    except Exception as e:
        print("Ocurrió un error:", str(e))
    except FileNotFoundError:
        print("El comando no se encontró. Asegúrate de que 'tr' esté instalado y disponible en tu sistema.")