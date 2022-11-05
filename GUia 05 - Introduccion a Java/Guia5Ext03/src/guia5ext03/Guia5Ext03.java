/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String. 
 */
package guia5ext03;

import java.util.Scanner;


public class Guia5Ext03 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        String letra = leer.next().toLowerCase();
        
        
        if(letra.equals("a")|| letra.equals("e")|| letra.equals("i")||letra.equals("o")||letra.equals("u")){
            
            System.out.println("La letra ingresada es una vocal");
            
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
        
    }
    
}
