/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”
 */
package guia5ext07;

import java.util.Scanner;


public class Guia5Ext07 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        byte num = leer.nextByte();
       
        int n = 0;
        int cont=0;
        int max =0 , min = 0 , suma=0;
        double promedio;
       
        do {
            System.out.println("Ingrese el valor"+(1+cont));
            n = leer.nextInt();
            if(cont==0){
                
                min=n;
                max=n;

            }else if(n<min){
                min = n;
            }else if(n>max){
                max = n;
            }
               
                suma += n; 

            cont++;
        } while (cont<num);
        
        
           promedio = suma / num;
           
         System.out.println("El minimo es: "+min);      
         System.out.println("El maximo es: "+max); 
         System.out.println("El promedio es: "+promedio);
    }
    
}
