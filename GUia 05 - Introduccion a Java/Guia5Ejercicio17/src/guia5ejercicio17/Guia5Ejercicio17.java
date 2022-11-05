/*
 17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
* * * * 
*     *
*     *
* * * * 
 */
package guia5ejercicio17;

import java.util.Scanner;


public class Guia5Ejercicio17 {

  
    public static void main(String[] args) {
    
        
        int lado;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduzca el lado del cuadrado: ");
            lado = teclado.nextInt();
        }
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        
 }
    

