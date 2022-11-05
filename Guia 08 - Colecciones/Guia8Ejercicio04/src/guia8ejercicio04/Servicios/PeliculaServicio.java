
package guia8ejercicio04.Servicios;

import guia8ejercicio04.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;



public class PeliculaServicio {
    
    public Scanner leer;
    public ArrayList<Pelicula> listPeli;
    
    public PeliculaServicio(){
        
        leer = new Scanner(System.in).useDelimiter("\n");
        listPeli = new ArrayList();
        
    }
    
    /*
    --------- CREACION DE UNA PELICULA ---------
    Este metodo retorna una pelicula con su nombre , director y duracion en horas
    */
    public Pelicula crearPelicula(){
        
        System.out.println("------ PELICULA ------");
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        p.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del director");
        p.setDirector(leer.nextLine());
        System.out.println("Ingrese la duracion de la pelicula (en horas)");  
        p.setDuracion(leer.nextDouble());
        leer.nextLine();
        return p;
    }
    
    /*
    --------- VA AGREGANDO PELICULAS A LA LISTA DE PELICULAS ---------
    */
    public void crearLista(Pelicula p){    
        listPeli.add(p);

    }
    
    /*
    --------- MOSTRAR PELICULAS ---------
    */
    
    public void mostrarPeliculas(){
        
        System.out.println("------ MOSTRAR PELICULAS ------");
        for (Object aux : listPeli) {
            System.out.println(aux);
        }
    }
    
    /*
    --------- MOSTRAR PELICULAS DURACION MAYOR A 1 HORA---------
    */
    
    public void mostrarPeliculasMayorHora(){
        System.out.println("------ MOSTRAR PELICULAS MAYOR A UNA HORA ------");
        for (Pelicula aux : listPeli) {
            if (aux.getDuracion()>=1) {
                System.out.println(aux);
            }
        }
        
    }
}
