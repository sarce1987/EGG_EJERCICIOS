
///10. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
///realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
///otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar
///la matriz y los resultados por pantalla. 

Algoritmo Guia4Ejercicio10
	
	definir A , n , m Como Entero
	
	Escribir "Ingresar cant de filas de la matriz: " Sin Saltar
	leer n
	Escribir "Ingresar cant de columnas de la matriz: " Sin Saltar
	leer m
	
	Dimension A(n,m)
	
	llenado(A , n , m)
	sumavector(A , n , m)
	
FinAlgoritmo



SubProceso llenado(A,n,m)
	Definir i , j Como Entero
	
	//Llenar matriz
	para i = 0 hasta n-1 Hacer
		para j= 0 hasta m-1 Hacer
			A(i,j)= aleatorio(0,20)
		FinPara
		
	FinPara
	
	//Mostrar matriz
	para i = 0 hasta n-1 Hacer
		para j= 0 hasta m-1 Hacer
			escribir A(i,j) , " " Sin Saltar
		FinPara
		Escribir ""
	FinPara	
	
FinSubProceso


SubProceso sumavector(A,n,m)
	definir suma , i , j Como Entero
	suma = 0
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 Hacer
			suma = suma + A(i,j)
		FinPara
	FinPara
	
	Escribir "La suma de los elementos de la matriz es = " suma
	
	
FinSubProceso
	