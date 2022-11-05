///1. Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y
///muestra una cadena con un espacio adicional tras cada letra.  
///Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se
///use dicho procedimiento.






Algoritmo Guia3ExtProcedimiento1
	definir frase como cadena
	
	Escribir "Escriba un texto: " Sin Saltar
	leer frase
	
	convertirepaciado(frase)
FinAlgoritmo



SubProceso convertirepaciado(fra Por Referencia)
	definir i como entero
	definir caract Como Caracter
	definir frase_aux1 , frase_aux2 Como Caracter
	
	frase_aux1=""
	frase_aux2=""
	
	para i = 0 Hasta Longitud(fra)-1 Hacer
		
		caract = Subcadena(fra , i , i)
		frase_aux1 = Concatenar(caract , " ")
		frase_aux2= Concatenar(frase_aux2, frase_aux1)
	FinPara
	
	Escribir frase_aux2
FinSubProceso
