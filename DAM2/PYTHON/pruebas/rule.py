import pygame
import sys
import math
import random

pygame.init()

# -------------------
# CONFIGURACIÓN
# -------------------
ANCHO, ALTO = 1200, 700
pantalla = pygame.display.set_mode((ANCHO, ALTO))
pygame.display.set_caption("🎰 Ruleta Casino Completa")

fuente = pygame.font.SysFont("Arial", 20, bold=True)

# Colores
VERDE = (0, 128, 0)
NEGRO = (0, 0, 0)
ROJO = (200, 0, 0)
BLANCO = (255, 255, 255)
AMARILLO = (255, 255, 0)

# -------------------
# RULETA
# -------------------
numeros = [
    0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6,
    27, 13, 36, 11, 30, 8, 23, 10, 5, 24, 16,
    33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28,
    12, 35, 3, 26
]

def color_numero(n):
    if n == 0:
        return (0, 128, 0)
    if (1 <= n <= 10) or (19 <= n <= 28):
        return (255, 0, 0) if n % 2 != 0 else (0, 0, 0)
    else:
        return (0, 0, 0) if n % 2 != 0 else (255, 0, 0)

def dibujar_ruleta(angulo, cx, cy, radio):
    n = len(numeros)
    angulo_por_num = 360 / n
    for i, numero in enumerate(numeros):
        ang_ini = math.radians(i * angulo_por_num + angulo)
        ang_fin = math.radians((i + 1) * angulo_por_num + angulo)
        color = color_numero(numero)
        pygame.draw.polygon(
            pantalla,
            color,
            [(cx, cy),
             (cx + radio * math.cos(ang_ini), cy + radio * math.sin(ang_ini)),
             (cx + radio * math.cos(ang_fin), cy + radio * math.sin(ang_fin))]
        )
        ang_texto = math.radians((i + 0.5) * angulo_por_num + angulo)
        tx = cx + (radio - 30) * math.cos(ang_texto)
        ty = cy + (radio - 30) * math.sin(ang_texto)
        texto = fuente.render(str(numero), True, BLANCO)
        rect = texto.get_rect(center=(tx, ty))
        pantalla.blit(texto, rect)

    # Flecha arriba
    pygame.draw.polygon(pantalla, BLANCO, [(cx, cy - radio - 10),
                                           (cx - 10, cy - radio - 40),
                                           (cx + 10, cy - radio - 40)])

# -------------------
# MESA
# -------------------
apuestas = []

def dibujar_mesa():
    # Fondo mesa
    pygame.draw.rect(pantalla, VERDE, (0, 0, 500, ALTO))

    # Zona del 0
    pygame.draw.rect(pantalla, NEGRO, (50, 50, 60, 160), 2)
    txt = fuente.render("0", True, BLANCO)
    pantalla.blit(txt, (70, 110))

    # Números 1-36
    ancho_celda, alto_celda = 60, 40
    x0, y0 = 110, 50
    numero = 1
    for fila in range(12):
        for col in range(3):
            x = x0 + col * ancho_celda
            y = y0 + fila * alto_celda
            color = ROJO if numero % 2 == 1 else NEGRO
            pygame.draw.rect(pantalla, color, (x, y, ancho_celda, alto_celda))
            pygame.draw.rect(pantalla, BLANCO, (x, y, ancho_celda, alto_celda), 2)
            txt = fuente.render(str(numero), True, BLANCO)
            pantalla.blit(txt, (x + 20, y + 10))
            numero += 1

    # Zonas externas
    zonas = [
        ("Rojo", 50, 550, 100, 40, ROJO),
        ("Negro", 160, 550, 100, 40, NEGRO),
        ("Par", 270, 550, 100, 40, NEGRO),
        ("Impar", 380, 550, 100, 40, NEGRO),
        ("1-18", 50, 600, 150, 40, NEGRO),
        ("19-36", 220, 600, 150, 40, NEGRO),
    ]
    for nombre, x, y, w, h, color in zonas:
        pygame.draw.rect(pantalla, color, (x, y, w, h))
        pygame.draw.rect(pantalla, BLANCO, (x, y, w, h), 2)
        txt = fuente.render(nombre, True, BLANCO)
        pantalla.blit(txt, (x + 10, y + 10))

    # Fichas
    for (x, y, apuesta, valor) in apuestas:
        pygame.draw.circle(pantalla, AMARILLO, (x, y), 15)
        txt = fuente.render(str(valor), True, NEGRO)
        pantalla.blit(txt, (x - 8, y - 8))

def detectar_casilla(pos):
    x, y = pos
    # 0
    if 50 < x < 110 and 50 < y < 210:
        return "0"
    # Números
    ancho_celda, alto_celda = 60, 40
    x0, y0 = 110, 50
    for fila in range(12):
        for col in range(3):
            x1 = x0 + col * ancho_celda
            y1 = y0 + fila * alto_celda
            if x1 < x < x1 + ancho_celda and y1 < y < y1 + alto_celda:
                return str(fila * 3 + col + 1)
    # Externas
    zonas = {
        "Rojo": (50, 550, 100, 40),
        "Negro": (160, 550, 100, 40),
        "Par": (270, 550, 100, 40),
        "Impar": (380, 550, 100, 40),
        "1-18": (50, 600, 150, 40),
        "19-36": (220, 600, 150, 40),
    }
    for nombre, (x1, y1, w, h) in zonas.items():
        if x1 < x < x1 + w and y1 < y < y1 + h:
            return nombre
    return None

# -------------------
# JUEGO
# -------------------
angulo_final = 0  # <-- guardamos el ángulo de la última jugada

def girar_ruleta():
    global angulo_final
    cx, cy, radio = 850, 350, 250
    angulo = 0
    velocidad = random.uniform(15, 25)
    deceleracion = 0.05
    reloj = pygame.time.Clock()
    girando = True
    while girando:
        for evento in pygame.event.get():
            if evento.type == pygame.QUIT:
                pygame.quit()
                sys.exit()
        pantalla.fill(VERDE)
        dibujar_mesa()
        dibujar_ruleta(angulo, cx, cy, radio)
        pygame.display.flip()
        reloj.tick(60)
        angulo += velocidad
        velocidad -= deceleracion
        if velocidad <= 0:
            girando = False
    # Guardamos ángulo final
    angulo_final = angulo % 360
    # Resultado
    n = len(numeros)
    indice = int((-angulo_final % 360) / (360 / n)) % n
    numero_ganador = numeros[indice]
    return numero_ganador

def evaluar_apuestas(resultado):
    ganancia = 0
    color = color_numero(resultado)
    for (_, _, tipo, valor) in apuestas:
        if tipo == str(resultado):  # pleno
            ganancia += valor * 35
        elif tipo == "Rojo" and color == ROJO:
            ganancia += valor
        elif tipo == "Negro" and color == NEGRO:
            ganancia += valor
        elif tipo == "Par" and resultado != 0 and resultado % 2 == 0:
            ganancia += valor
        elif tipo == "Impar" and resultado % 2 == 1:
            ganancia += valor
        elif tipo == "1-18" and 1 <= resultado <= 18:
            ganancia += valor
        elif tipo == "19-36" and 19 <= resultado <= 36:
            ganancia += valor
    return ganancia

# -------------------
# BUCLE PRINCIPAL
# -------------------
reloj = pygame.time.Clock()
resultado_texto = ""
while True:
    for evento in pygame.event.get():
        if evento.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
        if evento.type == pygame.MOUSEBUTTONDOWN:
            if evento.pos[0] < 500:  # mesa
                casilla = detectar_casilla(evento.pos)
                if casilla:
                    apuestas.append((evento.pos[0], evento.pos[1], casilla, 10))
            else:  # botón jugar
                if 750 < evento.pos[0] < 950 and 600 < evento.pos[1] < 650:
                    if apuestas:
                        resultado = girar_ruleta()
                        ganancia = evaluar_apuestas(resultado)
                        resultado_texto = f"Ganó: {resultado} | Pagado: {ganancia}"
                        apuestas.clear()

    pantalla.fill(VERDE)
    dibujar_mesa()
    # ahora la ruleta se dibuja siempre en el ángulo final de la última jugada
    dibujar_ruleta(angulo_final, 850, 350, 250)

    # Botón JUGAR
    pygame.draw.rect(pantalla, ROJO, (750, 600, 200, 50))
    pygame.draw.rect(pantalla, BLANCO, (750, 600, 200, 50), 3)
    txt = fuente.render("JUGAR", True, BLANCO)
    pantalla.blit(txt, (820, 615))

    # Resultado
    if resultado_texto:
        txt = fuente.render(resultado_texto, True, AMARILLO)
        pantalla.blit(txt, (700, 50))

    pygame.display.flip()
    reloj.tick(60)