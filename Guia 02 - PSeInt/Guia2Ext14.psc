////14. Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
///continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
///m�ximo y m�nimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
///uno a una variable. El programa terminar� cuando se escriba un n�mero que no
///pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
///n�meros ingresados dentro del intervalo. 




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
