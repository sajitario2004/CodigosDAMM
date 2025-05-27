define config.has_sound = True
define config.has_music = True
define config.has_voice = False

# Personajes
define p = Character("Protagonista", color="#c8ffc8")
define a = Character("Ana", color="#ffc8c8")
define l = Character("Luis", color="#c8c8ff")
define m = Character("María", color="#ffffc8")

# Imágenes de personajes
image ana = "images/ana.png"  # Asegúrate de tener estas imágenes
image luis = "images/luis.png"
image maria = "images/maria.png"

# Transformaciones para posiciones
transform left:
    xalign 0.25
transform right:
    xalign 0.75
transform center:
    xalign 0.5

# Escenarios
image bg sala_principal = "images/bg sala_principal.jpg"
image bg cocina = "images/bg cocina.jpg"
image bg dormitorio = "images/bg dormitorio.jpg"
image bg sotano = "images/bg sotano.jpg"
image bg jardin = "images/bg jardin.jpg"

# Música
define audio.sala_music = "audio/sala.mp3"
define audio.cocina_music = "audio/cocina.mp3"
define audio.dormitorio_music = "audio/dormitorio.mp3"
define audio.sotano_music = "audio/sotano.mp3"
define audio.jardin_music = "audio/jardin.mp3"

# Objetos del inventario
default inventario = []
default llave_puerta = False
default codigo_caja = False
default linterna = False
default mapa = False
default llave_secreta = False

# Variables de finales
default final_bueno = False
default final_neutro = False
default final_malo = False

# Screen de inventario
screen inventario_screen():
    modal True
    frame:
        xalign 0.5
        yalign 0.5
        xpadding 30
        ypadding 30
        xminimum 400
        
        vbox:
            label "Inventario" xalign 0.5
            null height 20
            for item in inventario:
                text item
                null height 10
            null height 20
            textbutton "Cerrar" action Return() xalign 0.5

# Inicio del juego
label start:
    play music sala_music fadein 1.0
    
    scene bg sala_principal with fade
    "Te despiertas en una habitación extraña con otros tres desconocidos."
    "No recuerdas cómo llegaste aquí."
    
    show ana at left
    a "¡Despiertas! Estábamos preocupados."
    
    show luis at right
    l "Parece que estamos atrapados en algún tipo de escape room."
    
    show maria at center
    m "Hemos encontrado algunas pistas, pero necesitamos tu ayuda para escapar."
    
    jump sala_principal

label sala_principal:
    scene bg sala_principal
    play music sala_music fadein 1.0
    
    show ana at left
    show luis at right
    show maria at center
    
    menu:
        "¿Qué quieres hacer?"
        
        "Examinar la mesa":
            "En la mesa encuentras un trozo de papel con números parcialmente quemados."
            if "papel_numeros" not in inventario:
                menu:
                    "El papel tiene un acertijo:"
                    "\"Camino de día, camino de noche, pero no me muevo. ¿Qué soy?\""
                    
                    "Una cama":
                        "Incorrecto. El papel se desintegra antes de que puedas ver los números."
                    
                    "Un camino":
                        "Incorrecto. El papel se desintegra antes de que puedas ver los números."

                    "Un reloj":
                        "Correcto! El papel revela los números 7-3-9-4."
                        $ inventario.append("papel_numeros")
                        $ codigo_caja = "7394"
                        "Has obtenido un papel con números."
            else:
                "Ya tienes este papel."
                
        "Hablar con Ana":
            a "Creo que hay algo importante en la cocina, deberías revisar. Pero cuidado con el acertijo del cuchillo."
            
        "Hablar con Luis":
            l "Encontré esta llave escondida en un libro con un acertijo:"
            l "\"Tengo llaves pero no abro puertas. Tengo espacio pero no hay habitaciones. ¿Qué soy?\""
            
            menu:
                "¿Cuál es la respuesta?"
                
                "Un llavero":
                    "Incorrecto. Luis guarda la llave."
                
                "Un teclado":
                    "Incorrecto. Luis guarda la llave."

                "Un piano":
                    "¡Correcto! Luis te entrega la llave pequeña."
                    if "llave_pequena" not in inventario:
                        $ inventario.append("llave_pequena")
                        "Has obtenido una llave pequeña."
                    else:
                        "Luis no tiene nada más que darte."
                    
        "Hablar con María":
            m "Hay una puerta cerrada al final del pasillo. Necesitaremos una llave."
            m "Pero antes, dime: ¿Qué tiene ciudades pero no casas, bosques pero no árboles, y agua pero no peces?"
            
            menu:
                "¿Cuál es la respuesta?"
                
                "Un mapa":
                    "¡Exacto! María te da una pista sobre un mapa en la cocina."
                
                "Un libro":
                    "No es correcto. María suspira decepcionada."
                
                "Un sueño":
                    "No es correcto. María suspira decepcionada."
            
        "Ir a la cocina":
            jump cocina
            
        "Ir al dormitorio":
            if "llave_pequena" in inventario:
                jump dormitorio
            else:
                "La puerta está cerrada. Necesitas una llave."
                
        "Revisar inventario":
            call screen inventario_screen
            
        "Intentar salir (Final prematuro)":
            jump final_malo
            
    jump sala_principal

label cocina:
    scene bg cocina
    play music cocina_music fadein 1.0
    
    show ana at left
    
    menu:
        "¿Qué quieres hacer en la cocina?"
        
        "Revisar los cajones":
            "Encuentras un cuchillo oxidado con un mensaje grabado:"
            "\"Corro y corro pero nunca me muevo, tengo números pero no soy un teléfono. ¿Qué soy?\""
            
            menu:
                "¿Cuál es la respuesta?"
                
                "Un reloj":
                    "¡Correcto! El cuchillo revela un código grabado en su mango: 2-8-6"
                    if "cuchillo" not in inventario:
                        $ inventario.append("cuchillo")
                        "Has obtenido un cuchillo con un código útil."
                    else:
                        "No encuentras nada más."
                
                "Un tren":
                    "Incorrecto. El cuchillo no revela su secreto."
                
                "Un libro":
                    "Incorrecto. El cuchillo no revela su secreto."
                
        "Examinar la nevera":
            "Dentro hay un mapa parcialmente roto con un acertijo:"
            "\"Cuanto más tomas, más dejas atrás. ¿Qué soy?\""
            
            menu:
                "¿Cuál es la respuesta?"
                
                "Pasos":
                    "¡Correcto! El mapa se revela completamente."
                    if "mapa" not in inventario and not mapa:
                        $ mapa = True
                        $ inventario.append("mapa")
                        "Has obtenido un mapa completo."
                    else:
                        "Solo hay comida podrida."
                
                "Fotos":
                    "Incorrecto. El mapa permanece incompleto."
                
                "Recuerdos":
                    "Incorrecto. El mapa permanece incompleto."
                
        "Regresar a la sala principal":
            jump sala_principal
            
        "Revisar inventario":
            call screen inventario_screen
            
    jump cocina

label dormitorio:
    scene bg dormitorio
    play music dormitorio_music fadein 1.0
    
    show luis at right
    
    menu:
        "¿Qué quieres hacer en el dormitorio?"
        
        "Revisar el armario":
            "Encuentras una linterna con un mensaje:"
            "\"Tengo baterías pero no enciendo. Necesito el código correcto para funcionar:"
            "\"Si 2 es 5 y 4 es 9, ¿cuánto es 6?\""
            
            menu:
                "Introduce el número:"
                
                "13":
                    "¡Correcto! La linterna enciende revelando un compartimento secreto."
                    if "linterna" not in inventario and not linterna:
                        $ linterna = True
                        $ inventario.append("linterna")
                        "Has obtenido una linterna funcional."
                    else:
                        "No hay nada más en el armario."
                
                "11":
                    "Incorrecto. La linterna no enciende."
                
                "15":
                    "Incorrecto. La linterna no enciende."
                
        "Examinar la cama":
            "Debajo de la almohada hay un diario con un acertijo:"
            "\"Soy ligero como una pluma pero ni el hombre más fuerte puede sostenerme por más de 5 minutos. ¿Qué soy?\""
            
            menu:
                "¿Cuál es la respuesta?"
                
                "El aliento":
                    "¡Correcto! El diario revela un código: 7394"
                    if "codigo_diario" not in inventario:
                        $ inventario.append("codigo_diario")
                        "Has anotado el código."
                    else:
                        "El diario no tiene más información."
                
                "Un globo":
                    "Incorrecto. El diario no revela su secreto."
                
                "Una sombra":
                    "Incorrecto. El diario no revela su secreto."
                
        "Ir al sótano":
            if "linterna" in inventario:
                jump sotano
            else:
                "Está demasiado oscuro para bajar sin una linterna."
                
        "Regresar a la sala principal":
            jump sala_principal
            
        "Revisar inventario":
            call screen inventario_screen
            
    jump dormitorio

label sotano:
    scene bg sotano
    play music sotano_music fadein 1.0
    
    show maria at center
    
    menu:
        "¿Qué quieres hacer en el sótano?"
        
        "Buscar en los estantes":
            "Encuentras una caja fuerte con un teclado numérico y un acertijo final:"
            "\"Tengo ciudades pero no casas, tengo montañas pero no árboles, tengo agua pero no peces. ¿Qué soy?\""
            
            if "codigo_diario" in inventario:
                menu:
                    "Introducir el código del diario (7394)":
                        "La caja se abre y encuentras una llave maestra con un mensaje:"
                        "\"Úsala sabiamente, solo funcionará si tienes todas las respuestas correctas.\""
                        $ llave_secreta = True
                        $ inventario.append("llave_maestra")
                        "¡Has obtenido la llave maestra!"
                    "No introducir código":
                        pass
            else:
                "Necesitas resolver el acertijo del diario primero."
                
        "Examinar la puerta trasera":
            if "llave_maestra" in inventario and len(inventario) >= 5:
                jump jardin
            else:
                "La puerta está cerrada con una cerradura especial. Necesitas más pistas."
                
        "Regresar al dormitorio":
            jump dormitorio
            
        "Revisar inventario":
            call screen inventario_screen
            
    jump sotano

label jardin:
    scene bg jardin
    play music jardin_music fadein 1.0
    
    "Has llegado al jardín. Hay una puerta de salida al frente con un último acertijo:"
    "\"Para pasar, responde: Qué cosa es, que mientras más le quitas, más grande se hace?\""
    
    menu:
        "¿Cuál es la respuesta?"
        
        "Un agujero":
            if "llave_maestra" in inventario and "mapa" in inventario and "codigo_diario" in inventario:
                $ final_bueno = True
                jump final_bueno
            elif "llave_maestra" in inventario:
                $ final_neutro = True
                jump final_neutro
            else:
                "La puerta no se abre. Te faltan objetos importantes."
                jump sotano
                
        "Una mentira":
            "Incorrecto. La puerta permanece cerrada."
            jump sotano
            
        "El miedo":
            "Incorrecto. La puerta permanece cerrada."
            jump sotano

label final_bueno:
    scene bg jardin
    "Con todos los objetos necesarios y habiendo resuelto todos los acertijos, abres la puerta principal."
    "Tú y tus nuevos amigos escapan ilesos, habiendo demostrado ingenio y trabajo en equipo."
    "¡Felicidades! Has conseguido el final bueno."
    return

label final_neutro:
    scene bg jardin
    "Logras escapar, pero sin todas las pistas y respuestas correctas."
    "Algunos de tus compañeros quedan atrapados dentro."
    "Final neutral alcanzado."
    return

label final_malo:
    scene bg sala_principal
    "Sin resolver los acertijos correctamente, quedas atrapado para siempre en la habitación."
    "Los objetos que coleccionaste no eran los correctos o no supiste usarlos."
    "Final malo. Mejor suerte la próxima vez."
    return