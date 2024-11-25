Algoritmo ejer7
	Escribir "Digame en que mes estamos porfavor"
	Leer Mes1
	Escribir "Digame el Importe"
	Leer importe
	si mes1 = "Octubre" Entonces
		totalPro = importe - (importe/100*15)
		Escribir "El total del porducto con el descuento es " totalPro
	FinSi
	
	si mes1 <> "Octubre" Entonces
	totalPro = importe
	Escribir  "Ya que no estamos en octubre el importe no tendra descuento y sera " totalPro
	FinSi

FinAlgoritmo
