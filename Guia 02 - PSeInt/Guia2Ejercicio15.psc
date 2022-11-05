///Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
///solicite números al usuario hasta que la suma de los números introducidos supere el
///límite inicial. 



Algoritmo Guia2Ejercicio15
	definir suma,num, val_limite Como Entero
	
	escribir "Ingresar un valor limite "
	leer val_limite
	num=0
	suma=0
	
	Mientras suma<=val_limite Hacer
		
		escribir " Ingrese un numero "
		leer num
		suma= num + suma
		
		Escribir "suma=" suma
	FinMientras
	Escribir "la suma supero el valor limite"
FinAlgoritmo
