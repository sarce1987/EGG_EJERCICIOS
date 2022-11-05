///22. Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha
///	anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba
///	una fecha representada a través de tres enteros dia, mes y anio, y retorne la fecha
///	anterior. Puede asumir que dia, mes y anio representan una fecha válida. Realice
///	pruebas de escritorio para los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3,
///	anio=2004. 





Algoritmo Guia3Ext22
	definir dia , mes , anio Como Entero
	
	escribir "Ingrese el dia: " Sin Saltar
	leer dia
	escribir "Ingrese el mes: " Sin Saltar
	leer mes
	escribir "Ingrese el año: " Sin Saltar
	leer anio
	
	diaanterior(dia,mes,anio)
	
	Escribir dia "/ " mes " / " anio
	
FinAlgoritmo



SubProceso diaanterior (dia Por Referencia, mes Por Referencia , anio Por Referencia)
	si dia = 1 y (mes=5 o mes=7 o mes=8 o mes=10 o mes=12) Entonces
		dia=30
		mes=mes-1
	SiNo
		si dia = 1 y mes=3 Entonces
			dia=28
			mes=mes-1
		SiNo
			si dia = 1 y mes =1 Entonces
				dia=31
				mes=12
				anio=anio-1
			SiNo

				si dia=1 y (mes=2 o mes=4 o mes=6 o mes=9 o mes=11) Entonces
					dia=31
					mes=mes-1
				SiNo
					dia=dia-1
				FinSi	
			FinSi
		FinSi
	FinSi
		
	
	
FinSubProceso
