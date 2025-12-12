"""
crea un servidor no orientado a conexion que este permanentemente escuchando 
en el puerto en vez de desconectarse. hara lo siguiente:
 - un cliente se conecta, pregunta una frase y la manda al servidor
 - el servidor le contesta lo siguiente al cliente:
    "me has enviado la cadena 'XX'"
    "enviame mas, quiero mas"
 - y el cliente le vuelve a enviar otra frase mas y asi un "no parar"
 - crea el cliente para que se comunique con el servidor
"""

import socket

host = '127.0.0.1'
puerto = 8083

# se define protocolo UDP
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.bind((host, puerto))

try:
   # bucle infinito !!
   while True:
      # recibir datos en buffer de 1024 bytes
      # retorna los datos y la direccion (ip y puerto) del remitente
      datos, addr = s.recvfrom(1024)
      
      frase_recibida = datos.decode().strip()

      print(f"Se recibió la frase {frase_recibida} de {addr}")
      # se formatea la cadena de respuesta
      mes = f"Me has enviado la cadena '{frase_recibida}'\nEnviame más, quiero más"
      
      # se envia la cadena
      s.sendto(mes.encode(), addr)   
except KeyboardInterrupt as ki:
   print("Cerrando el programa...")