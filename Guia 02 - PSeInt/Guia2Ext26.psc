
///26. Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
///invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
///deber� mostrar:
	
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
