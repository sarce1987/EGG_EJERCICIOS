
package guia8ejercicio04.Utilidades;

import guia8ejercicio04.Entidades.Pelicula;
import java.util.Comparator;


public class Comparadores {
   
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p2.getDuracion().compareTo(p1.getDuracion());
            
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getDuracion().compareTo(p2.getDuracion());
            
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTituloAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getTitulo().compareTo(p2.getTitulo());
            
        }
    };
    public static Comparator<Pelicula> ordenarPorDirectorAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getDirector().compareTo(p2.getDirector());
            
        }
    };
}
