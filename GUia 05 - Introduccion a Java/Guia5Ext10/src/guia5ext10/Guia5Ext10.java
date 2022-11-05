/*
 10. Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe 
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para 
realizar este ejercicio investigue como utilizar la función Math.random() de Java
 */
package guia5ext10;

import java.util.Scanner;


public class Guia5Ext10 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        
            int aleatorio1 = (int) Math.round(Math.random()*10);//Valores aleatorios entre el 1 y 6
            
            int aleatorio2 = (int) Math.round(Math.random()*10);//Valores aleatorios entre el 1 y 6
        
            int multi = aleatorio1*aleatorio2;
            
            int respuesta;
            System.out.println(multi);
            
            do{
                System.out.println("Adivine el resultado de la multiplicacion");
            respuesta = leer.nextInt();
                
                if (respuesta != multi) {
                    System.out.println("Respuesta INCORRECTA");
                    
                }
            
            }while(respuesta != multi);
            
            System.out.println("La respuesta ingresada es CORRECTA");
            
    }
    
    
    
}
