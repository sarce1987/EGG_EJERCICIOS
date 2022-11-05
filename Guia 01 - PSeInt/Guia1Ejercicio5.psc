///Escribir un programa que calcule cuántos litros de combustible consumió un automóvil.
///El usuario ingresase una cantidad de litros de combustible cargados en la estación y
///una cantidad de kilómetros recorridos, después, el programa calculará el consumo
///(km/lt) y se lo mostrará al usuario.

Algoritmo Ejercicio5
	Definir combustible, recorrido, ltconsumido,consumo Como Real
	Escribir "Cuantos litros de combustible se cargaron ?:"
	Leer combustible
	Escribir "Cuantos km se recorrieron ?:"
	Leer recorrido
	consumo=recorrido/combustible
	escribir "El auto tiene un consumo de " consumo "km/lt"
FinAlgoritmo
