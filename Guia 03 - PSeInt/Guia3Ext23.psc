///23. Diseñar un procedimiento que reciba una frase, y el programa remueva todas las
///vocales repetidas. Al final el procedimiento mostrará la frase final. 



Algoritmo Guia3Ext23
	definir frase como cadena
	Escribir "Ingrese una frase:" Sin Saltar
	leer frase
	removedor(frase)
	
	//Escribir frase
	
FinAlgoritmo


SubProceso removedor (fra Por Referencia)
	Definir cont , i Como Entero
	definir vocal_aux como cadena
	
	cont<-0
	vocal_aux<-""
	
	
	para i=0 hasta Longitud(fra)-1 Hacer
		vocal_aux=Subcadena(fra,i,i)
		si vocal_aux= "a" Entonces
			cont= cont+1
		FinSi
		
		
	FinPara
	si cont>1 Entonces
		
	FinSi
	
FinSubProceso
	