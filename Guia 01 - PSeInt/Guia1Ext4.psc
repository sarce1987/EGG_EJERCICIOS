///A partir de una conocida cantidad de días que el usuario ingresa a través del teclado,
///escriba un programa para convertir los días en horas, en minutos y en segundos. Por
	///ejemplo
	///1 día = 24 horas = 1440 minutos = 86400 segundos 


Algoritmo Ext4
	//Definir variables
	definir dias,horas,min,seg Como Real
	
	//Pedir cantidad de dias 
	escribir "Ingrese la cantidad de dias deseada"
	leer dias
	
	//Calculos
	horas=dias*24
	min=dias*1440
	seg=dias*86400
	
	//Resultado
	escribir dias "dias esquivalen a: " horas " horas; " min " minutos y " seg " segundos"
	
FinAlgoritmo
