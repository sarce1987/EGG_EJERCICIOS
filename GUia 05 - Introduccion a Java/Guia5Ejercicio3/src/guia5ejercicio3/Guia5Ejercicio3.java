/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java. 
 */
package guia5ejercicio3;

import java.util.Scanner;


public class Guia5Ejercicio3 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase: ");
        
        frase=leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
       
        
        
    }

    
    }
    

