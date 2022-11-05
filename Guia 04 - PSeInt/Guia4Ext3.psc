///3. Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
///¿almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector 
///se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la 
///	función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su 
///	longitud



Algoritmo Guia4Ext3
	definir Nom como cadena
	definir LongNom , i , N como entero
	
	Escribir "Ingrese el tamaño del vector: " Sin Saltar
	leer N
	
	Dimension Nom(N) , LongNom(N)
	
	para i=0 hasta N-1
		Escribir "Ingrese el nombre " i+1 ": " Sin Saltar
		leer Nom(i)
	
	FinPara
	
	para i=0 hasta N-1 Hacer
		LongNom(i) = Longitud(Nom(i))
		Escribir "El tamaño del nombre " Nom(i) " es: " LongNom(i)
		
	FinPara
	
FinAlgoritmo
