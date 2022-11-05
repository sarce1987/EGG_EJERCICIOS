
///13. Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y 
///que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es 
///	"asdasd". Además la función calculara el número de intentos que se ha usado para 
///	loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función devolverá 
///Falso.

Algoritmo Guia3Ext13
	definir usuario , contra como caracter
	definir resp como logico
	
	usuario = ""
	contra = ""
	resp = login(usuario , contra)
	
	Escribir resp
	
FinAlgoritmo

//Funcion que calcula si el usuario y contraseña es correcto

Funcion r<-login(usuario , contra)
	
	definir r Como logico
	definir i Como Entero
	
	i=0
	
	Hacer
		escribir "Ingrese el usuario: " Sin Saltar
		leer usuario
		escribir "Ingrese la contraseña: " sin saltar
		leer contra
		
		si usuario = "usuario1" y contra= "asdasd" Entonces
			r = verdadero
			
		SiNo
			r=falso
			i=i+1
		FinSi
	Mientras Que r = Falso y i<>3
	
	
	
	
FinFuncion
	