///Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
///espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el
///		funcionamiento de la funci�n Subcadena(). 
///	NOTA:. En PSeInt, si queremos escribir sin que haya saltos de l�nea, al final de la operaci�n
///		"escribir" escribimos "sin saltar". Por ejemplo:  
///			Escribir sin saltar "Hola, "
///			Escribir sin saltar "c�mo est�s?" 
///		Imprimir� por pantalla: Hola, c�mo est�s? 




Algoritmo Guia2Ejercicio20
	//Definicion de las variables
	
	Definir frase, letras ,unir como cadena
	definir long , i como entero
	
	//Se pide la oracion
	escribir Sin Saltar "Escribir una frase: "
	Leer frase
	
	//Hago el calculo para la cantidad de separaciones que tiene que hacer
	long=Longitud(frase)
	unir=""
	
	//La funsion dimension me define una cantidad de variables estipuladas en este caso va a definir tantas variables 
	//como letras tenga la cadena +
	
	Dimension letras[long]
	
	
	para i=0 hasta long-1 Hacer
		
		letras[i]=Subcadena(frase,i,i)
		
		unir=unir+letras[i]+" "
	FinPara

	escribir unir
	
FinAlgoritmo
