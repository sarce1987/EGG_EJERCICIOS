/*
2) Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla. 
 */
package guia5ejercicio2;

import java.util.Scanner;


public class Guia5Ejercicio2 {

    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        //Defino las variables necesarias 
        
        String nombre;
        
        //Pido que se ingrese nombre por pantalla 
        
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        
        //Mostramo el nombre por pantalla
        
        System.out.println("Su nombre es: "+nombre );
        
        
        
        
        
    }
    
}
