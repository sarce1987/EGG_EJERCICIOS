///21. Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
///comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al
///usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:  
///	1
///	12
///123

Algoritmo Guia3Ext21
	definir altura Como Entero
	Escribir "Ingrese la altura de la piramide: "
	leer altura
	piramide(altura)
	
FinAlgoritmo



SubProceso piramide(altura por valor)
	definir i , j Como Entero
	definir col como cadena
	
	//El primer para me define la fila y el segundo para me define las columnas
	
	para i=1 Hasta altura Hacer
		col=""
		para j=1 hasta i Hacer
			
			col=concatenar(col , ConvertirATexto(j))
			
		FinPara

		escribir col
		
	FinPara
	
FinSubProceso
	