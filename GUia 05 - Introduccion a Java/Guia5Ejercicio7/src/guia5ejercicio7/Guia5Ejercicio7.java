/*
7. Crear un programa que dado un numero determine si es par o impar
 */
package guia5ejercicio7;

import java.util.Scanner;


public class Guia5Ejercicio7 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        
        num = leer.nextInt();
        
        if(num % 2 == 0) {
            
            System.out.println("El numero ingresado es par");
    
        } else {
            
            System.out.println("El numero ingresado no es par");
        }
        
        
    }
    
}
