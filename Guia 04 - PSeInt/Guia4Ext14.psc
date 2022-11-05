///14. Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las
///dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3
///columna se deberá almacenar el resultado de sumar el número de la primera y segunda
///columna. Mostrar la matriz de la siguiente forma: 
	
///	3 + 5 = 8 
///	4 + 3 = 7
///	1 + 4 = 5 



Algoritmo Guia4Ext14
	definir M , n , i , j , suma , S como enteros
	
	Escribir "Ingrese la cantidad de filas de la matriz: " Sin Saltar
	leer n
	Dimension M(n,3)
	Dimension S(n)
	suma=0
	para i = 0 hasta n-1 Hacer
		para j=0 hasta 1 Hacer
			Escribir "Ingrese el valor M(" i " , " j ")" Sin Saltar
			leer M(i,j)
			
			
		FinPara
	FinPara
	
	para i=0 hasta n-1 Hacer
		suma=0
		para j=0 hasta 1 Hacer
			suma = suma +	M(i,j)
			S(i)= suma
		FinPara
	FinPara
	
	para i=0 hasta n-1 Hacer
		M(i,2) = S(i)
	FinPara
	
	
	para i=0 hasta n-1 Hacer
		
			
			Escribir  M(i,0) , " + " M(i,1) " = " S(i)
			
	
		
	FinPara
	
FinAlgoritmo
