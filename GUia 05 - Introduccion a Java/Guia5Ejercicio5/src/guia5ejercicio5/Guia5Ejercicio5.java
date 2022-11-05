/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
 */
package guia5ejercicio5;

import java.util.Scanner;


public class Guia5Ejercicio5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); //Comando que permite leer datos
        
        int num , multiplo ; //Declaracion de la variable
        double raiz ;
        
        System.out.println("Ingrese un numero entero: "); //Imprimir ingresar numero
        
        num = leer.nextInt(); //Leer por pantalla el numero
        
        //Aca obtenemos el doble del numero ingresado
        multiplo = num * 2;
        
        System.out.println("El doble de dicho numero es: "+multiplo);
        
        //Aca obtenemos el triple del numero ingresado
        multiplo = num * 3 ;
        
        System.out.println("El triple de dicho numero es: "+multiplo);
        
        raiz = Math.sqrt(num); //Esto devuelve la raiz cuadrada de un numero en formato double.
        
        System.out.println("La raiz cuadrada de dicho numero es:"+raiz);
        
    }
    
}
