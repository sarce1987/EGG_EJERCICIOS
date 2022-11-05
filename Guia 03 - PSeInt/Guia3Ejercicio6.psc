///6. Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo
///entero. La variable A, debe terminar con el valor de la variable B.

Algoritmo Guia3Ejercicio6
	definir A , B Como Entero
	Escribir "Ingrese la variable A y la B"
	leer A , B
	intercambio(A,B)
	Escribir A
	Escribir B
	
FinAlgoritmo

//Al ponerlo por referencia lo que hacemos es el parametro num_a va a sobreescribir a la variable A del programa

SubProceso intercambio (num_a Por Referencia , num_b Por Referencia)
	definir aux_A , aux_B Como Entero
	aux_A = num_a
	aux_B = num_b
	num_b=aux_A
	num_a=aux_B
FinSubProceso
	