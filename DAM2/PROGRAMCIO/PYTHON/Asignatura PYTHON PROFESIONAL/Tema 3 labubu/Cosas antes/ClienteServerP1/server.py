import socket
#Crear socket de servidor. #AF_INET -> familia ip, transmisión en stream mediante TCP
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
try:
    server_socket.bind(("127.0.0.1", 8081)) #si es 0.0.0.0 es desde cualquier interfaz.
    #listen -> Crea una cola de conexiones pendientes, convierte el socket en pasivo(servidor).
    server_socket.listen(5) #Número máximo de conexiones pendientes sin ser aceptadas.

    while True:
        print("Servidor esperando conexiones...")
        # Esperar un cliente. addr[0] es ip, addr[1] es el puerto.
        conn, addr = server_socket.accept() #Se queda bloqueado esperando a un cliente.
        print(f"Conectado con {addr}")
        # Enviar y recibir datos
        conn.sendall(b"Hola, soy el servidor") #Mejor que usar conn.send, porque garantiza envio y si no excepción
        data = conn.recv(1024) #se queda esperando hasta que se envía algo, 1024 bytes como máximo
        #Convierte los bytes recibidos a texto. Sockets solo transmiten bytes.
        #No todos los bytes representan texto. Por ejemplo una imagen, un emoticono.
        print("Cliente dice:", data.decode()) 
        # Cerrar conexión con ese cliente.
        conn.close()
except socket.error as exc:
	print(f"Excepción de socket: {exc}")
finally:
	#Quitamos el servidor de la escucha.
    server_socket.close()
