///12. Rellenar una matriz,de9 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
///encontrando la manera de que la frase se muestre de manera continua en la matriz. 



Algoritmo Guia4Ejercicio12
	
	definir M como caracter
	definir palabra como cadena
	definir i , j , cont Como Entero
	
	Dimension M(3,3)
	
	
	hacer
		Escribir "Ingrese una palabra de longitud 9 : "
		leer palabra
		si Longitud(palabra)>9 Entonces
			Escribir "Palabra ingresada mayor a 9 letras"
		FinSi
	Mientras Que longitud(palabra)>9
	cont=0
	para i=0 hasta 2 Hacer
		para j =0 hasta 2 Hacer
			M(i,j)= subcadena(palabra,cont,cont)
			cont= 1 + cont
		FinPara
	FinPara
	para i=0 hasta 2 Hacer
		para j =0 hasta 2 Hacer
			escribir M(i,j) " " Sin Saltar
			
		FinPara
		escribir ""
	FinPara
	
FinAlgoritmo
