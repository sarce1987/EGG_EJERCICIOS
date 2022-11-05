
///10. Realizar un programa que rellene de números aleatorios una matriz a través de un
///subprograma y generar otro subprograma que muestre por pantalla la matriz final.



Algoritmo Guia4Ext10
	
	definir M , f , c Como Entero
	Escribir "Ingrese el numero de filas de la matriz: " Sin Saltar
	leer f
	Escribir "Ingrese el numero de columnas de la matriz: " Sin Saltar
	leer c
	Dimension M(f,c)
	llenarmatriz(M ,f ,c)
	mostrarmatriz(M , f ,c)
FinAlgoritmo

SubProceso llenarmatriz(M , f , c)
	definir i , j Como Entero
	
	para i=0 hasta f-1 Hacer
		para j =0 hasta c-1 Hacer
			
			M(i,j) = Aleatorio(-100 , 100)
			
		FinPara
	FinPara
FinSubProceso


subproceso mostrarmatriz(M , f , c)
	definir i , j Como Entero
	para i = 0 hasta f-1 Hacer
		para j =0 hasta c-1 Hacer
			
			Escribir M(i,j) " " Sin Saltar
			
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	