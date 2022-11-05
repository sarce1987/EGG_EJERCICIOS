
package guia10ext01;

import Entidades.Alquiler;
import Servicios.AlquileresServicio;


public class Principal {

    
    public static void main(String[] args) {
      AlquileresServicio as = new AlquileresServicio();
      Alquiler a = as.crearAlquiler();
      a.calcularPrecio();
        System.out.println(a);
    }
    
}
