/*
12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia5ejercicio12;

import java.util.Scanner;


public class Guia5Ejercicio12 {

    
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   
        byte nota;
        
        do{
        
        System.out.print("Ingrese una nota entre 0 y 10: ");
        
        nota = leer.nextByte();
        
        } while (nota<0 || nota>10);
        
        
        
    }
    
}
