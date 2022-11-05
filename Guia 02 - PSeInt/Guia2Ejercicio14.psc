///Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
///nota se pedirá de nuevo hasta que la nota sea correcta
 //Mientras expresion_logica Hacer
 //	secuencia_de_acciones
 //Fin Mientras


Algoritmo Guia2Ejercicio14
	Definir nota Como Entero
	Escribir "escribir una nota"
	leer nota
	mientras nota<0 o nota>10
		escribir "Ingresar nuevamente una nota"
		Leer nota
	FinMientras
	escribir "La nota esta entre 0 y 10"
	
FinAlgoritmo
