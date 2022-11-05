///EJERCICIO INTEGRADOR
///El apocalipsis Zombie se ha desatado, pero aún hay esperanza. El Dr. Galard ha conseguido aislar el gen Z analizando
///muestras genéticas codificadas. Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro
///posibles bases (A,B,C,D), por ejemplo: "ACDDCADBCDABDBBA". Para poder detectar el gen Z, se representa la
///	muestra como una matriz cuadrada (MxM) y se busca en las dos diagonales principales que todas las bases sean
///	iguales . Siguiendo el ejemplo de la muestra anterior la matriz resultante es
///Galard aclara que para que la muestra sea válida el orden de la matriz (el valor de M) debe ser 3x3, 4x4 o 37x37
///	(según la muestra). Por desgracia, de antemano no es posible saber el orden de la matriz y el mismo debe ser
///	inferido de la muestra ingresada.
///Tu misión: hacer un programa que permita ingresar una muestra completa, detectar si es válida, y de ser así,
///	que imprima la matriz y muestre un mensaje que indique si se ha detectado o no el gen Z.
///	Hoy la humanidad depende de ti.


Algoritmo Integrador_Pseint
	definir  m Como entero
	definir A como cadena
	definir muestra como cadena
	
	hacer
	escribir "Ingrese la muestra:"
	leer muestra
	
	si longitud(muestra) = 9 entonces
		m=3
		Escribir "La muestra ingresada es de " longitud(muestra) " elementos"
	SiNo
		si Longitud(muestra) = 16 Entonces
			m=4
			Escribir "La muestra ingresada es de " longitud(muestra) " elementos"
		SiNo
			si longitud(muestra) = 256 entonces
				m=16
				Escribir "La muestra ingresada es de " longitud(muestra) " elementos"
			SiNo
				Escribir "La muestra ingresada no es valida"
				m=1
				
			FinSi
			
		FinSi
	FinSi
	
Mientras Que m=1
	escribir m
	
	dimension A(m,m)
	
	si m<> 1 Entonces
		llenarmatriz(A,m,muestra)
		mostramatriz(A,m)
		diagonales(A,m)
	FinSi
	
	
FinAlgoritmo

/////////////////// LLENADO DE LA MATRIZ ///////////////////

subproceso llenarmatriz(A , m , muestra)
	
	definir i , j , k Como Entero
	
	k=0
	para i=0  hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			
			A(i,j)=subcadena(muestra,k,k)
			k=k+1
	
		FinPara
		
	FinPara
	
FinSubProceso

////////////// MOSTRAR LA MATRIZ //////////////

subproceso mostramatriz(A,m)
	definir i , j  Como Entero
	
	para i =0 hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			
			escribir A(i,j) " " sin saltar
		FinPara
		escribir ""
	FinPara
	
FinSubProceso

/////////// COMPARAR LAS DIAGONALES ///////////

subproceso diagonales(A,m)
	definir i , j  Como Entero
	definir Dp ,Ds Como Caracter
	definir cura , cura2 como logico
	Dimension Dp(m) , Ds(m)
	
	
	para i=0 hasta m-1 Hacer
		para j=0 hasta m-1 Hacer
			
			Si i=j Entonces
				Dp(i)=A(i,j)
			FinSi
			
			Si j=m-1-i Entonces
				Ds(i)=A(i,j)
			FinSi
			
		FinPara
		
	FinPara
	
	para i=0 hasta m-1 hacer
		Escribir Dp(i)
	FinPara
	escribir "---"
	para i=0 hasta m-1 hacer
		Escribir Ds(i)
	FinPara
	
	
	cura=verdadero
	
	para i=0 hasta m-2 hacer
		si Dp(i)=Dp(i+1) Entonces
			
			cura=cura&verdadero
		SiNo
			cura=falso
		FinSi
		
	FinPara
	
	cura2=Verdadero
	para i=0 hasta m-2 hacer
		si Ds(i)=Ds(i+1) Entonces
			
			cura2=cura2&verdadero
		SiNo
			cura2=falso
		FinSi
		
	FinPara
	
	
	si cura y cura2 Entonces
		Escribir "SE HA DETECTADO EL GEN Z "
	SiNo
		Escribir "No se ha detectado el gen z"
	FinSi
	
FinSubProceso
