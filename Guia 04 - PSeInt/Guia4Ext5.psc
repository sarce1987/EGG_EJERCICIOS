///5. Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, 
///facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el 
///carácter en la posición X y la misma está ocupada, entonces de existir un espacio en 
///cualquier posición X-n o X+n, desplazar los caracteres hacia la izq o hacia la derecha para 
///	poder ingresar el carácter en cuestión en el lugar deseado. El procedimiento de 
///	reordenamiento debe ubicar el espacio más cercano.

Algoritmo Guia4Ext5
	Definir frase como cadena
	definir V , caract Como Caracter
	definir i , pos , cont_der , cont_izq , cont Como Entero
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
		
		contarvacioderecha(V , i , pos , cont_der)
		contarvacioizquierda(V , i , pos , cont_izq)
		
		si cont_der< cont_izq Entonces
			para i = pos  hasta 19 Hacer
				V(i+1) = V(i)
	
				
			FinPara
		SiNo
			para i = pos  hasta 19 Hacer
				V(i+1) = V(i)
				
				
			FinPara
			
			
		FinSi
		
	FinSi
	
FinAlgoritmo

//Este subproceso cuenta cuantos espacios hay hacia la derecha hasta encontrar un valor vacio

SubProceso contarvacioderecha(V , i , pos, cont_der Por Referencia)
	cont_der=0
	i= pos

	Hacer
		cont_der = cont_der + 1
	i = i+1
	Mientras Que  V(i) <> " "
	
	Escribir cont_der	
FinSubProceso

//Este subproceso cuenta cuantos espacios hay hacia la derecha hasta encontrar un valor vacio

SubProceso contarvacioizquierda(V , i , pos, cont_izq Por Referencia)
	cont_izq=0
	i= pos
	
	Hacer
		cont_izq = cont_izq + 1
		i = i-1
	Mientras Que  V(i) <> " "
	
	Escribir cont_izq	
FinSubProceso

