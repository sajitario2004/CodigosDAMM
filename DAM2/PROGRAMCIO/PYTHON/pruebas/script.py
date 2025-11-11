import tkinter as tk
import random
from tkinter import messagebox

class Buscaminas:
    def __init__(self, master, filas=8, columnas=8, minas=10):
        self.master = master
        self.filas = filas
        self.columnas = columnas
        self.minas = minas
        self.tablero = [[0 for _ in range(columnas)] for _ in range(filas)]
        self.botones = [[None for _ in range(columnas)] for _ in range(filas)]
        self.crear_minas()
        self.contar_minas_vecinas()
        self.crear_botones()

    def crear_minas(self):
        posiciones = random.sample(range(self.filas * self.columnas), self.minas)
        for pos in posiciones:
            fila = pos // self.columnas
            col = pos % self.columnas
            self.tablero[fila][col] = 'M'

    def contar_minas_vecinas(self):
        for i in range(self.filas):
            for j in range(self.columnas):
                if self.tablero[i][j] == 'M':
                    continue
                contador = 0
                for x in range(max(0, i-1), min(self.filas, i+2)):
                    for y in range(max(0, j-1), min(self.columnas, j+2)):
                        if self.tablero[x][y] == 'M':
                            contador += 1
                self.tablero[i][j] = contador

    def crear_botones(self):
        for i in range(self.filas):
            for j in range(self.columnas):
                btn = tk.Button(self.master, width=3, height=1,
                                command=lambda i=i, j=j: self.descubrir(i,j))
                btn.bind("<Button-3>", lambda e, i=i, j=j: self.marcar_bandera(i,j))
                btn.grid(row=i, column=j)
                self.botones[i][j] = btn

    def descubrir(self, i, j):
        btn = self.botones[i][j]
        if btn["state"] == "disabled" or btn["text"] == "🚩":
            return
        if self.tablero[i][j] == 'M':
            btn.config(text="💣", bg='red')
            self.fin_juego(False)
        else:
            self.mostrar_casilla(i, j)
            if self.verificar_victoria():
                self.fin_juego(True)

    def mostrar_casilla(self, i, j):
        btn = self.botones[i][j]
        if btn["state"] == "disabled":
            return
        btn.config(text=str(self.tablero[i][j]) if self.tablero[i][j]>0 else '', state="disabled", relief=tk.SUNKEN)
        if self.tablero[i][j] == 0:
            for x in range(max(0, i-1), min(self.filas, i+2)):
                for y in range(max(0, j-1), min(self.columnas, j+2)):
                    if self.botones[x][y]["state"] != "disabled":
                        self.mostrar_casilla(x, y)

    def marcar_bandera(self, i, j):
        btn = self.botones[i][j]
        if btn["state"] == "disabled":
            return
        if btn["text"] == "🚩":
            btn.config(text="")
        else:
            btn.config(text="🚩")

    def fin_juego(self, victoria):
        for i in range(self.filas):
            for j in range(self.columnas):
                if self.tablero[i][j] == 'M':
                    self.botones[i][j].config(text="💣")
                self.botones[i][j]["state"] = "disabled"
        mensaje = "¡Felicidades! ¡Ganaste!" if victoria else "¡Perdiste! Has pisado una mina."
        messagebox.showinfo("Fin del Juego", mensaje)

    def verificar_victoria(self):
        for i in range(self.filas):
            for j in range(self.columnas):
                if self.tablero[i][j] != 'M' and self.botones[i][j]["state"] != "disabled":
                    return False
        return True

if __name__ == "__main__":
    root = tk.Tk()
    root.title("Buscaminas")
    juego = Buscaminas(root)
    root.mainloop()
