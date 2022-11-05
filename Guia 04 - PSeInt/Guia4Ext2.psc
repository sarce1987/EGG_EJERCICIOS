///2. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
///usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados. 


Algoritmo Guia4Ext2
	definir V , N , i , suma como enteros
	
	Escribir "Ingrese el tamaño del vector: "
	Leer N
	Dimension V(N)
	suma=0
	para i = 0 hasta N-1 Hacer
		V(i)= Aleatorio(-100 , 100 ) 
		suma = suma + V(i)
	FinPara
	
	para i=0 hasta N-1 Hacer
		Escribir V(i) " " Sin Saltar
	FinPara
	Escribir ""
	Escribir "El promedio de la suma de los elementos del vector es: " suma / N
	
FinAlgoritmo
