///9. Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
///bajo las siguientes condiciones:  Un año divisible por 4 es bisiesto y no debe ser divisible
///por 100.  Si un año es divisible por 100 y además es divisible por 400, también resulta
///bisiesto. Nota: recuerde la función mod de PSeInt 






Algoritmo Guia2Ext9
	definir year Como Entero
	Escribir "Ingrese un año:" Sin Saltar
	leer year
	
	si (year mod 4 = 0 y year mod 100 <>0) o (year mod 100 =0 y year mod 400 =0) Entonces
		
		Escribir "Año biciesto"
	SiNo
		escribir "No es biciesto"
	
		
	FinSi
	
FinAlgoritmo
