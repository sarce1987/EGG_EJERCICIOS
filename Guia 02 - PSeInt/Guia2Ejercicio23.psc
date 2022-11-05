
///Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
///múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
///recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
///compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
///vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
///deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
///	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
		Escribir "  b) Cuantas ventas realizó: " Sin Saltar
		leer cant_ventas
		comision=0
		
		para j=0 hasta cant_ventas-1 Hacer
			Escribir "     b" j+1 ") Cuanto cobró por la venta " j+1 " :" Sin Saltar
			leer cobro_venta[j]
			comision=comision+cobro_venta[j]*0.1
		FinPara
		//Respuesta
		Escribir "Le corresponde de comision: $" comision
		sueldo_total= sueldo_base[i]+comision
		Escribir "El sueldo total es de: $" sueldo_total
	FinPara
	
	
FinAlgoritmo
