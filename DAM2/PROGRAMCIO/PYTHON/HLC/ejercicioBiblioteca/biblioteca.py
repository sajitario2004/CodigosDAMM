import Funciones as fn
import time
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

biblioteca_detallada = []

biblioteca1 = []
biblioteca2 = []
biblioteca3 = []

sistema_bibliotecas = {}

def main():
    comprob = False
    global biblioteca_general
    global biblioteca_detallada
    global biblioteca1
    global biblioteca2
    global biblioteca3
    global sistema_bibliotecas

    while not comprob:
        print("bienvenido a el gestor de libros")
        print("¿que opcion desea realizar?")
        print("1 crear libro y listarlos todos")
        print("2 busqueda por autor")
        print("3 crear biblioteca detallada")
        print("4 info de libro concreto de diccionario detallado (hay que ejecutar el 3 antes)")
        print("5 sistematizacion de biblioteca y impresion de esta")
        print("6 tamaño biblioteca(hay que ejecutar 5 antes)")
        print("7 ")
        print("0 Salir\n")

        match int(input("")):
            case 1:
                titulo = input("Digame el titulo de el libro\n")
                autor = input("Digame el autor de el libro\n")
                paginas = int(input("Digame el numero de paginas\n"))
                genero = input("Digame el genero de el libro(Puede dejar este campo vacio, es opcional)\n")
                if genero == "":
                    biblioteca_general = fn.crear_libro(biblioteca_general, titulo, autor, paginas)
                else:
                    biblioteca_general = fn.crear_libro(biblioteca_general, titulo, autor, paginas, genero)
                print("\n")
            case 2:
                autor = input("Digame el nombre de el autor que esta buscando\n")
                biblio_aux2 = fn.buscar_por_autor(biblioteca_general, autor)
                print(biblio_aux2)

                print("\n")

            case 3:
                
                biblioteca_detallada = fn.biblioteca_detallada(biblioteca_general)
                
                for i in biblioteca_detallada:
                    print(i)

                print("\n")
            case 4:
                titulo = input("Dime el titulo de el libro que estas buscando\n")

                fn.info_libro(biblioteca_detallada, titulo)

                print("\n")
            case 5:
                print(int (biblioteca_general.__len__()/3))
                biblioteca1, biblioteca2, biblioteca3 = fn.sistematizacion(biblioteca_general)
                sistema_bibliotecas["central"]=biblioteca1
                sistema_bibliotecas["universitaria"]=biblioteca2
                sistema_bibliotecas["infantil"]=biblioteca3
                sistema_bibliotecas["digital"]="vacia"
                time.sleep(1)
                for i in sistema_bibliotecas:
                    print(i)
                    print(sistema_bibliotecas.get(i))

            case 6:
                count = fn.contar_sitema_bibliotecas(sistema_bibliotecas)
                print(f"El numero de libros en el sistema de bibliotecas es de {count}")
            case 0:
                print("Saliendo del programa.")
                comprob= True
            case _:
                print("Opcion no valida.")


if __name__ == "__main__":
    main()