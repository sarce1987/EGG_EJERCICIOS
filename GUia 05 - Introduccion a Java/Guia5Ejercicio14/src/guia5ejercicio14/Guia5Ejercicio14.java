/*
14. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
 */
package guia5ejercicio14;

import java.util.Scanner;


public class Guia5Ejercicio14 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int num , suma;
       suma=0;
       
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingresar un numero "+i+": ");
            num=leer.nextInt();
            
            if(num==0){
                System.out.println("Se capturo el numero cero");
                break;          
            }
            if(num>0){
                
                suma=suma+num;
            }
            
        }
        
        System.out.println("La suma de los valores agregados positivos es: "+suma);
        
    }
    
}
