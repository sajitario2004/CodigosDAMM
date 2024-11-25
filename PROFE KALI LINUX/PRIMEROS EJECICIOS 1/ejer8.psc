Algoritmo ejer8
	Escribir "Escriba un numero" 
	Leer Num1
	si Num1=0 Entonces
		Escribir "El numero escrito es 0 por lo tanto no es ni impar ni par"
	SiNo
		Modulo1 = Num1 MOD 2
		si Modulo1 = 0 Entonces
			Escribir "El numero escrito es par"
		SiNo
			Escribir "El numero escrito es impar"
		FinSi
	FinSi
FinAlgoritmo
