
///6. Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un
////arreglo y su valor m�s grande.

Algoritmo Guia4Ext6
	
	definir V , i , n , val_max , val_min , dif Como Entero
	Escribir "Ingrese la dimension del vector" Sin Saltar
	leer n
	dimension V(n)
	
	para i = 0 hasta n-1 Hacer
		Escribir "Ingrese el valor " i " del vector: "
		leer V(i)
		
	FinPara
	
	val_max = 0
	val_min = 0
	
	para i = 0 hasta n-1 Hacer
		si i= 0 Entonces
			val_min = V(i)
			val_max = V(i)
		SiNo
			si V(i)< val_min Entonces
				
				val_min = V(i)
				
			SiNo
				
				si V(i) > val_max Entonces
					
					val_max = V(i)
				FinSi
			FinSi
			
		FinSi
		
	FinPara
	
	Escribir "El valor maximo es: " val_max , " y el valor minimo es: " val_min 
	
	dif = val_min - val_max
	
	Escribir "La diferencia entre el valor minimo y el maximo es: " dif
	
FinAlgoritmo
