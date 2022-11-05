///9. Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
///terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
///manera: cada vocal se reemplaza por el car�cter que se indica en la tabla y el resto de
///	los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios. 
///	a = @
///	e = #
///	i = $
///	o = %
///	u = *
///Realice un subprograma que reciba una secuencia de caracteres y retorne la
///codificaci�n correspondiente. Utilice la estructura "seg�n" para la transformaci�n. 

///Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
///	La salida del programa deber�a ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

Algoritmo Guia3Ejercicio9
	definir frase como cadena
	
	Escribir "Ingrese una frase terminando con punto: " Sin Saltar
	leer frase
	codificar(frase)
	
	escribir frase
FinAlgoritmo



SubProceso codificar (frase_cod por referencia)
	definir letra como caracter
	definir i como entero
	definir frase_aux como cadena
	
	frase_aux=""
	
	para i = 0 hasta longitud(frase_cod)-1 Hacer
		letra = subcadena(frase_cod,i,i)
		segun letra Hacer
			
			"a":
				letra="@"
			"e":
				letra="#"
			"i":
				letra="$"
			"o":
				letra="%"
			"u":
				letra="*"
				
		FinSegun
		///escribir Sin Saltar letra
		frase_aux = concatenar(frase_aux,letra)
	FinPara
	
	frase_cod = frase_aux
FinSubProceso
	