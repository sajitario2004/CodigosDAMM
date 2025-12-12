import threading
import random
import socketserver

server_host="127.0.0.1"
port = 8085

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        randomN = random.randint(1, 100)
        
        print("El numero aleatorio se ha generado.")
        print(f"El numero a adivinar es: {randomN}")
        
        mensage = "Adivina el numero entre 1 y 100\n"
        
        self.request.sendall(mensage.encode())
        intentos = 0
        
        while True:
            intentos+=1
            
            mensage2 = f"llevas {intentos}.\n Introduce solo numeros por favor\n"
            self.request.sendall(mensage2.encode())
            
            #recivir informacion
            respuesta_usuario = self.request.recv(1024).decode()
            print(respuesta_usuario)
            print(respuesta_usuario.isdigit())
            respuesta_int = int(respuesta_usuario)
            
            if respuesta_int< randomN and respuesta_int > 0:
                self.request.sendall("El numero que has puesto es muy bajo compi".encode())
                self.request.sendall("1".encode())
            elif respuesta_int >randomN and respuesta_int < 100:
                self.request.sendall("El numero que has introducido es demasiado grande".encode())
                self.request.sendall("1".encode())
            elif respuesta_int > 100 or respuesta_int < 0 or not respuesta_int:
                self.request.sendall("El numero que has introducido no esta en el rango".encode())
                self.request.sendall("1".encode())
            elif respuesta_int == randomN: 
                self.request.sendall("As hacertado felicidades")
                self.request.sendall("0".encode())
                break
            else:
                self.request.sendall("No se que has introducido pero esta mal compi")
                

        

try: 
    print("Este server es del juego de adivinar el numero")
    server = socketserver.TCPServer((server_host,port), Handler)
    server.serve_forever()
except KeyboardInterrupt:
    print("Cerrando .........")
except Exception as e:
    print(e)
