/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
package guia5ext06;

import java.util.Scanner;


public class Guia5Ext06 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas que quiere tomar la altura: ");
        byte N = leer.nextByte();
        
        float altura;
        float sum1 = 0 , sum2 = 0 ;
        int cont = 0;
        
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la altura n°"+i+":");
            altura = leer.nextFloat();
            
            sum1 = sum1 + altura;
            if (altura<=1.60f) {
                cont += 1;
                sum2+=altura;
            }
        }
        
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: "+sum2/cont);
        System.out.println("El promedio de estaturas en general es de: "+sum1/N);
    }
    
}
