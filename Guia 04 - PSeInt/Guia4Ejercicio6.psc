///6. Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
///desarrollar un programa que:
	
///	a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por
///letra. Ayuda: utilizar la función Subcadena de PSeInt.
	
///	b. Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
///	posición dentro del arreglo, y el programa debe intentar ingresar el carácter
///	en la posición indicada, si es que hay lugar (es decir la posición está vacía o
///	es un espacio en blanco). De ser posible debe mostrar el vector con la frase y
///	el carácter ingresado, de lo contrario debe darle un mensaje al usuario de que
///	esa posición estaba ocupada.  



Algoritmo Guia4Ejercicio6
	Definir frase como cadena
	definir V , caract Como Caracter
	definir i , pos Como Entero
	Dimension V(20)
	
	
	//a) Poner la frase dentro del vector. Cada letra ocupa un elemento
	
	Escribir "Ingrese una frase: " sin saltar
	leer frase
	
	para i = 0 hasta 19 Hacer
		V(i) = subcadena(frase , i , i)
	FinPara
	
	//b) Se pide un caracter y se ubica dentro de un espacio vacio en el vector
	
	Escribir "Ingrese caracter para ubicar dentro del vector: " Sin Saltar
	Leer caract
	Escribir "Ingrese una posicion donde quiere guardar el caracter: " Sin Saltar
	leer pos
	
	si V(pos)= "" o V(pos)=" " Entonces
		
		V(pos)= caract
		
		Para i = 0 hasta 19 Hacer
			escribir V(i) Sin Saltar
			
		FinPara
		
	SiNo
		Escribir "La posicion está ocupada"
		
		
	FinSi
	
	
FinAlgoritmo
