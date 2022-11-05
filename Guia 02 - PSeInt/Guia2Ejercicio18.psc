///Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
///programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
///todos ellos.


Algoritmo Guia2Ejercicio18
	definir num, max, min , suma,i Como Entero
	definir promedio como real
	i=1
	num=0
	suma=0
	Hacer
		suma = suma+num
		escribir "Ingresar un valor"
		leer num
		
		si i=1 Entonces
			max=num
			min=num
		SiNo
			
			si num>=max Entonces
				max=num
			SiNo
				si num<>0 y num<=min Entonces
					min=num
				FinSi
				
			FinSi
		FinSi
		i=i+1
	Mientras Que num<>0
	promedio = suma / (i-2)
	Escribir "maximo = " max
	Escribir "minimo = " min
	Escribir "suma= " suma
	Escribir "promedio= " promedio
FinAlgoritmo
