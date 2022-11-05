Algoritmo Guia4ExtExt2
	definir A , B, i , j , escudo , m , n , m_aux, n_aux como entero
	definir f  Como Caracter
	definir c Como entero
	definir pos Como Logico
	Dimension A(4,4) , B(4,4)
	
	
	//Inicializacion de todos los valores de la matriz
	para i =0 hasta 3 Hacer
		para j = 0 hasta 3 hacer
			A(i,j)=0 
		FinPara
	FinPara
	
	escribir "Inserte las coordenadas de la nave"
	para i = 0 hasta 2 hacer
		
		hacer
			Hacer
				Escribir "Fila " i+1 " (A) , (B) , (C) , (D) :" Sin Saltar
				leer f
			Mientras Que f<>"A" y f<>"B" y f<>"C" y f<>"D"
			
			Hacer
				Escribir "Columna " i+1 " (1) , (2) , (3) , (4):" Sin Saltar
				leer c
			Mientras Que c<>1 y c<>2 y c<>3 y c<>4	
			
			Hacer
				Escribir "Escriba el nivel del escudo de electrones " i+1 " : " Sin Saltar
				leer escudo
			Mientras Que escudo<1 o escudo>9
			
			
			
			
			
			//Con estas funciones lo que hago es poner el valor de las filas y columnas agregados anteriormente
			//con las coordenadas adecuadas aceptadas por la matriz por ejemplo si agrego fila A esto lo convierte
			//en la fila 0 que es lo que acepta la matriz como posicion
			m = coordenadafila(f)
			n = coordenadacol(c)
			
			A(m,n)= escudo
			
			//Estas condiciones verifican si la nave esta bien ubicada
			
			m_aux=0
			n_aux=0
			
			si i = 0 Entonces
				m_aux = m
				n_aux = n
				pos = Verdadero
			SiNo
				
				si i<>0 Entonces
					si m_aux = m Entonces
						pos = Verdadero
					SiNo
						si n_aux = n entonces
							pos= Verdadero
						SiNo
							pos=Falso
						finsi
						
					FinSi
					
				FinSi
				
				
			FinSi
			
			si pos = falso Entonces
				
				Escribir "La posiciones ingresada es Erronea y no cumple con las reglas"
				
			FinSi
			
		Mientras Que pos = falso
		
	FinPara
	
	//Esto escribe a ver como quedo la matriz
	
	para i =0 hasta 3 Hacer
		para j = 0 hasta 3 hacer
			escribir A(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
	
	atacante(A,B)
	
FinAlgoritmo


////////////// FUNCION QUE DEVUELVE LAS COORDENADAS CORRECTAS PARA QUE FUNCIONE LA MATRIZ ///////////
//Funcion que recive fila y lo devuelve como coordenada de fila
Funcion n = coordenadafila(f)
	definir n Como Entero
	segun f Hacer
		"A": 
			n = 0
		"B": 
			n = 1
		"C":
			n = 2
		"D":
			n = 3
	FinSegun
FinFuncion

//Funcion que recibe columna y lo devuelve como coordenada de columna
Funcion n = coordenadacol(c)
	definir n Como Entero
	segun c Hacer
		1: 
			n = 0
		2: 
			n = 1
		3:
			n = 2
		4:
			n = 3
	FinSegun
FinFuncion	


///////////////////////////////  ATACANTE  /////////////////////////////

SubProceso atacante(A por referencia,B Por Referencia)
	definir c , i ,m , n, carga Como Entero
	definir f como cadena
	
	Hacer
		
	
		Hacer
			Escribir "Fila (A) , (B) , (C) , (D) :" Sin Saltar
			leer f
		Mientras Que f<>"A" y f<>"B" y f<>"C" y f<>"D"
		
		Hacer
			Escribir "Columna (1) , (2) , (3) , (4):" Sin Saltar
			leer c
		Mientras Que c<>1 y c<>2 y c<>3 y c<>4	
		
		Hacer
			Escribir "Escriba el nivel de la carga de electrones: " Sin Saltar
			leer carga
		Mientras Que carga<1 o carga>9
		//Con estas funciones lo que hago es poner el valor de las filas y columnas agregados anteriormente
		//con las coordenadas adecuadas aceptadas por la matriz por ejemplo si agrego fila A esto lo convierte
		//en la fila 0 que es lo que acepta la matriz como posicion
		m = coordenadafila(f)
		n = coordenadacol(c)
		
		B(m,n)= carga
		
	Mientras Que A(m,n) <> 0
		
FinSubProceso
