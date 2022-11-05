

///Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
///primera letra de la frase es igual a la ultima letra de la frase. Se deberá de imprimir un 
///mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
///"INCORRECTO". 

Algoritmo Guia2Ejercicio10
	//definicion de variables
	definir	palabra, primera_letra, ultima_letra como cadena
	// Pedir el valor
	escribir "Escribir una frase o palabra"
	leer palabra
	
	//Calculos de la primera y ultima letra
	primera_letra=Subcadena(palabra,0,0)
	ultima_letra=Subcadena(palabra,Longitud(palabra)-1,Longitud(palabra)-1)
	Escribir primera_letra
	Escribir ultima_letra
	
	si primera_letra = ultima_letra Entonces
		Escribir "CORRECTO" 
	SiNo
		escribir "INCORRECTO"
		
	FinSi
FinAlgoritmo