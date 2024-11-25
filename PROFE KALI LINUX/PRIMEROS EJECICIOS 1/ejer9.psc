Algoritmo ejer9
	Escribir "¿Tienes bachillerato?"
	Leer bachiller
	si bachiller = 'no'Entonces
		Escribir "As superado una prueba de acceso?"
		Leer pruebaAcces
		si pruebaAcces = "no" Entonces
			Escribir "no eres apto"
		FinSi
		
	FinSi
	si bachiller = "si" o pruebaAcces = "si" Entonces
		Escribir  "Puede acceder a cursar el ciclo formativo de grado superior"
		
	FinSi
	
FinAlgoritmo
