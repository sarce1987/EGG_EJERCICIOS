///17. Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
///convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10).  Nota:
///investigar la funci�n trunc().

Algoritmo Guia2Ext17
	definir num , i Como entero
	definir aux , div Como Real
	leer num
	
	i=0
	aux=num
	
	mientras trunc(aux)>0 hacer
		div=aux/10
		aux=div
		i=i+1
	FinMientras
	
	Escribir i
	
FinAlgoritmo
