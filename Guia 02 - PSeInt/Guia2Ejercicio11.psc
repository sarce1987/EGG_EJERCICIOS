/// Construir un programa que simule un men� de opciones para realizar las cuatro
///	operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
///	num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
///car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
///	o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n. 


Algoritmo Guia2Ejercicio11
	
	Definir val1 , val2 Como entero
	Definir car_operacion Como Caracter
	definir resultado Como Real
	definir aux Como Entero
	
	//Pedir ingresar los valores
	Escribir "Ingresar los valores para realizar las operaciones ,val1 y val2"
	Leer val1 , val2
	Escribir "Ingresar que tipo de operacion desea realizar:"
	Escribir "s = suma"
	Escribir "m = multiplicacion"
	Escribir "r = resta"
	Escribir "d = division"
	leer car_operacion
	
	si	car_operacion = 's' Entonces
		aux=1
	FinSi
	si	car_operacion = 'r' Entonces
		aux=2
	FinSi
	si	car_operacion = 'm' Entonces
		aux=3
	FinSi
	si	car_operacion = 'd' Entonces
		aux=4
	FinSi
	si	car_operacion <> 's' y  car_operacion <>'r' y car_operacion <>'m' y car_operacion <>'d'  Entonces
		aux=5
	FinSi
	
	Segun aux Hacer
		1:
			resultado=val1+val2
			Escribir "val1+val2 = " resultado
		2:
			resultado=val1-val2
			Escribir "val1-val2 = " resultado
		3:
			resultado=val1*val2
			Escribir "val1*val2 = " resultado
		4:
			resultado=val1/val2
			Escribir "val1/val2 = " resultado
		De Otro Modo:
			Escribir "se ha espesificado mal el caracter"
			
	Fin Segun
	
	
	
FinAlgoritmo
