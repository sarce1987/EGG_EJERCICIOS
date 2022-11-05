
///Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá
///	al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
///	mostrar un mensaje por pantalla indicándolo. 


Algoritmo Guia2Ejercicio2
	//Definicion de variables
	Definir sueldo_min , sueldo_act Como Entero
	
	//Pedir los valores
	Escribir "Ingrese el sueldo minimo y a continuacion el sueldo actual"
	Leer sueldo_min , sueldo_act
	
	//Definir la condicion de si el sueldo actual es mayor al minimo entonces indicar en pantalla
	
	si	sueldo_act>sueldo_min Entonces
		escribir "Su sueldo es mayor al sueldo minimo"
		
	FinSi
FinAlgoritmo
