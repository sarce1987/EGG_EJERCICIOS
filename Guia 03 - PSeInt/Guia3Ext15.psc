///15. Realizar una funci�n que calcule la suma de los d�gitos de un numero. 
///Ejemplo: 25 = 2 + 5 = 7 
///Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en
///	el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc. 



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
	