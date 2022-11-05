
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;


public class OperacionServicio {
    Scanner leer = new Scanner(System.in);
   
    //Este metodo crea un objeto operacion
    public Operacion crearOperacion(){
        
        Operacion op = new Operacion();
        System.out.println("Ingrese el primer numero: ");
        op.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        op.setNum2(leer.nextInt());
        return op;
      }
    //Metodo para sumar
    public int sumar(Operacion op){
        
        int suma = op.getNum1() + op.getNum2();
        return suma;
        
    }
    //Metodo para restar
    public int restar(Operacion op){
        int resta = op.getNum1() - op.getNum2();
        return resta;
        
    }
    //Metodo para multiplicar
    public int multiplicar(Operacion op){
        if (op.getNum1()==0 || op.getNum2()==0) {
            System.out.println("Se ha efectuado una multiplicacion de resultado cero");
            return 0;
        }else{
            
            int multi = op.getNum1()*op.getNum1();
            return multi;
        }
        
    }
    //Metodo para dividir
    public int dividir(Operacion op){
        if ( op.getNum2()==0) {
            System.out.println("Se ha efectuado una divicion por cero");
            return 0;
        }else{
            
            int div = op.getNum1()/op.getNum1();
            return div;
        }
        
    }
}
