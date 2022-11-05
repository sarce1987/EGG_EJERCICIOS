
///11. Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la
///	diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe
////generar otro subproceso para imprimir la matriz. 


Algoritmo Guia4Ejercicio11
	definir A , m  Como Entero
	Escribir "Ingrese la dimension de la matriz cuadrada" Sin Saltar
	leer m
	Dimension A(m,m)
	
	llenarmatriz(A , m)
	imprimirmatriz(A , m)
	
FinAlgoritmo


SubProceso llenarmatriz(A , m)
	definir i , j Como Entero
	
	
	para i=0 hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			si i=j Entonces
				A(i,j) = 0
			SiNo
				A(i,j) = Aleatorio(0 , 9 )
			FinSi
		FinPara
	FinPara
		
FinSubProceso
	
	
SubProceso imprimirmatriz(A , m)
	definir i , j Como Entero
	
	para i=0 hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			Escribir A(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	