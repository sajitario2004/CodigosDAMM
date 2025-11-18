lista_mensajes = []

for i in range(1,11):
    lista_mensajes.append(f"mensaje Especial {i}\n")
    
print(lista_mensajes)

def send_menssages(lista_mensajes):
    lista_sent_mensajes = []
    for i in lista_mensajes:
        print(f"message: {i}")
        lista_sent_mensajes.append(i)
        
        
    lista_sent_mensajes.reverse()
    print(f"Message sent -----------------------------")
    print(f"messages: {lista_mensajes}")
    print(f"Sent_messages: {lista_sent_mensajes}")
    
    
send_menssages(lista_mensajes)