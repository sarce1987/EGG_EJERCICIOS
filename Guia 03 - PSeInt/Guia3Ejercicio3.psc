
///3. Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario,
///validando que el primer numero m�ltiplo del segundo y devuelva verdadero si el primer
///numero es m�ltiplo del segundo, sino es m�ltiplo que devuelva falso. 



Algoritmo Guia3Ejercicio3
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese el valor1 y el valor2: " 
	leer num1 , num2
	escribir num1 " es multiplo de " num2 " ? : " es_multiplo(num1,num2)
	
FinAlgoritmo


Funcion multiplo <- es_multiplo ( val1,val2 )
	Definir multiplo Como Logico
	si val1 mod val2 = 0 Entonces
		multiplo=Verdadero
	SiNo
		multiplo=Falso
	FinSi
Fin Funcion
