///La empresa "Te llevo a todos lados" est� destinada al alquiler de autos y tiene un sistema
///de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
///	de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
///	regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
///	cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
///	40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
///	de $5,20 el minuto de uso. Realice un programa que permita registrar esa informaci�n y
///	el total a pagar por el cliente. 



Algoritmo Guia2Ext4
	definir horas_uso Como Entero
	definir pagar , nafta Como Real
	
Escribir "Ingrese las horas de uso: " Sin Saltar
leer horas_uso

si horas_uso<=2 Entonces
	pagar=400
	Escribir "Debe pagar: $" pagar " ; la nafta va de regalo"
SiNo
	escribir "Ingrese la cantidad de nafta gastada:" Sin Saltar
	leer nafta
	
	pagar= 40*nafta+ horas_uso*60*5.2
	
	Escribir "Debe pagar: " pagar
FinSi
FinAlgoritmo
