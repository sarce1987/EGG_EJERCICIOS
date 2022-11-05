///21. Un docente de Programación tiene un listado de 3 notas registradas por cada uno de
///sus N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
///Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
///de sus estudiantes: 

///	 	? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
///		 reprueba el curso si tiene una nota final inferior a 6.5 
///		? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5. 
///		? La mayor nota obtenida en las exposiciones. 
///		? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5. 
///		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno
///		pedirá las 3 notas y calculará todos informes claves que requiere el docente.  

///	Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
///		ejercicio. No hacer todos al mismo tiempo y después probar. 


Algoritmo Guia2Ejercicio21
	
	//Definimos las variables pertinentes para el ejercicio
	//cant_alum: es la cantidad de alumnos a ingresar
	//nota_tp: es la nota del trabajo practico integrador
	//nota_exp: es la nota de la exposicion
	//nota_par: es la nota del parcial
	// i: es la variable indice para el conteo
	
	Definir cant_alum , i Como Entero
	definir nota_tp , nota_exp , nota_par , nota_final Como Real
	
	//Pedir la cantidad de alumnos
	Escribir Sin Saltar "Ingresar la cantida de alumnos: "
	leer cant_alum
	
	//Aca defino un arreglo de datos. Por ejemplo si hay 3 alumnos van a haber nota_tp[1] =, nota_tp[2] =
	//nota_tp[13 =
	Dimension nota_tp[cant_alum]
	Dimension nota_exp[cant_alum]
	Dimension nota_par[cant_alum]
	Dimension nota_final[cant_alum]
	
	//Con esta matriz de datos lo que hacemos es agregar las notas de cada alumno y calcular su nota final:
	
	para i=0 hasta cant_alum-1 Hacer
		
		Escribir "Para el alumno " i+1 " : "
		Escribir  Sin Saltar "---> a) Ingresar la nota del trabajo practico integrador: "
		leer nota_tp[i]
		Escribir  Sin Saltar "---> b) Ingresar la nota de la exposicion: "
		leer nota_exp[i]
		Escribir  Sin Saltar "---> c) Ingresar la nota del parcial: "
		leer nota_par[i]
		//Calculamos la nota final que tendria
		nota_final[i]=nota_tp[i]*0.35+nota_exp[i]*0.25+nota_par[i]*0.4
		
		si nota_final[i]>6.5 Entonces
			Escribir  "Su nota final es " nota_final[i] " (APROBADO)"
		SiNo
			Escribir  "Su nota final es " nota_final[i] " (DESAPROBADO)"
		FinSi
		
	FinPara
	
	
	/////////////////////// NOTA PROMEDIO FINAL DE LOS DESAPROBADOS //////////////////////////
	
	//Variables y calculos necesario para determinar la nota final promedio de los desaprobados
	
	Definir nota_final_prom Como Real
	definir j Como Entero
	j=0
	nota_final_prom=0
	
	//Con este bucle buscamos en la matriz o arreglo de datos cual nota final es menos a 6.5
	//que esa es la condicion para considerarlos desaprobados
	para i=0 hasta cant_alum-1 Hacer
		si nota_final[i]<=6.5 Entonces
			j=1+j
			nota_final_prom=(nota_final[i]+nota_final_prom)/j
		FinSi
	FinPara
	Escribir "1) El promedio de la nota final de los desaprobados es " nota_final_prom
	Escribir "Hay " j " desaprobados"
	
	//////////// PORCENTAJE DE ALUMNOS CON UNA NOTA DE TRABAJO PRACTICO INTEGRADOR > 7.5 ///////////////
	
	//Utilizamos nuevamente la variable auxiliar j
	j=0
	Definir porcent_nota_tp Como Real
	
	para i=0 hasta cant_alum-1 Hacer
		si nota_tp[i]>7.5 Entonces
			j=1+j
		FinSi
		porcent_nota_tp=j/cant_alum*100
		
	FinPara
	Escribir "2) El porcentaje de alumnos con una nota del integrador mayor a 7.5 es " porcent_nota_tp "%"
	
	/////////// MAYOR NOTA OBTENIDA DE LAS EXPOSICIONES ///////////////
	
	Definir max_nota_exp Como Real
	
	para i=0 hasta cant_alum-1 Hacer
		si i =0 Entonces
			max_nota_exp = nota_exp[i]
		SiNo
			si nota_exp[i] > max_nota_exp Entonces
				max_nota_exp=nota_exp[i]
			FinSi
		FinSi
	FinPara
	Escribir "3) La mayor nota obtenida de las exposiciones es de " max_nota_exp
	
	/////////// TOTAL DE ESTUDIANTES QUE OBTUVIERON EN EL PARCIAL ENTRE 4 Y 7.5 ///////////////
	
	//Utilizamos nuevamente la variable auxiliar j
	j=0
	
	para i=0 hasta cant_alum-1 Hacer
		si nota_par[i]>=4 y nota_par[i]<=7.5 entonces
			j=j+1
		FinSi
	FinPara
	Escribir "4) El total de estudiantes que obtuvo una nota en el parcial entre 4 y 7.5 es: " j " alumnos"
	
	
FinAlgoritmo
