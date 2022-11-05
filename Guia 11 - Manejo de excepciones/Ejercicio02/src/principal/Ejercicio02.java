
package principal;


public class Ejercicio02 {

   
    public static void main(String[] args) {
        
        String [] arreglo = new String[5];
        
        try{
        arreglo [6] = "Hola mundo";
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Valor fuera de limite");  
          
        }
        
    }
    
}
