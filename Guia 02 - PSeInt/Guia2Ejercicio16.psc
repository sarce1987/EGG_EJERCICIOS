
///Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
///ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,....,-1; realizar un programa que calcule el promedio de los
///	números ingresados. Suponemos que el usuario no insertará número negativos.


Algoritmo Guia2Ejercicio16
	Definir i , num, suma como Entero
	Definir  promedio Como Real
	
	num=0
	i=0
	suma=0
	mientras num>=0 Hacer
		suma=suma+num
		//Contador
		i=i+1
		escribir "Ingrese un numero"
		leer num
		
	FinMientras
	
	promedio = suma/(i-1)
	
	Escribir " El promedio es :" promedio
FinAlgoritmo
