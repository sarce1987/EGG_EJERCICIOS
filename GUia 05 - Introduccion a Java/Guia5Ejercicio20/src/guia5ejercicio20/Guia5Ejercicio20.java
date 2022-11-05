/*
20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente
 */
package guia5ejercicio20;

import java.util.Scanner;


public class Guia5Ejercicio20 {

    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
       
        //Forma de definir un arreglo.
        int V [] = new int [100];
        
        //Con este for rellenamos el arreglo
        for (int i = 0 ; i < V.length ; i++){
            
           V [i] = i;
       
        }
        //Con este for mostramos por pantalla los elementos del arreglo
        for (int i = 0 ; i < V.length ; i++){
            
            System.out.println(V[i]);
       
        }
        
        
    }
    
}
