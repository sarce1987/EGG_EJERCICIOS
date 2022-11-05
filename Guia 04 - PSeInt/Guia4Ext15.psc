
///15. Realizar un programa que permita visualizar el resultado del producto de una matriz de
///enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
///inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de
///cómo se realiza la multiplicación entre matrices consultar el siguiente link:  
	
///https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector 


Algoritmo Guia4Ext15
	
	Definir A , B , C , i , j , col Como Entero
	
	Dimension A(3,3) , B(3) , C(3)
	
	para i = 0 hasta 2 Hacer
		para j = 0 hasta 2 Hacer
			A(i,j) = Aleatorio(0 , 10)
		FinPara
	FinPara
	
	para i = 0 hasta 2 Hacer
		B(i) = Aleatorio(0 , 10)
	FinPara
	
	Escribir "La matriz A es: "
	para i = 0 hasta 2 Hacer
		para j = 0 hasta 2 hacer
			escribir A(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir "El vector B es: "
	para i = 0 hasta 2 Hacer
		
			escribir B(i) 	
		
	FinPara
	
	para i = 0 hasta 2 Hacer
		col=0
		para j = 0 hasta 2 Hacer
			
			col = A(i,j)* B(j) + col
			C(i)= col
		FinPara
	FinPara
	
	escribir " La multiplicacion es "
	para i = 0 hasta 2 hacer 
		escribir C(i)
	FinPara
	
FinAlgoritmo
