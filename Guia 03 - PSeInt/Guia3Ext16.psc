///16. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
///número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
///	que separar el numero en partes (si es un numero de más de un digito) y ver si cada
///	numero es par o impar. Nota: recordar el uso de la función Mod y Trunc(). No podemos
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
	