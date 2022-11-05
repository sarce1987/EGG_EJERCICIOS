///Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del 
///	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
///	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
///	debe cobrar al cliente e imprimirlo por pantalla.  



Algoritmo Guia2Ext2
	definir mes Como Caracter
	definir importe , total como real
	
	escribir "Ingresar el mes: "
	leer mes
	escribir "ingresar el importe"
	leer importe
	
	si mes = "septiembre" o mes = "octubre" o mes = "noviembre" Entonces
		total= importe*0.9
		escribir " El importe a pagar tiene un descuento del 10% y es de : " total
	SiNo
		escribir " El mes ingresado no tiene descuento el importe es de : " importe
	FinSi
	
FinAlgoritmo
