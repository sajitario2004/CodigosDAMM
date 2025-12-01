import socketserver

class Handle(socketserver.BaseRequestHandler):
    def handle(self):
        data = self.request.recv(1024)
        self.request.sendall(b"Hola")

server = socketserver.TCPServer(("127.0.0.1", 8000), Handle)
server.serve_forever()
