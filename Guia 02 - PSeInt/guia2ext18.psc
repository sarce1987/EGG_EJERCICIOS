///Bucle "Hacer ? Mientras Que" 
///18. Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
///mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa
///no le debe permitir continuar hasta que introduzca como c�digo 1024 y como
///contrase�a 4567. El programa finaliza cuando ingresa los datos correctos.
 
algoritmo guia2ext18
	definir codigo , password Como Entero
	
	hacer
		Hacer
			Escribir "Introducir usuario: " Sin Saltar
			leer codigo
			si codigo<0 Entonces
				Escribir "El codigo ingresado es menor a cero"
			FinSi
		Mientras Que codigo<0
		Hacer
			Escribir "Introducir contrase�a: " Sin Saltar
			leer password
			si Longitud(ConvertirATexto(password))<>4 Entonces
				Escribir "El password ingresado tiene mas o menos de 4 digitos"
			FinSi
		Mientras Que Longitud(ConvertirATexto(password))<>4
		
	Mientras Que (codigo<>1024 o password<>4567)
	Escribir "El pasword es correcto"
	
FinAlgoritmo
