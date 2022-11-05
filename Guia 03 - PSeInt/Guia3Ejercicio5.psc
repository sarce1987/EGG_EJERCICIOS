
///Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
///	numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí
///mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD. 



Algoritmo Guia3Ejercicio5
	Definir num1 Como Entero
	
	Escribir "Ingrese un numero: " 
	leer num1 
	
	escribir "El numero es primo ? : " es_primo(num1)
	
FinAlgoritmo



Funcion resp <- es_primo ( num )
	
	definir resp Como Logico
	definir cont , i Como Entero
	cont =0
	para i =1 hasta num Hacer
		si num mod i = 0 Entonces
			cont= cont+1
			
		FinSi
		
	FinPara
	si cont = 2 Entonces
		resp = verdadero
	FinSi

	
Fin Funcion

