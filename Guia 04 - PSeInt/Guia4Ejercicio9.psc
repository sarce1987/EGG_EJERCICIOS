
///9. Escribir un programa que realice la búsqueda lineal de un número entero ingresado por
///el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
///coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
///En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo Guia4Ejercicio9
	definir M , num , i , j ,encontrado como entero
	dimension M(5,5)
	
	//Esto llena de numeros aleatorios la matriiz M
	para i=0 hasta 4 Hacer
		para j=0 hasta 4 Hacer
			M(i,j)=Aleatorio(0,20)
		FinPara
	FinPara
	
	Escribir "Ingrese el numero que busca" Sin Saltar
	leer num
	
	encontrado = 0
	para i=0 hasta 4 Hacer
		para j=0 hasta 4 Hacer
			si num = M(i,j) Entonces
				encontrado = 1
				
				escribir "El numero se encuentra en la fila " i ", columna " j 
			FinSi
		FinPara
	FinPara
	si encontrado = 0 Entonces
		escribir " El valor no se encontro "
	FinSi
	
	
	para i = 0 hasta 4 Hacer
		para j=0 hasta 4 Hacer
			Escribir M(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
