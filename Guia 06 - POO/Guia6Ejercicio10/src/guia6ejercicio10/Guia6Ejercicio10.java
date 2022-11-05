/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
 */
package guia6ejercicio10;

import java.util.Arrays;


public class Guia6Ejercicio10 {

    public static void main(String[] args) {
     
        double A [] = new double[50];
        double B [] = new double[20];
        
        //Relleno de los arreglos con numeros aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random()*10;
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = Math.random()*10;
        }
        
        imprimirArreglo(A);
        imprimirArreglo(B);
        
        Arrays.sort(A);
        imprimirArreglo(A);
        
        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
        }
        Arrays.fill(B, 10,20,0.5);
        
        imprimirArreglo(B);
    }
    
    
    
    
    ////// Metodo para imprimir los arreglos //////////
    
     public static void imprimirArreglo(double arreglo[]){
         System.out.println("\n ////// IMPRIMIR ARREGLO //////");
         for (int i = 0; i < arreglo.length; i++) {
             System.out.println(arreglo[i]);
         }
    }
}

