///12. Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos
///y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna
///de ceros.

///Por ejemplo, nuestro matriz final debería verse así:
	
///	111111111111111
///	100000000000001 
///	100000000000001 
///	100000000000001 
///	111111111111111 


Algoritmo Guia4Ext12
	
	definir M , i , j Como Entero
	dimension M(5 , 15)
	
	para i=0 hasta 4 Hacer
		para j = 0 hasta 14 Hacer
			si i=0 o i=4 o j=0 o j =14 Entonces
				M(i,j)=1
			sino 
				M(i,j)=0
			FinSi
			
		
		FinPara
	FinPara
	
	para i = 0 hasta 4 hacer 
		para j=0 hasta 14 hacer
			
			Escribir M(i,j) " " Sin Saltar
			
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
