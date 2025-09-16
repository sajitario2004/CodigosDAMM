# Coloca el código de tu juego en este archivo.

# Declara los personajes usados en el juego como en el ejemplo:

define kf = Character("KAFKA")
define bs = character("BLACK SWAN")

# El juego comienza aquí.

label start:

    # Muestra una imagen de fondo: Aquí se usa un marcador de posición por
    # defecto. Es posible añadir un archivo en el directorio 'images' con el
    # nombre "bg room.png" or "bg room.jpg" para que se muestre aquí.

    #scene bg room
    
    image escena= "imagenpaisa.jpg"
    scene escena

    # Muestra un personaje: Se usa un marcador de posición. Es posible
    # reemplazarlo añadiendo un archivo llamado "eileen happy.png" al directorio
    # 'images'.

    image kafka = "kafka.png"
    show kafka

    # Presenta las líneas del diálogo.

    kf "La ia dominara el mundo que conocemos "

    kf "Soy liviana"

    image blackswan = "blakcswan.jpg"
    show blakcswan

    bs "lesvian"



    # Finaliza el juego:

    return
