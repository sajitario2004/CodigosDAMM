# Cada elemento es un diccionario que representa un libro con sus atributos (título, autor, páginas, género).
biblioteca_general = [
    {"titulo": "El Hobbit", "autor": "Tolkien", "paginas": 300, "genero": "Fantasía"},
    {"titulo": "1984", "autor": "Orwell", "paginas": 250, "genero": "Distopía"},
    {"titulo": "Dune", "autor": "Herbert", "paginas": 500, "genero": "Ciencia ficción"},
    {"titulo": "It", "autor": "Stephen King", "paginas": 600, "genero": "Terror"},
    {"titulo": "Fundación", "autor": "Asimov", "paginas": 230, "genero": "Ciencia ficción"},
    {"titulo": "Neuromante", "autor": "William Gibson", "paginas": 280, "genero": "Ciencia ficción"},
    {"titulo": "El Juego de Ender", "autor": "Orson Scott Card", "paginas": 320, "genero": "Ciencia ficción"},
    {"titulo": "La Llamada de Cthulhu", "autor": "H.P. Lovecraft", "paginas": 140, "genero": "Terror"},
    {"titulo": "Drácula", "autor": "Bram Stoker", "paginas": 400, "genero": "Terror"},
    {"titulo": "Frankenstein", "autor": "Mary Shelley", "paginas": 230, "genero": "Terror"},
    {"titulo": "El Principito", "autor": "Antoine de Saint-Exupéry", "paginas": 100, "genero": "Fábula"},
    {"titulo": "Crimen y castigo", "autor": "Dostoievski", "paginas": 430, "genero": "Drama"},
    {"titulo": "Rayuela", "autor": "Julio Cortázar", "paginas": 600, "genero": "Novela"},
    {"titulo": "Cien años de soledad", "autor": "Gabriel García Márquez", "paginas": 470, "genero": "Realismo mágico"},
    {"titulo": "Don Quijote", "autor": "Cervantes", "paginas": 1000, "genero": "Clásico"},
    {"titulo": "La Sombra del Viento", "autor": "Carlos Ruiz Zafón", "paginas": 520, "genero": "Misterio"},
    {"titulo": "El Código Da Vinci", "autor": "Dan Brown", "paginas": 450, "genero": "Thriller"},
    {"titulo": "Los Juegos del Hambre", "autor": "Suzanne Collins", "paginas": 370, "genero": "Distopía"},
    {"titulo": "Harry Potter 1", "autor": "J.K. Rowling", "paginas": 350, "genero": "Fantasía"},
    {"titulo": "Harry Potter 2", "autor": "J.K. Rowling", "paginas": 370, "genero": "Fantasía"},
    {"titulo": "Harry Potter 3", "autor": "J.K. Rowling", "paginas": 430, "genero": "Fantasía"},
    {"titulo": "La Metamorfosis", "autor": "Kafka", "paginas": 120, "genero": "Absurdismo"},
    {"titulo": "El Nombre del Viento", "autor": "Patrick Rothfuss", "paginas": 700, "genero": "Fantasía"},
    {"titulo": "El Temor de un Hombre Sabio", "autor": "Patrick Rothfuss", "paginas": 1100, "genero": "Fantasía"},
    {"titulo": "El Señor de los Anillos 1", "autor": "Tolkien", "paginas": 500, "genero": "Fantasía"},
    {"titulo": "El Señor de los Anillos 2", "autor": "Tolkien", "paginas": 450, "genero": "Fantasía"},
    {"titulo": "El Señor de los Anillos 3", "autor": "Tolkien", "paginas": 550, "genero": "Fantasía"},
    {"titulo": "Solaris", "autor": "Stanislaw Lem", "paginas": 300, "genero": "Ciencia ficción"},
    {"titulo": "El Perfume", "autor": "Patrick Süskind", "paginas": 280, "genero": "Drama"},
    {"titulo": "El Alquimista", "autor": "Paulo Coelho", "paginas": 210, "genero": "Fábula"}
]

#  EJERCICIO 1: Función para crear un nuevo libro.
def crear_libro(titulo, autor, paginas):

    return {"titulo": titulo, "autor": autor, "paginas": paginas}

# EJERCICIO 2 
def buscar_por_autor(biblio, autor):

    resultados = [
        libro
        for libro in biblio
        if libro.get("autor", "").lower() == autor.lower()
    ]
    
    # También puedes escribirla en una sola línea, que es lo más común:
    # resultados = [libro for libro in biblio if libro.get("autor", "").lower() == autor.lower()]

    return ( resultados if resultados
    else "Autor no encontrado"
    )

#  EJERCICIO 3: Función para mostrar información detallada de un libro 
def info_libro(diccionario, titulo):

    # Verifica si el título del libro existe como clave en el diccionario.
    if titulo in diccionario:
        # Obtiene el diccionario de datos del libro.
        datos = diccionario[titulo]
        # Imprime los datos del libro.
        # Usa .get() para acceder a los valores de forma segura (aunque se asume que existen en este contexto).
        print("Título:", titulo)
        print("Autor:", datos.get("autor"))
        print("Páginas:", datos.get("paginas"))
        print("Género:", datos.get("genero"))
        # Asume la existencia de la clave "prestamo" para fines de demostración del ejercicio.
        # En el menú, se añade este campo.
        print("Préstamo:", datos.get("prestamo")) 
    else:
        # Muestra un mensaje si el libro no se encuentra.
        print("El libro no está en la biblioteca")


#  EJERCICIO 4: Función para crear un sistema de bibliotecas 
def crear_sistema_bibliotecas():
    # Divide la lista 'biblioteca_general' en tres sublistas de 10 libros cada una
    # usando slicing (yo se q te mola dario).
    biblioteca1 = biblioteca_general[:10]  # Primeros 10 libros
    biblioteca2 = biblioteca_general[10:20] # Libros 11 al 20
    biblioteca3 = biblioteca_general[20:30] # Libros 21 al 30
    
    # Crea un diccionario donde las claves son los nombres de las bibliotecas
    # y los valores son las listas de libros correspondientes.
    sistema_bibliotecas = {
        "central": biblioteca1,
        "universitaria": biblioteca2,
        "infantil": biblioteca3,
        "digital": [] # Biblioteca vacía para demostrar el sistema
    }
    return sistema_bibliotecas


#  EJERCICIO 5: Función para buscar un libro en todas las bibliotecas del sistema 
def buscar_libro_global(sistema, titulo):

    resultados = []
    # Itera sobre cada biblioteca (nombre y lista de libros) en el diccionario 'sistema'.
    for nombre, biblio in sistema.items():
        # Itera sobre cada libro en la lista de la biblioteca actual.
        for libro in biblio:
            # Compara el título del libro (en minúsculas) con el título buscado (en minúsculas).
            if libro.get("titulo", "").lower() == titulo.lower():
                # Si lo encuentra, añade una tupla con el nombre de la biblioteca y el diccionario del libro.
                resultados.append((nombre, libro))
    return resultados


#  EJERCICIO 6: Función para buscar libros de un autor en todas las bibliotecas del sistema 
def buscar_autor_global(sistema, autor):

    resultados = []
    # Itera sobre cada biblioteca (nombre y lista de libros).
    for nombre, biblio in sistema.items():
        # Itera sobre cada libro en la lista de la biblioteca.
        for libro in biblio:
            # Compara el autor del libro (en minúsculas) con el autor buscado (en minúsculas).
            if libro.get("autor", "").lower() == autor.lower():
                # Si lo encuentra, añade una tupla con el nombre de la biblioteca y el diccionario del libro.
                resultados.append((nombre, libro))
    return resultados


def menu_principal():
    
    # Inicializa la variable que almacenará el sistema de bibliotecas.
    sistema = None

    # Bucle principal que mantiene el menú en ejecución hasta que el usuario elija salir.
    while True:
        # Muestra las opciones del menú.
        print("\n===== GESTIÓN DE BIBLIOTECA =====")
        print("1. Crear libro")
        print("2. Buscar libros por autor")
        print("3. Mostrar información detallada de un libro")
        print("4. Crear sistema de bibliotecas")
        print("5. Buscar libro en todas las bibliotecas")
        print("6. Buscar autor en todas las bibliotecas")
        print("0. Salir")

        # Pide al usuario que elija una opción.
        opcion = input("Elige una opción: ")

        if opcion == "1":
            # --- Opción 1: Crear libro ---
            print("OPCIÓN 1: Crear libro")
            # Pide los datos al usuario.
            titulo = input("Título: ")
            autor = input("Autor: ")
            try:
                # Intenta convertir la entrada de páginas a entero.
                paginas = int(input("Número de páginas: "))
            except ValueError:
                # Captura el error si la entrada no es un número y pide continuar.
                print("Número de páginas inválido.")
                continue
            # Llama a la función crear_libro() con los datos proporcionados.
            libro = crear_libro(titulo, autor, paginas)
            print("Libro creado:", libro)

        elif opcion == "2":
            # --- Opción 2: Buscar libros por autor ---
            print("OPCIÓN 2: Buscar libros por autor")
            # Pide el autor a buscar.
            autor = input("Introduce el nombre del autor: ")
            # Llama a la función buscar_por_autor() en la lista principal.
            resultados = buscar_por_autor(biblioteca_general, autor)
            # Verifica si el resultado es el mensaje de error (tipo str) o la lista de libros.
            if isinstance(resultados, str):
                print(resultados)
            else:
                # Si hay resultados, itera e imprime la información.
                print("Resultados:")
                for libro in resultados:
                    print(f"- {libro.get('titulo')} ({libro.get('autor')}, {libro.get('paginas')} págs.)")

        elif opcion == "3":
            # --- Opción 3: Mostrar información detallada de un libro ---
            print("OPCIÓN 3: Información detallada de libro")
            # Crea una *nueva estructura de datos* para esta opción: un diccionario donde
            # la clave es el título y el valor es un diccionario con el resto de la información
            # más un campo de "préstamo" anidado (simulando estado de disponibilidad).
            biblioteca_detallada = {
                libro["titulo"]: {
                    "autor": libro["autor"],
                    "paginas": libro["paginas"],
                    "genero": libro["genero"],
                    "prestamo": {"disponible": True, "dias_restantes": 0}
                }
                for libro in biblioteca_general
            }
            # Pide el título a buscar.
            titulo = input("Introduce el título: ")
            # Llama a la función info_libro().
            info_libro(biblioteca_detallada, titulo)

        elif opcion == "4":
            # --- Opción 4: Crear sistema de bibliotecas ---
            print("OPCIÓN 4: Crear sistema de bibliotecas")
            # Llama a la función para inicializar y guardar el sistema de bibliotecas.
            sistema = crear_sistema_bibliotecas()
            # Muestra el resumen de las bibliotecas creadas.
            print("Sistema de bibliotecas creado:")
            for nombre, biblio in sistema.items():
                print(f"- **{nombre}**: {len(biblio)} libros")

        elif opcion == "5":
            # --- Opción 5: Búsqueda global de libro ---
            print("OPCIÓN 5: Búsqueda global de libro")
            # Verifica si el sistema ha sido inicializado (opción 4).
            if sistema is None:
                print("Primero debes crear el sistema de bibliotecas (opción 4).")
            else:
                # Pide el título.
                titulo = input("Introduce el título: ")
                # Llama a la función de búsqueda global.
                resultados = buscar_libro_global(sistema, titulo)
                if resultados:
                    # Si hay resultados, imprime dónde se encontró el libro y sus datos.
                    print("Libro(s) encontrado(s):")
                    for nombre, libro in resultados:
                        print("Biblioteca:", nombre)
                        print("Título:", libro.get("titulo"))
                        print("Autor:", libro.get("autor"))
                        print("Páginas:", libro.get("paginas"))
                        print("---")
                else:
                    print("Libro no encontrado en ninguna biblioteca.")

        elif opcion == "6":
            # --- Opción 6: Búsqueda global de autor ---
            print("OPCIÓN 6: Búsqueda global de autor")
            # Verifica si el sistema ha sido inicializado.
            if sistema is None:
                print("Primero debes crear el sistema de bibliotecas (opción 4).")
            else:
                # Pide el autor.
                autor = input("Introduce el autor: ")
                # Llama a la función de búsqueda global por autor.
                resultados = buscar_autor_global(sistema, autor)
                if resultados:
                    # Si hay resultados, imprime dónde se encontró el libro y sus datos.
                    print("Libro(s) encontrado(s):")
                    for nombre, libro in resultados:
                        print("Biblioteca:", nombre)
                        print("Título:", libro.get("titulo"))
                        print("Autor:", libro.get("autor"))
                        print("Páginas:", libro.get("paginas"))
                        print("---")
                else:
                    print("Autor no encontrado en ninguna biblioteca.")

        elif opcion == "0":
            # --- Opción 0: Salir ---
            print("Saliendo del programa...")
            break # Sale del bucle 'while True'.

        else:
            # Mensaje para opciones no válidas.
            print("Opción no válida. Intente de nuevo.")


# EJECUTAR MENÚ
# Llama a la función principal para iniciar la aplicación.
menu_principal()