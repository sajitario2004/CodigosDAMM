import subprocess
try:
    resultado = subprocess.run(["ls","-l"],text=True,capture_output=True)
    print("salida")
    print(resultado.stdout)
    print("Codigo de retorno" , resultado.returncode)
except subprocess.CalledProcessError as e:
    print(e.output)
             