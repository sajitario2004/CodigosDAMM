import subprocess

try:
    resultado = subprocess.run(["ls", "-l", "-a"], text=True, capture_output=True)
    print("Salida: ")
    print(resultado.stdout)
    print("Codigo de retorno", resultado.returncode)

except subprocess.CalledProcessError as e:
    print(e.output)