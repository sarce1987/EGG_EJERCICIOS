///Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
///es una ?A?.  Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
///que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
///investigar la función Subcadena de Pseint. 


Algoritmo Guia2Ejercicio9
	//definicion de variables
	definir	palabra como cadena
	// Pedir el valor
	escribir "Escribir una frase o palabra"
	leer palabra
	//Evaluar si la primera letra de la cadena comienza con A
	
	si Subcadena(palabra,0,0)="A" Entonces
		Escribir "CORRECTO" 
	SiNo
		escribir "INCORRECTO"
			
	FinSi
FinAlgoritmo
