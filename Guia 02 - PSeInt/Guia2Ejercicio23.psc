
///Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
///m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
///recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
///compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
///vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
///deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
///	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
///cada venta.

Algoritmo Guia2Ejercicio23
	//cant_vend: cantidad de vendedores
	//cant_vent: cantidad de ventas realizadas por vendedor
	
	definir cant_vendedores , cant_ventas, i , j Como Entero 
	definir sueldo_base, cobro_venta , comision ,sueldo_total Como Real
	
	Escribir "Ingrese la cantidad de vendedores" Sin Saltar
	leer cant_vendedores
	
	
	Dimension sueldo_base[cant_vendedores]
	Dimension cobro_venta[200]
	
	
	para i=0 hasta cant_vendedores-1 Hacer
		escribir "Vendedor " i+1
		Escribir "  a) Cual es su sueldo base: " Sin Saltar
		leer sueldo_base[i]
		Escribir "  b) Cuantas ventas realiz�: " Sin Saltar
		leer cant_ventas
		comision=0
		
		para j=0 hasta cant_ventas-1 Hacer
			Escribir "     b" j+1 ") Cuanto cobr� por la venta " j+1 " :" Sin Saltar
			leer cobro_venta[j]
			comision=comision+cobro_venta[j]*0.1
		FinPara
		//Respuesta
		Escribir "Le corresponde de comision: $" comision
		sueldo_total= sueldo_base[i]+comision
		Escribir "El sueldo total es de: $" sueldo_total
	FinPara
	
	
FinAlgoritmo
