///11. Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
///llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no
///	conoces lo que es una traspuesta, mirar el siguiente link: Matriz Traspuesta



Algoritmo Guia4Ext11
	definir A ,T, n , m , i , j Como Entero
	Escribir "Ingrese el numero de filas de la matriz: " Sin Saltar
	leer n
	Escribir "Ingrese el numero de columnas de la matriz: " Sin Saltar
	leer m
	Dimension A(n,m) , T(m,n)
	
	
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 hacer
			A(i,j) = Aleatorio(1 , 100)
		FinPara
	FinPara
	Escribir "La matriz es: "
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta m-1 hacer
			escribir A(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	
	para i= 0 hasta n-1 hacer
		para j=0 hasta m-1 Hacer
			
			T(j,i) = A(i,j)
			
		FinPara
		
	FinPara
	
	Escribir "La transpuesta es: "
	para i = 0 hasta m-1 Hacer
		para j = 0 hasta n-1 hacer
			escribir T(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	
	
FinAlgoritmo
