
///2. Realizar una función que valide si un numero es impar o no. Si es impar la función debe
///devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe
///	tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo. 




Algoritmo Guia3Ejercicio2
	Definir num Como Entero
	Escribir "Ingrese un numero: " Sin Saltar
	leer num
	si es_par(num) = 0 Entonces
		Escribir "La funcion es par"
	SiNo
		Escribir "La funcion es impar"
		
	FinSi
	
	
FinAlgoritmo

//Esta funcion devuelve el valor par que es el resto de la divicion entre el parametro recibido del programa y 2
// si el resto es igual a cero el numero es par
// sino es impar

Funcion par <- es_par ( num )
	definir par como entero
	par= num mod 2
Fin Funcion
