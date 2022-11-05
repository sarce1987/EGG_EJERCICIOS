///18. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
///numero es capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc.
///	No podemos transformar el numero a cadena para realizar el ejercicio. 


Algoritmo Guia3Ext18
	definir num ,resp Como Entero
	
	Escribir  "Ingrese un numero: "
	leer num
	
	resp = capicua(num)
	
FinAlgoritmo



funcion c<-capicua(num)
	Definir  c , resto , num_aux Como Entero
	Definir aux como cadena
	
	num_aux= num
	aux=""
	
	mientras num_aux > 0 Hacer
		
		resto = num_aux mod 10
		num_aux = trunc(num_aux / 10)
		
		
		
		Escribir  aux
	FinMientras
	
	si	num / num_aux = 1 Entonces
		
		
		
	FinSi
	
	//!!!!!!! FALTA TERMINAR !!!!!
	
FinFuncion
	