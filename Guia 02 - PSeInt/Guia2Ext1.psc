///Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
///un curso, sabiendo que aprobar� el curso si su promedio de tres calificaciones es mayor
///	o igual a 70; y reprueba en caso contrario. 

Algoritmo Guia2Ext1
	
	definir nota1, nota2, nota3 Como Entero
	definir promedio Como Real
	
	Escribir "Ingrese las notas: "
	leer nota1 , nota2 , nota3
	
	promedio = (nota1+nota2+nota3)/3
	
	si promedio >= 70 Entonces
		Escribir "Aprueba " promedio
	SiNo
		Escribir "Desaprueba " promedio
	FinSi
FinAlgoritmo
