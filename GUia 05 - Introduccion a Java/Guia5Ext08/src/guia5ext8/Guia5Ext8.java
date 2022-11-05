/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break
 */
package guia5ext8;

import java.util.Scanner;


public class Guia5Ext8 {

  
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num , num_leidos , num_pares, num_impares;
        num_leidos = 0; // i es la cantidad de numeros leidos
        num_pares=0;
        num_impares=0;
        do{
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
           
            if(num>0){
                if(num%2==0){
                     num_pares++;
                
                 }else{
                    num_impares++;
                }

                num_leidos++;
            }
        }while(num%5 != 0);
        
        System.out.println("Total de numeros leidos: "+num_leidos);
        System.out.println("Numeros impares leidos: "+num_impares);
        System.out.println("Numeros pares leidos: "+num_pares);
        
    }
    
}
