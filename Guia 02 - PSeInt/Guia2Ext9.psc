///9. Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
///bajo las siguientes condiciones:  Un a�o divisible por 4 es bisiesto y no debe ser divisible
///por 100.  Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
///bisiesto. Nota: recuerde la funci�n mod de PSeInt 






Algoritmo Guia2Ext9
	definir year Como Entero
	Escribir "Ingrese un a�o:" Sin Saltar
	leer year
	
	si (year mod 4 = 0 y year mod 100 <>0) o (year mod 100 =0 y year mod 400 =0) Entonces
		
		Escribir "A�o biciesto"
	SiNo
		escribir "No es biciesto"
	
		
	FinSi
	
FinAlgoritmo
