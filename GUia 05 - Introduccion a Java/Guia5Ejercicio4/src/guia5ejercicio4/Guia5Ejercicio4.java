/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
package guia5ejercicio4
*/


package guia5ejercicio4;

import java.util.Scanner;

public class Guia5Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float grados , faren;
        
        System.out.println("Ingrese los grados: ");
        
        grados=leer.nextFloat();
        
        faren = 32 +(9 * grados/5);
        
        System.out.println("En farenheit equivale a: "+faren +"°F");
        
        
    }
    
}
