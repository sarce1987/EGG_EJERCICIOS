///14. Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea
///calcular el jornal diario de acuerdo con las siguientes reglas: 
///	a) La tarifa de las horas diurnas es de $ 90
///	b) La tarifa de las horas nocturnas es de $ 125
///	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y
///	en un 15% si el turno es nocturno. 

///	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador,
///	el día de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas.
///	Además, debemos preguntarle al usuario si el día de la semana (lunes, martes,
///	miércoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice una función
///	para realizar el cálculo. 




Algoritmo Guia3Ext14
	
	definir nombre , dia_semana , turno , festivo como caracter
	definir horas_trabajadas como real
	
	//////////////////////// INGRESO DE DATOS ////////////////////////////
	escribir "Nombre del trabajador: " Sin Saltar
	leer nombre
	//Ingreso de dia de la semana
	Hacer
		escribir "Dia de la semana [Lunes(l), Martes(m), Miercoles(x), Jueves(j), Viernes(v), Sabado(s) o Domingo(d)]: " Sin Saltar
		leer dia_semana
	Mientras Que  dia_semana<>"l" y dia_semana<>"m" y dia_semana<>"x" y dia_semana<>"j" y dia_semana<>"v" y dia_semana<>"s" y dia_semana<>"d" 
	
	//Ingreso de si es feriado
	hacer
	escribir "El dia era feriado ? [si(s) , no(n)]: " Sin Saltar
	leer festivo
	mientras que festivo<>"s" y festivo<>"n"
	
	//Ingreso de diurno o nocturno
	hacer
	escribir "Que turno le tocó?[diurno(d) , nocturno(n)]: " Sin Saltar
	leer turno
	Mientras Que turno<>"d" y turno<>"n"
	
	//Horas trabajadas
	Escribir "Cuantas horas trabajo: " Sin Saltar
	leer horas_trabajadas
	
	//Resepuesta
	escribir "El sueldo de la jornada es: " calculo(dia_semana, festivo , turno , horas_trabajadas)
	
FinAlgoritmo

/////////////////////////////////////// FUNCION DE CALCULO DE SUELDO ////////////////////////////////////

funcion sueldo<- calculo (dia_semana , festivo , turno , horas)
	definir sueldo Como Real
	
	si turno = "d" y festivo = "n" entonces
		sueldo = horas * 90
	SiNo
		si turno = "d" y festivo ="s" entonces
			sueldo = horas * 90 * 1.10
		FinSi
	FinSi
	
	si turno = "n" y festivo = "n" entonces
		sueldo = horas * 125
	SiNo
		si turno = "n" y festivo ="s" entonces
			sueldo = horas * 125 * 1.15
		FinSi
	FinSi
	
	
	
FinFuncion

