/*
13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial. 
 */
package guia5ejercicio13;

import java.util.Scanner;


public class Guia5Ejercicio13 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
       
        byte limite , num;
        int suma;
        
        do{
            System.out.println("Ingrese un valor limite positivo: ");
            limite = leer.nextByte();
            
            
        }while(limite<0);
        
        suma=0;
        do{
            System.out.println("Ingrese un numero: ");
           num=leer.nextByte();
           
           suma=suma+num;
            
        }while(suma<limite);
        
        System.out.println("La suma supero el valor limite ingresado ("+suma+")");
    }
    
}
