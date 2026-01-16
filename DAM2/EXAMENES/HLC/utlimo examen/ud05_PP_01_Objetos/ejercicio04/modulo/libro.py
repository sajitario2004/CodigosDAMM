class Libro:
    def __init__(self, titulo, paginas):
        self.titulo = titulo
        self.__paginas = paginas

    def get_paginas(self):
        return self.__paginas

    def set_paginas(self, paginas):
        if paginas > 0:
            self.__paginas = paginas
        else:
            print("El número de páginas debe ser mayor a 0.")

    def __str__(self):
        return self.titulo

    def __len__(self):
        return self.__paginas

