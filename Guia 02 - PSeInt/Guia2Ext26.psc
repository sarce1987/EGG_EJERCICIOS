
///26. Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
///invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
///deberá mostrar:
	
///	***** 
///	**** 
///	*** 
///	** 
///	* 




Algoritmo Guia2Ext26
	
	Definir alt ,i , j,b Como Entero //Altura
	
	Escribir "Ingresar altura:"
	leer alt
	b=alt
	para i=1 hasta alt Hacer
		
		para j=1 hasta b Hacer
			escribir "* " Sin Saltar
		FinPara
		escribir " "
		b=b-1

	FinPara
	
FinAlgoritmo
