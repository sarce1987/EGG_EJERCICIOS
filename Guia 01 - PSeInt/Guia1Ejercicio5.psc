///Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil.
///El usuario ingresase una cantidad de litros de combustible cargados en la estaci�n y
///una cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo
///(km/lt) y se lo mostrar� al usuario.

Algoritmo Ejercicio5
	Definir combustible, recorrido, ltconsumido,consumo Como Real
	Escribir "Cuantos litros de combustible se cargaron ?:"
	Leer combustible
	Escribir "Cuantos km se recorrieron ?:"
	Leer recorrido
	consumo=recorrido/combustible
	escribir "El auto tiene un consumo de " consumo "km/lt"
FinAlgoritmo
