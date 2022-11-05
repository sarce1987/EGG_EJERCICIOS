///Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica
///de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un
///	per�odo de prueba: 
	///	producir menos de 200 tornillos defectuosos. 
	///	producir m�s de 10000 tornillos sin defectos. 
	///El grado de eficiencia se determina de la siguiente manera: 
	///	Si no cumple ninguna de las condiciones, grado 5. 
	///	Si s�lo cumple la primera condici�n, grado 6. 
	///	Si s�lo cumple la segunda condici�n, grado 7. 
	///	Si cumple las dos condiciones, grado 8 

Algoritmo Guia2Ejercicio13
	
	definir torn_defect, torn_sin_defect Como Entero
	
	escribir "Cuantos tornillos defectuosos produjo"
	leer torn_defect
	escribir "Cuantos tornillos sin defectos produjo"
	leer torn_sin_defect
	
	si torn_defect<=200 y torn_sin_defect<=10000 Entonces
		Escribir "Grado 6"
	SiNo
		si torn_sin_defect>=10000 y torn_defect>=200 Entonces
			escribir "Grado 7"
		SiNo
			si torn_defect<=200 y torn_sin_defect>=10000 Entonces
				escribir "Grado 8"
			SiNo
				escribir "Grado 5"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
