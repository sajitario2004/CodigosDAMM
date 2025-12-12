import socket

HOST = '127.0.0.1'
PORT = 8082    

def main():
    cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    
    try:
        cliente.connect((HOST, PORT))
    except ConnectionRefusedError:
        print("No se pudo conectar al servidor. Asegúrate de iniciarlo primero.")
        return

    print("Conectado al servidor...")

    try:
        while True:
            # Recibir datos del servidor
            mensaje = cliente.recv(1024).decode()
            
            if not mensaje:
                print("El servidor cerró la conexión.")
                break
            
            print(mensaje, end="")

            # Si el servidor nos pide jugar o intentar de nuevo, habilitamos input
            # Detectamos esto buscando palabras clave en el mensaje recibido
            if "piedra, papel o tijera" in mensaje.lower() or "intenta de nuevo" in mensaje.lower() or "juega de nuevo" in mensaje.lower():
                jugada = input("TU TURNO > ")
                cliente.sendall(jugada.encode())

    except KeyboardInterrupt:
        print("\nSaliendo...")
    finally:
        cliente.close()

if __name__ == "__main__":
    main()