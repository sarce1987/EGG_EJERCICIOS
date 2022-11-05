
package ejercicio03;


public class DivisionNumero {
    
    
    public static void divisionNumeros(int a , int b ) throws ArithmeticException {
        
        if (b ==0) {
            throw new ArithmeticException();
        }
        double division = (double) a / b ;
        System.out.println(division);
        
        
    }
    
    
}
