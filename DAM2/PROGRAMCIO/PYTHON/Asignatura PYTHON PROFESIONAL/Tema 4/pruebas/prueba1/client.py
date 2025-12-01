import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(("127.0.0.1", 8000))
server.listen(5)

while True:
    conn, addr = server.accept()
    data = conn.recv(1024)
    conn.sendall(b"Hola")
    conn.close()
