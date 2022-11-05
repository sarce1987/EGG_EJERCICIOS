///Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
///pantalla el área y perímetro del mismo
///area = base * altura
///perimetro = 2 * altura + 2 * base. 


Algoritmo Ext2
	//Definir las variables
	Definir base , altura , area , perimetro Como Real
	
	//Solicitar base y altura del rectangulo
	Escribir "Colocar la base y la altura del rectangulo [mm]: "
	Leer base , altura
	
	//Calculos
	area = base*altura
	perimetro=base*2+altura*2
	
	//Respuesta
	Escribir "Area = " area " [mm2]"
	Escribir "Perimetro = " perimetro " [mm]"
	
	
FinAlgoritmo
