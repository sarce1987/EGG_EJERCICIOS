/*
6. Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
package guia5ejercicio6;

import java.util.Scanner;


public class Guia5Ejercicio6 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1 , num2;
        
        System.out.print("Ingrese el primer numero: ");
        
        num1 = leer.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        
        num2 = leer.nextInt();
        
        if(num1>num2){
            
            System.out.println(num1+ " Es mas grande que "+num2);
        }
        else if(num1<num2){
            System.out.println(num2+" Es mas grande que "+num1);
        }
        
        else {
            System.out.println("Los numeros son iguales");
        }
    }
    
}
