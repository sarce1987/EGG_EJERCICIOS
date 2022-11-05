/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 

 */
package guia5ext12;


public class Guia5Ext12 {

    
    public static void main(String[] args) {
      
        
        String V [] = new String [3];
      
      
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    if (String.valueOf(i).equals("3")) {
                        V[0]="E";
                    }else{
                        V[0]= String.valueOf(i);
                    }
                    if (String.valueOf(j).equals("3")) {
                        V[1]="E";
                    }else{
                        V[1]= String.valueOf(j);
                    }
                    if (String.valueOf(k).equals("3")) {
                        V[2]="E";
                    }else{
                        V[2]= String.valueOf(k);
                    }
                    
                    System.out.println(V[0]+"-"+V[1]+"-"+V[2]);
                }
            }
        }
        
        
    }
    
}
