/*
 11. Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo entero 
truncan los números o resultados
 */
package guia5ext11;

import java.util.Scanner;


public class Guia5Ext11 {

 
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        int aux = num;
        int cont=0;
        do{
            
            aux = aux/10;
            
            System.out.println(aux);
            cont++;
            
            
        }while(aux!=0);
            
        System.out.println("El numero tiene: " +cont+" digitos");
    }
    
}
