
///4. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
///usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el
///valor m�s grande del vector. 


Algoritmo Guia4Ejercicio4
	definir M , i Como Entero
	definir v  como real
	Escribir "Tama�o del vector: " Sin Saltar
	leer M
	Dimension v(M)
	
	//Rellenar los valores del vector
	para i=0 hasta M-1 Hacer
		escribir "Ingrese el valor v(" i "): " Sin Saltar
		leer v(i)
	FinPara
	
	escribir "El mayor es: " elmayor(v , i , M)
	
FinAlgoritmo


///////////////////////////// FUNCION QUE DEFINE EL MAYOR ////////////////////////////

Funcion mayor<- elmayor(v , i , M)
	definir mayor Como Real
	
	para i = 0 hasta M-1 Hacer
		si i = 0 Entonces
			mayor = v(0)
		SiNo
			si v(i)> mayor Entonces
				mayor= v(i)
			FinSi
		FinSi
	FinPara
FinFuncion
	