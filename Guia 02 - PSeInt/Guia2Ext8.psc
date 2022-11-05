///Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
///	entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener
////la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
///	compra, y el monto total que tiene que pagar por el total de la compra. 




Algoritmo Guia2Ext8
	definir cant_llantas Como Entero
	definir precio , total Como Real
	
	escribir " Ingresar la cantidad de llantas a comprar: " Sin Saltar
	leer cant_llantas
	
	
	si cant_llantas< 5  Entonces
		precio = 3000 //c/u
		total = cant_llantas*precio
		Escribir "Por cada uno paga $" precio
		Escribir "El total de la compra es de $" total
	SiNo
		si cant_llantas>=5 y cant_llantas<=10 Entonces
			precio = 2500 //c/u
			total = cant_llantas*precio
			Escribir "Por cada uno paga $" precio
			Escribir "El total de la compra es de $" total
		SiNo
			
			si cant_llantas> 10  Entonces
				precio = 2000 //c/u
				total = cant_llantas*precio
				Escribir "Por cada uno paga $" precio
				Escribir "El total de la compra es de $" total
			FinSi
			
		FinSi
		
	FinSi
FinAlgoritmo
