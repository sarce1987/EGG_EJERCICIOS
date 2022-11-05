///Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
///ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
///que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".  



Algoritmo Guia2Ejercicio4
	Definir val Como Caracter
	Escribir "Ingrese el caracter S o N "
	Leer val
	//Para comparar caracteres se pueden poner o entre comillas dobles o simples igualmente los tomas "S" o 'S'
	
	si val = "S" o val = "N" Entonces
		escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
		
		
	FinSi
	
FinAlgoritmo
