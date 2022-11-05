////14. Escriba un programa que solicite dos números enteros (mínimo y máximo). A
///continuación, se debe pedir al usuario que ingrese números enteros situados entre el
///máximo y mínimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
///uno a una variable. El programa terminará cuando se escriba un número que no
///pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
///números ingresados dentro del intervalo. 




Algoritmo Guia2Ext14
	definir max , min , num , i como enteros
	i=0
	
	escribir "maximo: " Sin Saltar
	leer max	
	Escribir "minimo: " Sin Saltar
	leer min
	Escribir "Ingresar un numero entre " min " y " max " : " Sin Saltar
	leer num
	
	
	
	
	mientras num>=min y num<=max Hacer
		Escribir "Ingresar un numero entre " min " y " max " : " Sin Saltar
		leer num
		i=i+1
	FinMientras
	
	Escribir "La cantidad de numeros ingresados dentro del intervalo fue de : " i
FinAlgoritmo
