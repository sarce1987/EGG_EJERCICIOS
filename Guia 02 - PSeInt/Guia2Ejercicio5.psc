/// https://www.youtube.com/watch?v=M3-D56444uE&ab_channel=TecnoHobbies
///Realizar un programa que pida un numero y determine si ese numero es par o impar.
///Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un
///número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
///la función mod de Pseint. 


Algoritmo Guia2Ejercicio5
	definir num , resto Como Entero
	
	Escribir "Ingresar un numero entero"
	leer num
	
	//Resto si num es par deberia ser igual a cero
	resto = num mod 2
	
	//Por lo tanto hacemos el condicional
	si resto=0 Entonces
		Escribir "El numero ingresado es par"
	SiNo
		Escribir "El numero ingresado es impar"
	FinSi
	
FinAlgoritmo
