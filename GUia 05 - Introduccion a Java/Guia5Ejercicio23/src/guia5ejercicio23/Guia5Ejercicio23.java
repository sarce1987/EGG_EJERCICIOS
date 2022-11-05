/*
23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz
 */
package guia5ejercicio23;


public class Guia5Ejercicio23 {

   
    public static void main(String[] args) {
   
        int M [][] = new int[4][4]; //Matriz
        int T[][] = new int [4][4]; //Su transpuesta
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][j] = (int) (Math.random()*10);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+M[i][j]+"]" + "");
            }
           System.out.println(" ");
        }
         
        System.out.println(" ");
       
         // En las siguientes lineas definimmos la transpuesta y la mostramos
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                T[j][i] = M[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+T[i][j]+"]" + "");
            }
           System.out.println(" ");
        }
        
    }
    
}
