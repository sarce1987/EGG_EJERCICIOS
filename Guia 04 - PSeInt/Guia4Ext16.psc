///Una empresa de venta de productos por correo desea realizar una estadística de las
///ventas realizadas de cada uno de sus productos a lo largo de una semana. Distribuya 
///luego 5 productos en los 5 días hábiles de la semana. Se desea conocer:
	
///	a. Total de ventas por cada día de la semana.
///	b. Total de ventas de cada producto a lo largo de la semana.
///	c. El producto más vendido en cada semana.
///	d. El nombre, el día de la semana y la cantidad del producto más vendido.
	
///El informe final tendrá un formato como el que se muestra a continuación: 



Algoritmo Guia4Ext16
	definir i , j , suma , mayor , suma_semanal Como Entero
	definir M , prod_mayor como cadena
	Dimension M(8,7)
	Dimension TotProd(7)
	//Tengo en cuenta que hasta la fila 5 son los productos y hasta la columna 5 son los dias de la semana
	//Con este algoritmo lleno la ventas de los productos de manera aleatoria en los diferentes dias
	
	para i = 0 hasta 7 Hacer
		para j=0 hasta 6 Hacer
			M(i,j) = ""
		FinPara
	FinPara
	
	
	
	M(0,0) = "     					"
	M(0,1) = "Lunes					"
	M(0,2) = "Martes				"
	M(0,3) = "Miercoles				"
	M(0,4) = "Jueves				"
	M(0,5) = "Viernes				"
	M(0,6) = "Total Producto		"
	
	M(1,0) = "Producto 1			"
	M(2,0) = "Producto 2			"
	M(3,0) = "Producto 3			"
	M(4,0) = "Producto 4			"
	M(5,0) = "Producto 5			"
	M(6,0) = "Total Semana			"
	M(7,0) = "Producto mas vendido	"
	

	
	para i = 1 hasta 5 Hacer
		para j=1 hasta 5 Hacer
			M(i,j) = ConvertirATexto(Aleatorio(0 , 10))
		FinPara
	FinPara
	
	
	
	////////////// CALCULO DEL TOTAL DE SEMANAS //////////
	
	para j = 1 hasta 5 hacer 
		suma=0
		para i = 1 hasta 5 Hacer
			suma=suma + ConvertirANumero(M(i,j))
		FinPara
		M(6,j) = ConvertirATexto(suma)
	FinPara
	
	////////// CALCULO DEL PRODUCTO MAS VENDIDO ////// 
	
	para j = 1 hasta 5 hacer 
		mayor=0
		para i = 1 hasta 5 Hacer
			si i = 1 Entonces
				mayor = ConvertirANumero(M(i,j)) 
			SiNo
				si mayor < ConvertirANumero(M(i,j)) Entonces
					
					mayor = ConvertirANumero(M(i,j))
					
				FinSi
			FinSi
		FinPara
		M(7,j) = ConvertirATexto(mayor)
	FinPara
	
	para j = 1 hasta 5 hacer 
		para i = 1 hasta 5 Hacer
			si ConvertirANumero(M(7,j)) = ConvertirANumero(M(i,j)) Entonces
				prod_mayor = M(i,0)
			FinSi
		FinPara
		M(7,j) = prod_mayor
	FinPara
	
	
	//////// SUMA SEMANAL DE LOS PRODUCTOS ////////
	
	para i = 1 hasta 6 Hacer
		suma_semanal = 0
		para j=1 hasta 5 Hacer
			suma_semanal =  suma_semanal + ConvertirANumero(M(i,j))
			
		FinPara
		M(i,6)= ConvertirATexto(suma_semanal)
		
	FinPara
	
	
	
	
	
	
	
	para i = 0 hasta 7 Hacer
		para j = 0 hasta 6 Hacer
			Escribir M(i,j) " " Sin Saltar
		FinPara
		
		Escribir ""
	FinPara
	
	
	
FinAlgoritmo
