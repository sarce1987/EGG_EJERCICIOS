
///4. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
///función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso
///	de la función Subcadena(). 

Algoritmo Guia3Ejercicio4
	definir frase como cadena
	definir letra Como Caracter
	
	escribir "Ingrese una frase: " Sin Saltar
	leer frase
	escribir "Ingrese la letra a buscar en esa frase: " Sin Saltar
	leer letra
	
	Escribir "La letra -" letra "- se repite :" buscar_caracter(frase , letra) " veces "
	
FinAlgoritmo


//Esta funcion lo que hace es buscar el letra por letra dentro de la frase y la compara con la latra
// que es la que le damos al programa como dato

Funcion cant_veces <- buscar_caracter ( frase , letra )
	Definir cant_veces , i ,j Como Entero
	cant_veces=0
	para i=0 hasta (Longitud(frase) - 1) Hacer
		si SubCadena(frase,i,i) = letra Entonces
			cant_veces = cant_veces+1
		FinSi
	FinPara
	
Fin Funcion
