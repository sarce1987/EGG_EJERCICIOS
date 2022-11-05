/*
18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo: 
5 *****
3 ***
11 ***********
2 **
 */
package guia5ejercicio18;

import java.util.Scanner;


public class Guia5Ejercicio18 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num1 , num2 , num3 , num4 ;
        
       do{
        System.out.println("Ingrese el valor 1");
        num1 = leer.nextInt();
       }while(num1 <1 || num1>20);
        
        do{
        System.out.println("Ingrese el valor 2");
        num2 = leer.nextInt();
       }while(num2 <1 || num2>20);
        
        do{
        System.out.println("Ingrese el valor 3");
        num3 = leer.nextInt();
       }while(num3 <1 || num3>20);
        
        do{
        System.out.println("Ingrese el valor 4");
        num4 = leer.nextInt();
       }while(num4 <1 || num4>20);
        
        
        System.out.print(num1 + " ");
        for (int i = 1; i <= num1; i++) {
            System.out.print("* ");
        }  
        System.out.println(); //Salto 
        
            System.out.print(num2 + " ");
        for (int i = 1; i <= num2; i++) {
            System.out.print("* ");
        }    
        System.out.println(); //Salto 
        
            System.out.print(num3 + " ");
        for (int i = 1; i <= num3; i++) {
            System.out.print("* ");
        }   
        System.out.println(); //Salto 
            System.out.print(num4 + " ");
        for (int i = 1; i <= num4; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    
}
