/*
5. Una obra social tiene tres clases de socios: 
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
    descuento en todos los tipos de tratamientos. 
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
    descuento para los mismos tratamientos que los socios del tipo A. 
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
    dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio.
 */
package guia5ext05;

import java.util.Scanner;


public class Guia5Ext05 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        char clase;
        double costo, costo_total;
        
        
        System.out.println("Ingrese el tipo de socio que es (A,B o C)");
        clase =  leer.next().toLowerCase().charAt(0);
        
        System.out.println("Ingrese el costo del tratamiento: ");
        costo = leer.nextDouble();
        
        switch(clase){
        
        case 'a':
            System.out.println("El costo total con descuento (50%) seria de: "+costo*0.5);
            break;
       case 'b':
            System.out.println("El costo total con descuento (35%) seria de: "+costo*0.65);
            break;
        case 'c':
            System.out.println("No se resive descuento, el costo total es de: "+costo);
            break;    
                    
    }
        
    }
    
}
