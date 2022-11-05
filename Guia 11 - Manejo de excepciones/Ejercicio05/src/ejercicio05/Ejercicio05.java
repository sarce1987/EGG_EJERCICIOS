/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
pantalla. En este último caso también se debe contar el carácter fallido como un intento.
*/

package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio05 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aleatorio = (int) (Math.random()*(500)+1);
        int num, i=0;
        
     try{   
        do{
           i+=1;
            System.out.print("Ingrese el numero a adivinar: ");
            num=leer.nextInt();
            mayorMenorIgual(aleatorio, num);
            
        }while(aleatorio!=num);
     }catch(InputMismatchException e){
         System.out.println("Error. Ha ingresado un caracter en vez de un numero"); 
     }   
 
    }
    
    public static void mayorMenorIgual(int aleatorio , int num){
        
        if (num>aleatorio) {
                System.out.println("El numero ingresado es mayor al numero a adivinar");
            }else if(num<aleatorio){
                System.out.println("El numero ingresado es menor al numero a adivinar");
            }else{
                System.out.println("FELICITACIONES USTED HA ADIVINADO EL NUMERO " + aleatorio);
                
            }
        
    }
    
}
