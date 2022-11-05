///16. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el
///n�mero tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
///	que separar el numero en partes (si es un numero de m�s de un digito) y ver si cada
///	numero es par o impar. Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos
///	pasar el numero a cadena para realizar el ejercicio. 




Algoritmo Guia3Ext16
	definir num Como Entero
	definir respuesta como cadena
	
	Escribir "Ingrese un numero: "
	leer num
Escribir impares(num)
FinAlgoritmo


Funcion resp<- impares(num)
	
	//Definicion de variables
	definir r Como Logico
	definir num_aux Como Entero
	definir resto Como entero
	definir resp como cadena
	
	//Asignacion de valores a variables
	num_aux = num
	r = verdadero
	
	//Desarmar el numero y ver si sus digitos son impares
	mientras num_aux > 0 Hacer
		
		resto = num_aux mod 10 //Esto es el que obtiene los digitos
		num_aux = trunc(num_aux / 10)
		
		
		si resto mod 2 <> 0 Entonces
			r = verdadero&r
			
		SiNo
			
			r= falso
				
		FinSi
		
		escribir "resto= " resto , " cociente= " num_aux
		
		si r = Verdadero Entonces
			resp = "El numero contiene todos sus digitos IMPARES "
		SiNo
			resp = "El numero tiene algun digito PAR "
		FinSi
	FinMientras
	

		
	
	
FinFuncion
	