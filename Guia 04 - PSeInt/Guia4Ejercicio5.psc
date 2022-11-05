///5. Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer
///hasta que ingrese la opción Salir: 	
///	a. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera
///	aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt. 
///	b. Llenar Vector B. Este vector también es de tamaño N y se llena de manera
///	aleatoria. 
///c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar
///elemento a elemento. Ejemplo: C = A + B 
///	d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar
///elemento a elemento. Ejemplo: C = B - A 
///e. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar:
///	Vector A, B, o C. 
///	f. Salir. 
 



Algoritmo Guia4Ejercicio5
	
	definir N , i Como Entero
	definir opciones , opciones_vect Como Caracter
	definir A , B , C Como Entero
	
	Escribir "Ingrese tamaño de los vectores: " Sin Saltar
	Leer N
	dimension A(N)
	Dimension B(N)
	Dimension C(N)
	
	
	Hacer
		
	
	Escribir " Elija la opciones que desea realizar : "
	Escribir "	a. Llenar Vector A de manera aleatoria"
	Escribir " b. Llenar Vector B de manera aleatoria"
	Escribir " c. Llenar Vector C con la suma de los vectores A y B"
	Escribir " d. Llenar Vector C con la resta de los vectores B y A"
	Escribir " e. Mostrar"
	Escribir " f. Salir"
	leer opciones
	
	Segun opciones Hacer
		"a":
			para i = 0 hasta N-1 Hacer
				A(i)= Aleatorio(-100 , 100)
				
			FinPara
		"b":
			para i = 0 hasta N-1 Hacer
				B(i)= Aleatorio(-100 , 100)
				
			FinPara
		"c":
			para i = 0 hasta N-1 Hacer
				
				C(i)=A(i)+B(i)
				
			FinPara
			
		"d":
			para i = 0 hasta N-1 Hacer
				
				C(i)=A(i)-B(i)
				
			FinPara
			
		"e":
			
			
			Escribir "		1 Mostrar vector A "
			Escribir "		2 Mostrar vector B "
			Escribir "		3 Mostrar vector C "
			Escribir "		4 Mostrar vector todos "
			leer opciones_vect
			
			Segun opciones_vect Hacer
				"1":escribir "A=" 
					para i=0 hasta N-1 Hacer
						escribir A(i) " " Sin Saltar
					FinPara
				"2":escribir "B=" 
					para i=0 hasta N-1 Hacer
						escribir A(i) " " Sin Saltar
					FinPara
				"3":escribir "C=" 
					para i=0 hasta N-1 Hacer
						escribir A(i) " " Sin Saltar
					FinPara
				"4": 
					Escribir "A = "
					para i=0 hasta N-1 Hacer
						escribir  A(i) 
						
					FinPara
					Escribir "B = "
					para i=0 hasta N-1 Hacer
						escribir  B(i)
						
					FinPara
					Escribir "C = "
					para i=0 hasta N-1 Hacer
						escribir C(i) 
						
					FinPara
			FinSegun
			
			
			
	FinSegun
	
	
	
Mientras Que  opciones <> "f"
	
FinAlgoritmo
