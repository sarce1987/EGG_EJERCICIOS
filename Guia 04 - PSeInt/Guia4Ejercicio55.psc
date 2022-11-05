///1 | 0 | 0 | 0 | 0 | 1
///0 | 1 | 0 | 0 | 1 | 0
///0 | 0 | 1 | 1 | 0 | 0
///0 | 0 | 1 | 1 | 0 | 0
///0 | 1 | 0 | 0 | 1 | 0
///1 | 0 | 0 | 0 | 0 | 1
///Realizar un algoritmo que cree y muestre una matriz cuadrada como la que muestro.
///	Luego aislar y comparar la diagonal principal con la secundaria y determinar si son identicas


Algoritmo Guia4Ejercicio55
	definir M , i , j , n ,Dp , Ds como entero
	definir resp Como Logico
	Escribir "Ingrese el numero de filas de la matriz cuadrada: "
	leer n
	Dimension M(n,n) , Dp(n) , Ds(n)
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir "Ingrese el valor M(" i "," j  ") de la matriz: " sin saltar
			leer M(i,j)
		FinPara
	FinPara
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			si i=j Entonces
				Dp(i) = M(i,j)
			FinSi
		FinPara
	FinPara
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			si j=n-1-i Entonces
				Ds(i) = M(i,j)
			FinSi
		FinPara
	FinPara
	
	para i = 0 hasta n-1 Hacer
		Escribir Dp(i) " "
	FinPara
	Escribir "---"
	para i = 0 hasta n-1 Hacer
		Escribir Ds(i) " "
	FinPara
	
	
	resp = verdadero
	
	para i=0 hasta n-1 Hacer
		si Ds(i) = Dp(i) Entonces
			resp = verdadero & resp
		SiNo
			resp = Falso
		FinSi
	FinPara
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir M(i,j) "|" Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	si resp=Verdadero Entonces
		Escribir "La diagonal principal y secundaria son iguales"
	SiNo
		Escribir "Las diagonales no son iguales"
		
	FinSi
FinAlgoritmo
