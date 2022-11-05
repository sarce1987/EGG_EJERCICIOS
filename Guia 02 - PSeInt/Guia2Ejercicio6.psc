///Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
///usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje
///por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
///"INCORRECTO".  
///Nota: investigar la función Longitud() de Pseint




Algoritmo Guia2Ejercicio6
	//Definir las variables necesarias
	definir palabra como cadena
	
	//Pedir palabra
	Escribir "Ingrese frases o palabras de maximo 6 caracteres"
	leer palabra
	
	
	si Longitud(palabra) >6 Entonces
		Escribir "INCORRECTO"
	SiNo
		Escribir "CORRECTO"
	FinSi
FinAlgoritmo
