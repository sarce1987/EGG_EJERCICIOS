/*
24. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa)
 */
package guia5ejercicio24;

import java.util.Scanner;


public class Guia5Ejercicio24 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension de la matriz cuadrada: ");
        byte n = leer.nextByte();
        
        //Definicion y dimencionamiento de la matriz y su transpuesta
        byte M [][] = new byte [n][n];
        byte T [][]= new byte [n][n];
        
        //Con dos ciclos for vamos a rellenar la matriz 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor M("+i+","+j+")  :");
                M[i][j] = leer.nextByte();
                
                T[j][i]= M[i][j];   
            }
        }
        //Mostrar matrices
      for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+M[i][j]+"] ");  
            }
            System.out.println(" ");
        }
      
        System.out.println(" ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+T[i][j]+"] ");  
            }
            System.out.println(" ");
        }
        //Vamos a comprar los valores a ver si son opuestos
        
        boolean comp = true ; //Esta variable va a ir comparando
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(M[i][j]== - T[i][j]){
                    comp = comp && true;
                }else{
                    comp = false;
                }
            }
        }
       
        if(comp){
            System.out.println("\nEs antisimetrica");
        }else{
            System.out.println("\nNo es antisimetrica");
        }
    }
    
}
