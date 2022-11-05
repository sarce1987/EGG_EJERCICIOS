/*
22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package guia5ejercicio22;

import java.util.Random;
import java.util.Scanner;

public class Guia5Ejercicio22 {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();//Esto es un utiliti para poner valores aleatorios
        
        System.out.println("Ingrese la dimension del vector:");
        int n = leer.nextInt();
        
        int V [] = new int[n];//definicion del vector
        
        for (int i = 0; i < V.length; i++) { //Con esto rellenamos el vector con valores aleatorios
  
            V[i] = aleatorio.nextInt(20000);

        }
        
        int num, digitos =0; // variables necesarias para este contador
        
        int un_dig=0, dos_dig=0, tres_dig=0 , cuatro_dig=0 , cinco_dig=0 ;
       
        /*
        Primero mediante el while lo que hago es contar los digitos y del numero
        V[i] y lueago entro al condicionale switch donde ahi voy a comparar si son 
        de tantos digitos que cuente cuantos son de esa cantidad de digitos             
        */
        for (int i = 0; i < V.length; i++) {
            
            num = V[i];
            digitos=0;
            while ( num != 0) {                
                
                num = num/10;
                digitos++;
            }
     
            switch(digitos){
                case 1:
                    un_dig++;
                    break;
                case 2:
                    dos_dig++;
                    break;
                case 3:
                    tres_dig++;
                    break;
                case 4 :
                    cuatro_dig++;
                    break;
                case 5:
                    cinco_dig++;
                    break;
            }
        }
        
        for (int i = 0; i < V.length; i++) {
            
            System.out.println(V[i]);
        }

        System.out.println("De 1 digito hay: "+un_dig );
        System.out.println("De 2 digito hay: "+dos_dig );
        System.out.println("De 3 digito hay: "+tres_dig );
        System.out.println("De 4 digito hay: "+cuatro_dig );
        System.out.println("De 5 digito hay: "+cinco_dig );
        
    }
    
}
