import urllib.request

url = "https://educacionadistancia.juntadeandalucia.es/centros/malaga/my/"

response = urllib.request.urlopen(url)

for _ in range(20):
    linea = response.readline().decode("utf-8")
    print(linea)