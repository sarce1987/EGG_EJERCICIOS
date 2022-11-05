///4. Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 
///0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de 
///PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos 
///estudiantes son:
///	a) Deficientes 0-5
///	b) Regulares 6-10
///	c) Buenos 11-15
///	d) Excelentes 16-20




Algoritmo Guia4Ext4
	Definir notas , i ,suma_a , suma_b , suma_c , suma_d Como Entero
	Dimension notas(100)
	suma_a = 0
	suma_b = 0
	suma_c = 0
	suma_d = 0
	

	para i = 0 hasta 99 Hacer
		notas(i)=Aleatorio(0 , 20)
	FinPara
	
	para i =0 hasta 99 hacer
	
		si notas(i) >=0 y notas(i) <=5 Entonces
			suma_a = suma_a + 1
			
		SiNo
			si notas(i) >=6 y notas(i) <=10 Entonces
				suma_b = suma_b + 1
				
			SiNo
				si notas(i) >=11 y notas(i) <=15 Entonces
					suma_c=suma_c+1
					
				sino 
					si notas(i) >=16 y notas(i) <= 20 Entonces
						
						suma_d=suma_d+1
						
					FinSi
					
				FinSi
				
			FinSi
		FinSi
		
	FinPara
	
	Escribir  "Deficintes: " suma_a
	Escribir  "Regulares: " suma_b
	Escribir  "Buenos: " suma_c
	Escribir  "Excelentes: " suma_d
	
FinAlgoritmo
