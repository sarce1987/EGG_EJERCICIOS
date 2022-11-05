
///Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
///una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
///	mostrar un mensaje indicándonos que hemos agotado esos 3 intentos.  Si acertamos la
///	clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema 
///	correctamente.

Algoritmo Guia2Ejercicio17
	definir clave como cadena
	definir i Como Entero
	
	//Defino la variable para contar en cero
	i=0
	//Aca se pide ingresar la contraseña mientras que la clabe sea distinta de eureka y menor a 3 intentos

	hacer 
		Escribir "Ingrese la contraseña"
		leer clave
		i=i+1
	Mientras Que clave <> "eureka" y i<3
	
	//Si se ha acertado la clave entonces se cumple la condicion Si sino se cumple la condicion SiNo
	
	si clave = "eureka" Entonces
		Escribir "Ha ingresado al sistema correctamente"
	SiNo
		escribir " La clave ingresada es incorrecta"
	FinSi

	
	
FinAlgoritmo
