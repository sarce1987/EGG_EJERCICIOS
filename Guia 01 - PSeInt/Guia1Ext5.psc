///Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio
///del a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l
///fue el porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.


Algoritmo Ext5
	definir prodini , prodfin , porc_aumento Como Real
	
	Escribir "Cuanto costaba el producto al inicio del a�o "
	leer prodini
	Escribir "A cuanto est� el producto al finalizar el a�o "
	leer prodfin
	porc_aumento=(prodfin/prodini-1)*100
	
	Escribir "El porcentaje de aumento es de: " porc_aumento " %"
	
FinAlgoritmo
