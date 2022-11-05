///10. Escribir una función recursiva que devuelva la suma de los primeros N enteros. 
//Si ingreso 3 el programa debe hacer lo siguiente
//de sumar 3 + 2 + 1





Algoritmo Guia3Ejercicio10
	definir num Como Entero
	Escribir "Ingrese un numero:"
	leer num
	Escribir "Respuesta: " suma(num)
	
FinAlgoritmo




funcion f<- suma(n) 
	definir f  Como Entero
	
	si n = 1 Entonces
		f=1
	SiNo
		f=n+suma(n-1)
	FinSi
	
	
FinFuncion
	