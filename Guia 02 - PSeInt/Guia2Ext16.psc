///16. Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
///calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas
///	vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres
///	notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los
///	datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben
///	estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el
///	promedio y se mostrará un mensaje de error. 

Algoritmo Guia2Ext16
	definir nt_practica , nt_problema , nt_teorica Como Entero
	definir nombre Como Caracter //nombre de los alumnos
	definir resultado Como Real
	nombre="0"
	
	mientras nombre <>"" Hacer
		Escribir "Ingrese el nombre del alumno:" Sin Saltar
		leer nombre
		
		Escribir "Ingrese la nota practica: " Sin Saltar
		leer nt_practica
		Escribir "Ingrese la nota de problemas: " Sin Saltar
		leer nt_problema
		Escribir "Ingrese la nota teorica: " Sin Saltar
		leer nt_teorica
		resultado= 0.1*nt_practica+0.5*nt_problema+0.4*nt_teorica
		
		si (nt_practica>=0 y nt_practica<=10) y (nt_problema>=0 y nt_problema<=10) y (nt_teorica>=0 y nt_teorica<=10) Entonces
			
			escribir "Nota = " resultado
		SiNo
			escribir "Error"
			
		FinSi
		
		
		
	FinMientras
	
	
	
FinAlgoritmo
