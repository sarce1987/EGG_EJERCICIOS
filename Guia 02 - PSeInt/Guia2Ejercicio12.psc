///Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
///En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar". 
///Nota: investigar la funci�n mod de PSeInt

Algoritmo Guia2Ejercicio12
	Definir val Como Entero
	Escribir "Ingrese un valor entero"
	leer val
	si	val=0 entonces
		escribir "El valor no es par ni impar"
	SiNo
		si val mod 2 =0 entonces
			escribir "el numero es par"
		SiNo
			escribir "el numero es impar"
			
		FinSi
	FinSi
FinAlgoritmo
