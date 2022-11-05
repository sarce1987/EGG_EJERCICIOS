///Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar
	///al usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
	///volumen = ? * radio2* altura


Algoritmo Ext3
	//Definir variables
	definir rad , alt, vol Como Real
	
	//Pedir el radio y la altura
	Escribir "Colocar radio [mm] y altura [mm]: "
	Leer rad, alt
	
	//Calculos
	vol= pi*rad*rad*alt
	
	//Respuesta
	Escribir "Volumen = " vol " [mm3]"
	
FinAlgoritmo
