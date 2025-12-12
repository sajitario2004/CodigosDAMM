"""
    acepta clientes en paralelo, los que hagan falta
    for i in {1..5}; do python3 1_socket_client.py; sleep 0.1; done
"""

import threading
import socket

# rutina del hilo
def handle_client(conn, addr):
    try:
        # le envía este mensaje al servidor
        conn.sendall(f"Hola {addr[0]}:{addr[1]}! Soy el servidor.\n".encode("utf-8"))
    except socket.error as e:
        # imprimir excepciones
        print(f"Error de socket: {e}")
    finally:
        conn.close()

def main():
    # crea el socket y asigna puerto blablabla
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(("127.0.0.1", 8081))
    server_socket.listen(5)
    print(f"Servidor escuchando...")

    try:
        # bucle infinito!!!
        while True:
            # esperar a un cliente
            conn, addr = server_socket.accept()
            print("Aceptada conexión de", addr)
            # crea y arranca el hilo haciendo lo de la funcion
            t = threading.Thread(target=handle_client, args=(conn, addr))
            t.start()
    except socket.error as e:
        # mprimir excepciones
        print("Error de socket:", e)
    except KeyboardInterrupt:
        print("Cerrando programa...")
    finally:
        # cerrar socket
        server_socket.close()

if __name__ == "__main__":
    main()