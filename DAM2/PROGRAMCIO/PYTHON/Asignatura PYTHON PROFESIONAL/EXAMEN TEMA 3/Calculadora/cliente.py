import socket

HOST = "127.0.0.1"
PORT = 8085
try:
    cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    cliente.connect((HOST, PORT))
    print("Conectando con el servidor")
    
    menu = cliente.recv(1024).decode()
    print(menu)
    
    while True:
        pregunta = input("")
        pregunta = pregunta.lower()

        cliente.sendall(pregunta.encode())
        
        respuesta = cliente.recv(1024).decode()
    
except:
    print("no se pudo conectar con el servidor")
finally: 
    cliente.close()