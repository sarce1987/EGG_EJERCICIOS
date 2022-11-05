/*
 
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma 

 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5Ejercicio1 {

    
    public static void main(String[] args) {
       
        //Definicion de las variables
       int num1, num2 , suma ; 
       
       //Funcion Scanner para poder ingresar los datos por pantalla
       Scanner leer = new Scanner(System.in);
       
       //Ingreseo del primer numero
        System.out.println("Ingrese el primer numero: ");
        
        num1=leer.nextInt();
        
        //Ingreso del sgundo numero
        System.out.println("Ingrese el segundo numero: ");
        
        num2=leer.nextInt();
        
        //Calculo del valor y respuesta
        
        suma = num1 + num2 ;
        
        System.out.println("La suma es: "+suma);
        
        
       
        
    }
    
}
