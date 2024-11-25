Algoritmo ejer10
	Escribir "Dime tu dia de nacimiento"
	Leer dia1
	Escribir "Dime tu mes de nacimiento en numero porfavor " 
	Leer mes
	
	Escribir "Dimes tu año de nacimento" 
	Leer año1
	si (mes < 12 y mes > 0) o (dia1 > 0 y dia1 < 30) o (año1 > 1950 y año1 < 2024)  Entonces
	si mes = 1 Entonces
		mesNom = "Enero"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 2 Entonces
		mesNom = "Febrero"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 3 Entonces
		mesNom = "Marzo"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 4 Entonces
		mesNom = "Abril"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 5 Entonces
		mesNom = "Mayo"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 6 Entonces
		mesNom = "Junio"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 7 Entonces
		mesNom = "Julio"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 8 Entonces
		mesNom = "Agosto"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 9 Entonces
		mesNom = "Septiembre" 
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 10 Entonces
		mesNom = "Octubre"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 11 Entonces
		mesNom = "Noviembre"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes = 12 Entonces
		mesNom = "Diciembre"
		Escribir  dia1 " del " mesNom ", " año1 
	FinSi
	si mes < 0 y mes > 12 Entonces
		Escribir "Tienes algun dato mal"
	FinSi
	FinSi

FinAlgoritmo
