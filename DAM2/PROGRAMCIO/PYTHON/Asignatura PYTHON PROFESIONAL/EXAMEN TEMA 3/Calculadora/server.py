"""
Docstring para Calculadora.server
- hacer una calculadora con posibilidad a varios usuarios
- hacer que cuando escriba ? que le salte un menu de como funciona la aplicacion
- el servidor envia un mensaje de bienvenida una vez 
- el servidor solo recive un mensaje con "'signo de la operacion o nombre de la operacion' numero1 numero2" esto se dividira con split()
este split() dividira el texto que reciva del usuario por espacios en un array tipo [operacion, numero1, numero2] y mediante eso el 
programa tiene que saber que hacer
- solo habra suma, resta, multiplicacion y division
- el ? te tiene que explicar como hacer una operacion: sum rest mult div

errores a los que hay que poner if o try:
- hay que controlar que el usuario no divida por 0
- operacion no valida
- las operaciones deben ser con numeros enteros
- parametros no validos
"""
import socketserver

HOST = "127.0.0.1"
PORT= 8085

class MySever(socketserver.ThreadingTCPServer):
    allow_reuse_address = True
    
class Handler(socketserver.BaseRequestHandler):
    
    def suma(self,a,b):
        respuesta = a+b
        return str(respuesta)
    def resta(self,a,b):
        respuesta = a-b
        return str(respuesta)
    def multi(self,a,b):
        respuesta = a*b
        return str(respuesta)
    def div(self,a,b):
        respuesta = a/b
        return str(respuesta)
    
    def help(self):
        return f"\nPara que el programa lea los datos debera introducirlos de la siguiente manera: \n 'operacion numero1 numero2', por ejmplo 'sum 2 2' devolvera 4\n 'sum' para suma\n 'rest' para resta\n 'multi' para multiplicacion\n 'div' para division\n Tambien se puede utilizar '+', '-', '*' y '/'\n tambien puede escribir 'salir' para salir \n"    
    
    def handle(self):
        print("servidor iniciado")
        mensage_menu = f"Bienvenido a la calculadoraServer de nacho \nIntroduce en el siguiente orden: operacion'espacio'num1'espacio'num2'\nTambien puede introducir '?' para pedir ayuda\n"
        self.request.sendall(mensage_menu.encode())
        while True:
            respuesta = self.request.recv(1024).decode().strip()
            
            if respuesta == "?":
                ayuda = self.help()
                self.request.sendall(ayuda.encode())
            elif respuesta == "salir":
                self.request.sendall("Saliendo del servidor".encode())
                break
            else:
                print("hola mundo")
                respuesta_split = respuesta.split()
                
                if len(respuesta_split) != 3:
                    self.request.sendall("Parametros no validos\n".encode())
                    continue
                
                try:
                    n1 = int(respuesta_split[1])
                    n2 = int(respuesta_split[2])
                    if respuesta_split[0] == "sum" or respuesta_split[0] == "+":
                    
                        self.request.sendall(f"{self.suma(n1,n2)}\n".encode())
                    elif respuesta_split[0] == "rest" or respuesta_split[0] == "-":

                        self.request.sendall(f"{self.resta(n1,n2)}\n".encode())
                    elif respuesta_split[0] == "multi" or respuesta_split[0] == "*":

                        self.request.sendall(f"{self.multi(n1,n2)}\n".encode())
                    elif respuesta_split[0] == "div" or respuesta_split[0] == "/":
                        
                        if n2 == 0:
                            self.request.sendall("No se puede dividir por 0\n".encode())
                        else:
                            self.request.sendall(f"{self.div(n1,n2)}\n".encode())
                    else:
                        self.request.sendall("Operacion u opcion no valida, escriba '?' para mas informacion\n".encode())
                        
                        
                except ValueError:
                    print("Valor no valido")
                    self.request.sendall("Parametros no validos".encode())
                
                
            


try: 
    server = MySever((HOST, PORT), Handler)
    server.serve_forever()
except KeyboardInterrupt:
    print("\n Cerrando el servidor.....")
except Exception as e:
    print(f"ha habido un error: {e}")