//1. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
//y los muestre por pantalla


Algoritmo Guia4Ext1
	definir A , B , i como enteros
	
	dimension A(5) , B(5)
	
	para i = 0 hasta 4 Hacer
		A(i) = Aleatorio(-100 , 100)
		B(i) = Aleatorio(-100,100)
		
	FinPara
	
	Escribir "VectorA = "
	para i = 0 hasta 4 Hacer
		Escribir A(i) , " " Sin Saltar
	FinPara
	Escribir ""
	
	Escribir "VectorB = "
	para i = 0 hasta 4 Hacer
		Escribir B(i) , " " Sin Saltar
	FinPara
	Escribir ""
	
FinAlgoritmo
