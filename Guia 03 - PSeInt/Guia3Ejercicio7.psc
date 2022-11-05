///7. Crear un procedimiento que calcule la temperatura media de un día a partir de la
///temperatura máxima y mínima. Crear un programa principal, que utilizando un
///procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya
///mostrando la media de cada día. El programa pedirá el número de días que se van a
///introducir. 

Algoritmo Guia3Ejercicio7
	Definir cant_dias Como Entero 
	Escribir "Cuantos dias va a introducir: " Sin Saltar
	leer cant_dias
	calculo_temp_max_min(cant_dias)
	
FinAlgoritmo


//Este subprograma pide la temperatura max y minima de los dias introducidos en el programa principal
//Ademas calcula la temperatura promedio y lo escribe en pantalla

SubProceso calculo_temp_max_min (dias Por Valor)
	Definir temp_max , temp_min , i como entero
	definir temp_media Como Real
	
	para i=1 hasta dias
		Escribir "Ingrese la temperatura max y min del dia " i 
		leer temp_max , temp_min
		temp_media=(temp_max+temp_min)/2
		Escribir " la temperatura media es : " temp_media " °C"
	FinPara
FinSubProceso
	