/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author seba_
 */
public class Ejercicio8 {

    public static void main(String[] args) {
      
       try{ 
        metodo();
       }catch(Exception e){
           
           System.out.println("Se ejecuto aca");
           e.getStackTrace();
       }
      
    }
    
    
    public static void metodo(){
        
      
     
           throw new ArithmeticException();
       
      
       
       
    }
    
}
