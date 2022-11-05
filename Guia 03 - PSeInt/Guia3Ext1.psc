///11. Realizar una función que calcule y retorne la suma de todos los divisores del número n
///distintos de n. El valor de n debe ser ingresado por el usuario. 


Algoritmo Guia3Ext1
	definir num Como Entero
	Escribir "Ingrese un numero: " Sin Saltar
	leer num
	Escribir "La suma de todos los divisores es: " sumadedivisores(num)
	
FinAlgoritmo


Funcion suma <- sumadedivisores(n)
	definir suma , i Como entero
	
	suma=0
	para i=1 hasta n-1 Hacer
		si n mod i = 0 Entonces
			suma = suma + i
		FinSi
	FinPara
	
FinFuncion
	