
///1. Realizar una función que calcule la suma de dos números. En el algoritmo principal le
///	pediremos al usuario los dos números para pasárselos a la función. Después la función
///	calculará la suma y lo devolverá para imprimirlo en el algoritmo. 


Algoritmo Guia3Ejercicio1
	
	definir num1 , num2 Como Real
	Escribir "Ingrese el numero 1 y el numero 2 :"
	Leer num1 , num2
	
	//Aca se hace el llamado a la funcio mandandoles los argumentos num1 y num2 para que use como parametros
	//para el calculo de la Funcion 
	
	//realizar_suma es el nombre de la funcion ; (num1 , num2) es el argunmento 1 y el argumento 2 que el 
	//programa va a enviar a la funcion como los parametros. Los argumentos y los parametros tienen que ser
	//coincidente en orden en tipo y en cantidad.
	
	Escribir "La suma es igual a: " realizar_suma(num1 , num2)
	
FinAlgoritmo


//Es te subprograma o funcion me devuleve un valor que se denomina suma  y que es calculado en el subprograma
//ese resultado hay que definirlo en el cuerpo de la funcion. 
//Dentro de la funcion realizo el calculo con los parametros que se les ha sido enviado desde el programa , principal

Funcion suma <- realizar_suma ( n1 , n2 )
	definir suma Como Real
	
	suma= n1 + n2
	
	
Fin Funcion