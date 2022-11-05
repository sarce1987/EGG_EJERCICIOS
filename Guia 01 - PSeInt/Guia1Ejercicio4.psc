///A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado
///se debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
///Ayuda: 1 pulgada equivale a 2.54 centímetros.

Algoritmo Ejercicio4
	Definir metros, centimetros , milimetros , pulgadas como real
	Escribir "Colocar cantidad de metros: "
	Leer metros
	centimetros = metros*100
	milimetros = metros*1000
	pulgadas = centimetros/2.54
	escribir metros " m esquivalen a:" centimetros " cm; " milimetros " mm y " pulgadas "pulgadas" 
FinAlgoritmo
