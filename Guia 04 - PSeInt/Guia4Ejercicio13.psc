
///13. Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
///que tiene como propiedad especial que la suma de las filas, las columnas y las
///diagonales es igual. Por ejemplo:  
	
///	2   7   6  
///	9   5   1  
///	4   3   8 
	
///	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir
///	un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso
///	de que sea mágica escribir la suma. Además, el programa deberá comprobar que los
///	números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el
///	tamaño de la matriz que no debe superar orden igual a 10.  
 
Algoritmo Guia4Ejercicio13
	definir M , T,  n , i , j , F , C , D1 , D2 Como Entero //F= suma fila C=suma columna
	
	
	Hacer
		Escribir  "Ingrese el tamaño de la matriz cuadrada: " Sin Saltar
		leer n //Donde n es el tamaño de la matriz
		si n>10 Entonces
			Escribir "El valor ingresado es incorrecto"
		FinSi
	Mientras Que n>10
	
	Dimension M(n,n)
	Dimension T(n,n)
	Dimension F(n)
	Dimension C(n)
	D1=0
	D2=0
	
	
	
		para i = 0 hasta n-1 Hacer
			para j=0 hasta n-1 Hacer
				Hacer
					Escribir "Ingrese el valor M(" i , "," j ")"
					leer M(i,j)
					si M(i,j)<1 o M(i,j)>9 Entonces
						Escribir "El valor ingresado es incorrecto"
					FinSi
				Mientras Que M(i,j)<1 o M(i,j)>9
				
			FinPara
			
		FinPara
		
		para i=0 hasta n-1 Hacer
			
			para j = 0 hasta n-1 Hacer
				
				T(j , i ) = M(i , j)
				
			FinPara
			
		FinPara
		
		
		Escribir "La matriz ingresada es: "
		para i = 0 hasta n-1 Hacer
			para j= 0 hasta n-1 Hacer
				escribir M(i,j) " " Sin Saltar
			FinPara
			Escribir ""
		FinPara
		Escribir "La matriz transpuesta es: "
		para i = 0 hasta n-1 Hacer
			para j= 0 hasta n-1 Hacer
				escribir T(i,j) " " Sin Saltar
			FinPara
			Escribir ""
		FinPara
		
		
		
		
		sumafilascolumnas(M , n , F , D1 , D2 )
		sumafilascolumnas(T , n , C, D1 , D2)
		comparar(F , C , D1 , D2 , n)
FinAlgoritmo



/////////////// ESTE SUBPROCESO SUMA LAS FILAS DE UNA MATRIZ Y SUS DIAGONALES //////////////////

subProceso sumafilascolumnas(A , n , S Por Referencia , D1 Por Referencia , D2 Por Referencia)
	definir  suma , i , j Como Entero //S es un vector suma que da la suma de las filas
	
	para i = 0 hasta n-1 Hacer
		suma=0
		para j=0 hasta n-1 Hacer
			
			suma = A(i,j) + suma
			
		FinPara
		S(i)= suma
	FinPara
	
	para i=0 hasta n-1 Hacer
		Escribir S(i) " " sin saltar
		
	FinPara
	Escribir ""
	
	D1 = 0
	D2 = 0
	para i = 0 hasta n-1 Hacer
		para j = 0 hasta n-1 Hacer
			si i=j Entonces
				D1 = D1 + A(i,j)
			FinSi
			
			si i=i y j=n-i-1 Entonces
				D2 = D2 + A(i,j)
			FinSi
			
		FinPara
	FinPara
	
	
	Escribir "Suma diagonal 1: " D1
	Escribir "Suma diagonal 2: " D2
	
	
FinSubProceso

/////// ESTE SUBPROCESO COMPARA SI LAS SUMAS DE FILAS, LAS COLUMNAS Y LAS DIAGONALES SON IGUALES //////

subproceso comparar(F , C , D1 , D2 , n)
	definir i Como Entero
	definir log como logico
	
	log = Verdadero
	
	
	para i=0 hasta n-1 Hacer
		si F(i) = C(i) y F(i) = D1 y F(i) = D2 Entonces
			log = log&verdadero
		SiNo
			log = Falso
			
		FinSi
		
	FinPara
	
	si log = verdadero Entonces
		escribir " La matriz es Magica "
	SiNo
		escribir " La matriz no es Magica "
		
	FinSi
	
FinSubProceso
