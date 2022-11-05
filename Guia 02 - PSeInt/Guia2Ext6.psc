///6. Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
///válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
///	válida se debe imprimir la fecha cambiando el número que representa el mes por su
///	nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".  




Algoritmo Guia2Ext6
	definir dia , mes , year como entero
	
	escribir "Ingrese el dia: " Sin Saltar
	leer dia
	escribir "Ingrese el mes: " Sin Saltar
	leer mes
	escribir "Ingrese el año: " Sin Saltar
	leer year
	
	si (dia>=1 y dia<=31) y (mes>=1 y mes<=12) y Longitud(ConvertirATexto(year))=4 Entonces
		Escribir "Fecha valida"
		Segun  mes Hacer
			1:
				escribir dia " de enero de " year
			2:
				escribir dia " de febrero de " year
			3:
				escribir dia " de marzo de " year
			4:
				escribir dia " de abril de " year
			5:
				escribir dia " de mayo de " year
			6:
				escribir dia " de junio de " year
			7:
				escribir dia " de julio de " year
			8:
				escribir dia " de agosto de " year
			9:
				escribir dia " de septiembre de " year
			10:
				escribir dia " de octubre de " year
			11:
				escribir dia " de noviembre de " year
			12:
				escribir dia " de diciembre de " year
		
		FinSegun
	SiNo
		Escribir  "Fecha invalida"
		
	FinSi
	
FinAlgoritmo
