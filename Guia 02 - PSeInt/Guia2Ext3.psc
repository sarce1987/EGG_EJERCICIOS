//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
//	siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
//	siguiente mensaje "Los números no son pares, o uno de ellos no es par". 
//Nota: investigar la función mod de Pseint. 



Algoritmo Guia2Ext3
	definir num1 , num2 Como Entero
	
	Escribir "Ingrese el numero 1 y el numero 2 para comparar: "
	leer num1 , num2
	
	si num1 mod 2 = 0 y num2 mod 2 = 0 entonces
		escribir "Ambos numeros son pares"
	SiNo
		si num1 mod 2 <> 0 y num2 mod 2 <> 0 Entonces
			Escribir "Ambos numeros son impares "
			
		SiNo
			escribir "Uno de ellos no es par "
		FinSi
	FinSi
	
FinAlgoritmo
