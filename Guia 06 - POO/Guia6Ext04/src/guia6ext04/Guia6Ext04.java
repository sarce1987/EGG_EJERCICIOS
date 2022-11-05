
package guia6ext04;

import java.util.Scanner;


public class Guia6Ext04 {

   
    public static void main(String[] args) {
        
        Nif nf1 = crearNif();
        nf1.mostrarNif();
   
    }
    
    //Esto crea un nif con las letras que le corresponde
    
    public static Nif crearNif(){
        Scanner leer = new Scanner(System.in);
        long dni ; 
        String letra = "";
        String L[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
     
        System.out.println("Ingrese el dni:");
        dni = leer.nextLong();
        int resto = 0 ;
       
        for (int i = 0; i < L.length; i++) {
            if (dni%23 == i) {
                letra = L[i];
            }   
        }
        Nif nif = new Nif(dni, letra);
        return nif;
        
    }
    
}

