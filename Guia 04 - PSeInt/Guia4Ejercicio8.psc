///8. Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el
///usuario y los muestre por pantalla. 


Algoritmo Guia4Ejercicio8
	
	Definir M , i , j Como Entero
	dimension M(3,3)
	Escribir "tamaño de la matriz: " 3*3
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			Escribir "Ingrese el valor M(" i "," j "): " Sin Saltar
			leer M(i,j)
			
		FinPara
	FinPara
	
	
	para i = 0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			Escribir M(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
