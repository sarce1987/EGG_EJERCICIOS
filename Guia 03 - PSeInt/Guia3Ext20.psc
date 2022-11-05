///20. Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta
///	entre las letras "M" y "T"



Algoritmo Guia3Ext20
	
	definir letra como caracter
	leer letra
	
	comparar_letra(letra)
	
	
	
FinAlgoritmo

subproceso comparar_letra(letra Por Valor)
	si letra > "m" y letra< "t" Entonces
		escribir "la letra esta entre la m y la t "
	SiNo
		escribir "la letra no se encuentra entre la m y la t "
	FinSi
	
	
FinSubProceso
	