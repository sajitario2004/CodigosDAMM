#!/usr/bin/env python3
import urllib.request
import urllib.parse
import json
import sys #librería para scripts, herramientas CLI

API_KEY = "b518fa27b56d06de33e2122e137973bf"  # ← reemplaza por tu API Key
BASE_URL = "https://api.openweathermap.org/data/2.5/weather" #Ejemplo para málaga: “https://api.openweathermap.org/data/2.5/weather?q=malaga&units=metric&appid=api_key”
def obtener_temperatura(ciudad):
    parametros = {
        "q": ciudad,
        "appid": API_KEY,
        "units": "metric",
        "lang": "es"
    }

    url = BASE_URL + "?" + urllib.parse.urlencode(parametros)

    try:
        response= urllib.request.urlopen(url)
        data = response.read().decode("utf-8") #devuelve un archivo en bytes.
        json_data = json.loads(data) #los pasa a json.

        temperatura = json_data["main"]["temp"]
        descripcion = json_data["weather"][0]["description"]

        print(f"Ciudad: {ciudad}")
        print(f"Temperatura: {temperatura} °C")
        print(f"Condición: {descripcion}")

    except urllib.error.HTTPError as e:
        print("Error HTTP:", e.code)
    except urllib.error.URLError as e:
        print("Error de conexión:", e.reason)
    except KeyError:
        print("Respuesta inesperada de la API")

    if len(sys.argv) != 2:
        print("Uso: python clima.py <ciudad>")
        sys.exit(1)

    ciudad = sys.argv[1]

obtener_temperatura("Fuengirola")