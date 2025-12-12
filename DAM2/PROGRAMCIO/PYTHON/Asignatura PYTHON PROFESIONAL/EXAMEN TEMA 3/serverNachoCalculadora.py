import socketserver


HOST = "0.0.0.0"
PORT = 8085

#ponemos alow_reuse_addres para que permita abri la calculador desde varios ordenadores
class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

#declaramos el handler que nos ayudara a que el ejercicio funcione
class Handler(socketserver.BaseRequestHandler):
    # funciones para hacer operaciones 
    def suma(self,a ,b):
        respuesta = a + b
        return str(respuesta)
        
    def resta(self,a ,b):
        respuesta = a - b
        return str(respuesta)
        
    def multi(self,a ,b):
        respuesta = a * b
        return str(respuesta)
        
    def div(self,a ,b):
        respuesta = a / b
        return str(respuesta)
    
    # funcion que te permite por si pregunta el usuario como funca esta servidor  
    def ayudaporfiplis(self):
        mensaje = f"'salir' para terminar\nsuma X Y\nresta X Y\ndiv X Y\nmult X Y\n"
        return mensaje
    
    # esto se inicia nada mas se crea el handler
    def handle(self):
        # Le envio a el usuario el mensaje por primera para explicarle como funca esto
        mensage_menu = f"Bienvenido a la calculadoraServer de nacho \nIntroduce en el siguiente orden: operacion num1 num2'\nTambien puede introducir '?' para pedir ayuda sobre como funca esto\n"
        self.request.sendall(mensage_menu.encode())
        # Entramos en un bucle que va a permitir que el usuario haga operaciones ata que escriba salir
        while True:
            self.request.sendall(f"Para mas informacion escribre '?'\nIntroduce una operacion:\n".encode())
            respuesta = self.request.recv(1024).decode().strip()
            
            #por si el usuario escribe el signo de interrogacion que se le muestre todo el contenido
            if respuesta == "?":
                ayuda = self.ayudaporfiplis()
                self.request.sendall(ayuda.encode())
            # si escribre salir vamonos que nos vamos
            elif respuesta == "salir":
                self.request.sendall("Saliendo del servidor".encode())
                break
            # si el usuario no ha escrito ninguna de las anteriores empezamos con las operaciones
            else:
                #print("hola mundo")
                respuesta_split = respuesta.split()
                
                # comprobamos que la respuesta del usuario despues de splitearla sea de tamaño 3
                # esto por si le da por escribir ma de 3 palabras o menos de 3, 
                # si funciona la aplicacion continua si no vuelta a empezar el bucle
                if len(respuesta_split) != 3:
                    self.request.sendall("Valores no validos compi, pulse '?' para aprender el funcionamiento\n".encode())
                    continue
                
                # le damos un try a parsear los valores a numero entero por si
                # al usuario le da por escribir lola flores
                try:
                    n1 = int(respuesta_split[1])
                    n2 = int(respuesta_split[2])
                    if respuesta_split[0] == "suma" or respuesta_split[0] == "+":
                    
                        self.request.sendall(f"{self.suma(n1,n2)}\n".encode())
                    elif respuesta_split[0] == "resta" or respuesta_split[0] == "-":

                        self.request.sendall(f"{self.resta(n1,n2)}\n".encode())
                    elif respuesta_split[0] == "mult" or respuesta_split[0] == "*":

                        self.request.sendall(f"{self.multi(n1,n2)}\n".encode())
                    elif respuesta_split[0] == "div" or respuesta_split[0] == "/":
                        # comprobacion por si el usuario quiere dividir por 0
                        if n2 == 0:
                            self.request.sendall("No se puede dividir por 0\n".encode())
                        else:
                            self.request.sendall(f"{self.div(n1,n2)}\n".encode())
                            
                    #esto es una comprobacion por si al usuario le da un hamacuco y escribe un valor que ni yo preveeo
                    else:
                        self.request.sendall("Operacion u opcion no valida, escriba '?' para mas informacion\n".encode())
                                             
                except:
                    # print("funciona porfa")
                    self.request.sendall("Error: Las operaciones deben ser con números enteros\n".encode())
                
    
try: 
    server = MyServer((HOST, PORT), Handler)
    server.serve_forever()
except KeyboardInterrupt:
    print("\n Hiciste Ctrl+C lo mas seguro asi que cerramos el servidor.....")
except Exception as e:
    print(f"ha habido un error: {e}")