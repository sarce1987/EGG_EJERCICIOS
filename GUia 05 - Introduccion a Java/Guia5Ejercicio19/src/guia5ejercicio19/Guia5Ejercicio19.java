/*
19. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void). 
El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 € 
 */
package guia5ejercicio19;

import java.util.Scanner;


public class Guia5Ejercicio19 {

   
    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in);
        
        double euros;
        String conversion;
        
        System.out.println("Ingrese una cantidad de euros: ");
        euros = leer.nextDouble();
        
        leer.nextLine();
        
        System.out.println("En que los quiere convertir: ");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("Yenes");
        conversion = leer.nextLine().toLowerCase();
        
        conversion(euros , conversion);
        
     
    }
    
    
   
    
    public static void conversion(double euros , String conversion){
        
        switch (conversion){
            case "libra":
                System.out.println(euros +" Euros "  +"Equivale a: "+ euros*0.86 +" Libras");
                break;
                
            case "dolar":
                System.out.println(euros +" Euros "  +"Equivale a: "+ euros*1.28611 +" Dolares");
                break;
                
            case "yenes":
                System.out.println(euros +" Euros "  +"Equivale a: "+ euros*129.852 +" Yenes");
                break;
            
            default:
                System.out.println("No se ha seleccionado la opcion correcta");
                break;
        }
        
        
    }
    
}
