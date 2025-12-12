"""
acepta 5 clientes y despues acaba
"""

import socket

# creo el socket del servidor
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
	# se define el puerto en el que se escucha
	server_socket.bind(("127.0.0.1", 8081))
	# se crea la cola de conexiones pendientes
	server_socket.listen(5)
	# se crea un bucle que se repite 5 veces
	for i in range(5):
		# mensaje
		print(f"Esperando conexión {i + 1} de 5...")
		# se bloquea esperando a un cliente
		conn, addr = server_socket.accept()
		# se envia el mensaje al cliente
		conn.sendall(b"Hola, soy el servidor!\n")
		# se cierra la conexión con el cliente
		conn.close()
# para ver las excepciones si saltan
except socket.error as e:
	print(f"Error de socket: {e}")
except KeyboardInterrupt:
	print("Cerrando programa...")
# se quita el servidor de la escucha
finally:
	server_socket.close()