
package guia10ejercicio02;

import guia10ejercicio02.Entidades.Electrodomestico;
import guia10ejercicio02.Entidades.Lavadora;
import guia10ejercicio02.Entidades.Televisor;
import java.util.ArrayList;



public class Inicio {

   
    public static void main(String[] args) {
        
       
        ArrayList<Electrodomestico> lista = new ArrayList();
        
//        System.out.println("------ LAVADORA -------");
//        Lavadora lav = new Lavadora();   
//        lav.crearLavador();
//        lav.precioFinal();
//        System.out.println("------ TELEVISOR -------");
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();
//        tv.precioFinal();
        
        
        lista.add(new Televisor(45, true, 1500, "negro", 'A', 5));
        lista.add(new Televisor(55, true, 2000, "negro", 'C', 8));
        lista.add(new Lavadora(35, 5500, "Blanco", 'F', 50));
        lista.add(new Lavadora(55, 15500, "Blanco", 'B', 80));
        
        
       for (Electrodomestico aux : lista) {
          
              aux.precioFinal();
            
       }
        
    }
    
}
