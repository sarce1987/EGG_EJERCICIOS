///Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio
///del año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál
///fue el porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.


Algoritmo Ext5
	definir prodini , prodfin , porc_aumento Como Real
	
	Escribir "Cuanto costaba el producto al inicio del año "
	leer prodini
	Escribir "A cuanto está el producto al finalizar el año "
	leer prodfin
	porc_aumento=(prodfin/prodini-1)*100
	
	Escribir "El porcentaje de aumento es de: " porc_aumento " %"
	
FinAlgoritmo
