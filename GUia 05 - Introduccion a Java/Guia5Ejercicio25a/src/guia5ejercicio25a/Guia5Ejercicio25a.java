/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio25a;

import java.util.Scanner;


public class Guia5Ejercicio25a {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
       byte M[][] = new byte [3][3];
       byte T[][] = new byte [3][3];
       
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               
               System.out.println("Ingrese el valor ("+i+","+j+"): ");
               M[i][j] = leer.nextByte();
               T[j][i] = M[i][j];
           }
       }
      
       boolean suma_fila = sumafilacol(M);
       boolean suma_col = sumafilacol(T);
       boolean suma_diagonales = sumadiagonales(M);
      
        
       if(suma_fila&&suma_col&&suma_diagonales){
           
           System.out.println("LA MATRIZ ES MAGICA");
       }else{
           System.out.println("La matriz no es magica");
       }
       
    }
    
    ////////////// esta funcion devuelve verdadero si la suma de las filas son iguales ///////////////////
    public static boolean sumafilacol(byte[][] A ){
       boolean res = true;
       byte S [] = new byte [3];//Este es un vector de suma de filas
       byte suma ;
       
       //Con esto genero un vector que en sus filas tiene la suma de las filas de la matriz
       for (int i = 0; i < 3; i++) {
           suma = 0;
           for (int j = 0; j < 3; j++) {
               
               suma+=A[i][j];
           }
           S[i]=suma;
       }
       for (int i = 0; i < 2; i++) {
           
           if(S[i]==S[i+1]){
               
               res = true && res ;
               
           }else{
               res = false;
           }
       }
       
       return res;
   }
   //////////////////// funcion para sumar las diagonales principales y secundarias /////////////////
    public static boolean sumadiagonales (byte[][] A){
        boolean res;
        byte diag_principal = 0 , diag_secundaria = 0;
        //esta lineas suman la diagonal principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    diag_principal =  (byte) (A[i][j] + diag_principal); 
                }
            }
        }
        //esta linea suma la diagonal secundaria
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==(2-i)){
                    diag_secundaria =  (byte) (A[i][j] + diag_secundaria); 
                }
            }
        }
        //esta linea compara si la suma las diagonales es igual
        if(diag_principal==diag_secundaria){
            
            res=true;
        }else{
            res = false;
        }
        
        return res;
    }
}
