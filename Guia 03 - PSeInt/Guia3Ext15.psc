///15. Realizar una función que calcule la suma de los dígitos de un numero. 
///Ejemplo: 25 = 2 + 5 = 7 
///Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en
///	el resto de una división entre 10. Recordar el uso de la función Mod y Trunc. 



Algoritmo Guia3Ext15
	definir num Como Entero
	leer num
	escribir "La suma de sus digitos es: " suma(num)
FinAlgoritmo



Funcion s<-suma(num)
	definir s , aux2, i como entero
	definir aux como cadena
	
	s=0
	para i=0 hasta longitud(ConvertirATexto(num))-1 Hacer
		aux=subcadena(ConvertirATexto(num),i,i)
		aux2=ConvertirANumero(aux)
		s=s+aux2
	FinPara
FinFuncion
	