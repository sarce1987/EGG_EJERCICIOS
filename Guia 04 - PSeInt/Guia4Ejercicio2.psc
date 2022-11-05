
///2. Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
///y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
///al arreglo. 

Algoritmo Guia4Ejercicio2
	dimension v(10)
	definir v , suma , resta , multi como real
	definir i Como Entero
	
	suma=0
	resta=0
	multi=1
	
	
	para i=0 hasta 9 Hacer
		Escribir "Ingrese el valor " i " : " Sin Saltar
		leer v(i)
	FinPara

	para i=0 hasta 9 Hacer
		suma= suma + v(i)
		resta= v(i) - resta
		multi= multi*v(i)
	FinPara
	
	escribir " suma = " suma
	escribir " resta = " resta
	escribir " multiplicacion = " multi	
	
FinAlgoritmo
