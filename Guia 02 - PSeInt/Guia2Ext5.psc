///5. Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
///pantalla un mensaje que indique a qu� d�a de la semana corresponde. Considere que el
///n�mero 1 corresponde al d�a "Lunes", y as� sucesivamente.
 



Algoritmo Guia2Ext5
	Definir val Como Entero
	Escribir "Ingrese un valor entre 1 y 7" Sin Saltar
	leer val
	
	
	segun val Hacer
			1: 
				Escribir "Lunes"
			2:
				escribir "Martes"
			3: 
				escribir "Miercoles"
			4:
				escribir "Jueves"
			5:
				escribir "Viernes"
			6:
				escribir "Sabado"
			7: 
				escribir "Domingo"
				
			De Otro Modo:
				escribir "El valor ingresado es incorrecto"
				
	FinSegun
	
	
	
FinAlgoritmo
