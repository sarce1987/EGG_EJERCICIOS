///Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
///curso actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el
///porcentaje puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que
///ingrese la cantidad total de niños, y la cantidad total de niñas que hay en el curso.


Algoritmo Ext1
	//Definicion de variables
	Definir nino , nina ,sum Como Entero
	Definir porcenino , porcenina Como Real
	
	//Pedir los datos
	escribir "Cuantos niñas y niñas hay en el curso actual"
	leer nino , nina
	
	//Calculos
	sum=nino+nina
	porcenina=(nina/sum)*100
	porcenino=(nino/sum)*100
	
	//Respuesta
	escribir "El porcentaje de niños es: " porcenino "%"
	escribir "El porcentaje de niñas es: " porcenina "%"
FinAlgoritmo
