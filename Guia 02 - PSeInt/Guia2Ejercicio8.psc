///Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
///entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
///ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
///variable de tipo lógico.




Algoritmo Guia2Ejercicio8
	definir nota1 , nota2 , nota3 Como Entero
	definir val1 , val2 , val3 Como Logico
	
	//Ingresar los valores
	Escribir "Ingrese la nota1 , nota2 y nota 3"
	leer nota1 , nota2 , nota3
	
	//Logica 
	val1= nota1>=1 y nota1<=10
	val2= nota2>=1 y nota2<=10
	val3= nota3>=1 y nota3<=10
	
	si (val1 & val2 & val3) = Verdadero Entonces
		escribir "Las tres notas son correctas"
	SiNo
		Escribir "Son incorrectas"
		
	FinSi
	
FinAlgoritmo
