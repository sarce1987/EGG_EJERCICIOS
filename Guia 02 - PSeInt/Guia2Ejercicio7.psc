///Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
///	caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
///es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
///programa mostrar� despu�s la frase final. 
///Nota: investigar la funci�n Longitud() y Concatenar() de Pseint. 


Algoritmo Guia2Ejercicio7
	Definir frase como cadena
	Escribir "Ingrese una frase o pabra"
	leer frase
	si Longitud(frase)=4 Entonces
		escribir Concatenar(frase,"!")
	SiNo
		escribir Concatenar(frase,"?")
	FinSi
FinAlgoritmo
