/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
variable auxiliar.
 */
package guia5ext02;

import java.util.Scanner;

public class Guia5Ext02 {

    public static void main(String[] args) {
        
        int A,B,C,D ;
        int aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la variable A: ");
        A = leer.nextInt();
      
        System.out.print("Ingrese la variable B: ");
        B = leer.nextInt();
       
        System.out.print("Ingrese la variable C: ");
        C = leer.nextInt();
       
        System.out.print("Ingrese la variable D: ");
        D = leer.nextInt();
        
        
        aux = B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("la variable A = D ahora vale: "+A);
        System.out.println("la variable B = C ahora vale: "+B);     
        System.out.println("la variable C = A ahora vale: "+C);
        System.out.println("la variable D = B ahora vale: "+D);
        
    }
    
}
