///9. Programe una función que calcule el producto de un arreglo de números enteros. Para
///	esto imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los
///		valores es igual a (V[1]*V[2]*V[3]*V[4])



Algoritmo Guia4Ext9
	
	definir V , i , multi Como Entero
	Dimension V(4)
	
	para i = 0 hasta 3 Hacer
		V(i)=Aleatorio(0 , 20 )
		Escribir V(i)
	FinPara
	
	multi = 1
	para i = 0 hasta 3 Hacer
		multi= V(i)*multi
		
	FinPara
	
	Escribir "El producto de todos sus elementos es: " multi
FinAlgoritmo
