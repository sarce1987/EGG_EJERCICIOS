/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas es el 
cociente. Por ejemplo: 50 / 13: 
    50 – 13 = 37 una resta realizada 
    37 – 13 = 24 dos restas realizadas 
    24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package guia5ext09;

import java.util.Scanner;


public class Guia5Ext09 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = leer.nextInt();
        
        int cociente=0 , resto=dividendo;
        
       
        while(resto > divisor){
        resto = resto - divisor;
       
        cociente++;
        
        }
        
        System.out.println("Dividendo: "+dividendo);
        System.out.println("Divisor: "+divisor);
        System.out.println("Cociente: "+cociente);
        System.out.println("Resto: "+resto);
        
        System.out.println("Comprobacion divisor*cociente+resto = dividendo: "+(divisor*cociente+resto));
    }
    
}
