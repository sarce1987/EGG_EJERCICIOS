
package guia10ext03.Utilidades;

import guia10ext03.Entidades.Hotel;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Hotel> ordenarPorPrecioDesc = new Comparator<Hotel> () {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            
            return h2.getPrecioHabitaciones().compareTo(h1.getPrecioHabitaciones());
        }
    }  ;
   
    
    
    
    
}
