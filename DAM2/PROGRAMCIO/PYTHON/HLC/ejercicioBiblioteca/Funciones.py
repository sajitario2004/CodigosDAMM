
def crear_libro(diccionario, titulo, autor, paginas, genero="no especificado"):
    diccionario.append({"titulo": titulo, "autor": autor, "paginas": paginas, "genero": genero})

    for i in diccionario:
        print(i)

    return diccionario

def buscar_por_autor(biblio, autor):
    diccionario2 = []
    comprob = False
    for i in biblio:
        if i.get("autor") == autor:
            diccionario2.append(i)
            comprob = True

    if comprob:
        print("\nautor/es encontrados")
    else:
        print("\nautores no encontrados")
    
    return diccionario2

def biblioteca_detallada(biblioteca):
    biblio_aux = []

    for i in biblioteca:
        biblio_aux.append({i.get("titulo"): {
                            "autor":i.get("autor"),
                            "paginas":i.get("paginas"),
                            "genero":i.get("genero"),
                            "prestamo": {
                                "disponible": True, 
                                "dias_restantes": 0}
                            }})
    return biblio_aux

def info_libro(diccionario, titulo):
    comprob = False
    libro = ""
    for i in diccionario:
        libro = i.get(titulo)
        if libro != None:
            comprob = True
            break

    if comprob:
        print(libro.get("autor"))
        print(libro.get("paginas"))
        print(libro.get("genero"))
    else:
        print("libro no encontrado")

def sistematizacion(biblio):
    biblio1, biblio2, biblio3= [], [], []

    biblio1 = biblio[1:int(biblio.__len__()/3)]
    biblio2 = biblio[int(biblio.__len__()/3):int((biblio.__len__()/3)*2)]
    biblio3 = biblio[int((biblio.__len__()/3)*2):int(biblio.__len__())]

    return biblio1, biblio2, biblio3


def contar_sitema_bibliotecas(biblio):
    count = 0
    for i in biblio:
        biblio_aux = biblio.get(i)
        count+= int(biblio_aux.__len__()-1)

    return count