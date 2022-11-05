/*
21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
 */
package guia5ejercicio21;

import java.util.Scanner;

public class Guia5Ejercicio21 {

    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        int cont = 0;
       //1) Pido ingresar la dimension del vector
        System.out.println("Ingrese la dimension del vector: ");
        
        int n = leer.nextInt();
        
       //2)Defino y dimensiono el vector
       
       int [] V = new int[n];
       
       //3) Rellenamos el vector con numeros aleatorios. Para ello necesitamos un ciclo para 
       
        for (int i = 0; i < V.length; i++) {
            
            //Esta ecuacion genera valores entre el 0 y el 9
            V[i]= (int) (Math.random()*10);
            
        }
        
      //4) Pedimos que se ingrese un valor de busqueda y realizar la busqueda
      
        System.out.println("Que valor desea buscar en el arreglo: ");
        int busq = leer.nextInt();
        
        for (int i = 0 ; i < V.length;i++){
            
            if( V[i] == busq){
                
                System.out.println("El numero se encuentra en la posicion V["+i+"]");
                cont+=1;
               
            }
                
            }
           if(cont>1){
               System.out.println("El numero se encuentra repetido "+cont+" veces");
           } 
           else if ( cont==0 ){
               System.out.println("No se encontro el numero");
        
        }
        
    }
    
}
