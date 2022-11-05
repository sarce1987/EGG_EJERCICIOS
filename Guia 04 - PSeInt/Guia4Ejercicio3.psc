
///3. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
///usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a
///buscar también debe ser ingresado por el usuario). El programa debe indicar la posición
///donde se encuentra el valor. En caso que el número se encuentre repetido dentro del
///arreglo se deben imprimir todas las posiciones donde se encuentra ese valor. 
///Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar
///un mensaje.


Algoritmo Guia4Ejercicio3
	definir M , i , se_encontro Como Entero
	definir v , val_busc como real
	Escribir "Tamaño del vector: " Sin Saltar
	leer M
	Dimension v(M)
	
	//Rellenar los valores del vector
	para i=0 hasta M-1 Hacer
		escribir "Ingrese el valor v(" i "): " Sin Saltar
		leer v(i)
	FinPara
	
	escribir "Ingrese el valor buscado: " Sin Saltar
	leer val_busc
	
	se_encontro=0
	para i=0 hasta M-1 Hacer
		si v(i)= val_busc Entonces
			Escribir "Se encuentra en la posicion v(" i ")"
			se_encontro=1  //si no se encuentra el valor esta variable queda en 0
		FinSi
		
	FinPara
	
	si se_encontro <> 1 Entonces
		Escribir "No se encontro el numero"
	FinSi
	
FinAlgoritmo



