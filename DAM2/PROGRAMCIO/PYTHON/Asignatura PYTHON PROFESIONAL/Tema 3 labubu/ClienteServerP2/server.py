import socket

#creamos el socket de servidor.
server_socket =socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    server_socket.bind(("127.0.0.1",8081))
    
    server_socket.listen(5)