
///7. Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios.
///	Despu�s, hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son
///	iguales o no. La funci�n debe devolver el resultado de est� validaci�n, para mostrar el
///	mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo l�gico. 


Algoritmo Guia4Ejercicio7
	
	definir A , B , N , i como entero // A y B son vectores y N es su tama�o
	
	Escribir "Ingresar el tama�o de los vectores" Sin Saltar
	leer N
	
	Dimension A(N) , B(N)
	
	i=0
	asignar(A , N , i)
	asignar(B , N , i)
	
	Escribir "A="
	para i=0 hasta N-1 Hacer
		
		Escribir A(i)
		
	FinPara
	
	Escribir  "B="
	para i=0 hasta N-1 Hacer
		
		Escribir B(i)
		
	FinPara
	
	//respuesta
	escribir compara(A, B , N , i)
	
FinAlgoritmo


///////////////////////// SUBPROCESO PARA ASIGNAR VALORES A LOS ELEMENTOS DE LOS VECTORES ////////////////

SubProceso asignar(vector Por Referencia , N , i)
	
	para i=0 hasta N-1 Hacer
		vector(i)= Aleatorio(0 , 1)
		
	FinPara
	
FinSubProceso

///////////////////// FUNCION QUE COMPARA SI LOS DOS VECTORES SON IGUALES ////////////////////

Funcion l<- compara(A , B , N , i)
	definir l Como Logico
	l=Verdadero
	para i=0 hasta N-1 Hacer
		si A(i)=B(i) Entonces
			l=verdadero & l
		SiNo
			l=falso & l 
		FinSi

	FinPara
FinFuncion
	