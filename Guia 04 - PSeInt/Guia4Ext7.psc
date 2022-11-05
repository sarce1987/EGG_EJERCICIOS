///7. Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor
///a mayor. Nota: investigar el ordenamiento burbuja en el siguiente link: Ordenamiento
////		Burbuja.



Algoritmo Guia4Ext7
	definir V , j,  i , temp Como Entero
	dimension V(5)
	
	para i = 0 hasta 4 hacer 
		V(i) = Aleatorio(0 , 5 )
	FinPara
	para i = 0 hasta 4 hacer 
		Escribir V(i)
	FinPara
	
	para i = 0 hasta 3 Hacer
		
		para j = 0 hasta 3 Hacer
			
			si V(j)> V(j+1) Entonces
				
				temp = V(j)
				V(j) = V(j+1)
				V(j+1) = temp
				
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir "El vector ordenado de mayor a menor queda: "
	para i = 0 hasta 4 hacer 
		Escribir V(i)
	FinPara
	
	
FinAlgoritmo
