///8. Realizar un procedimiento que permita realizar la divisi�n entre dos n�meros y muestre
///el cociente y el resto utilizando el m�todo de restas sucesivas.
///El m�todo de divisi�n por restas sucesivas consiste en restar el dividendo con el divisor
///hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el
///n�mero de restas realizadas es el cociente. Por ejemplo: 50 / 13: 
///		50 - 13 = 37 una resta realizada
///		37 - 13 = 24 dos restas realizadas
///		24 - 13 = 11 tres restas realizadas 
///	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 

Algoritmo Guia3Ejercicio8
	definir num1 , num2 como enteros
	Escribir "Ingrese el primer y segundo valor : "
	leer num1 , num2
	Escribir  num1 " / " num2
	restas_sucesivas(num1 , num2)
FinAlgoritmo


SubProceso restas_sucesivas (dividendo Por Valor , divisor Por Valor)
	definir cociente , resta  Como Real
	definir i Como Entero
	i=0
	resta = dividendo
	Hacer
		resta = resta - divisor 
		
		i=i+1
	Mientras Que resta > divisor
	escribir "residuo es " resta ", y el cociente es " i

FinSubProceso
	