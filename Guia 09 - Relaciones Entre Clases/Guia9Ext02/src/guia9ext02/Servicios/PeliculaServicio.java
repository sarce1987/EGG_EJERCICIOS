package guia9ext02.Servicios;

import guia9ext02.Entidades.Pelicula;
import java.util.ArrayList;

public class PeliculaServicio {

    public ArrayList<Pelicula> crearPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        peliculas.add(new Pelicula("Batman", 180 , 18, "Tim barton"));
        peliculas.add(new Pelicula("Residen Evil", 120 , 18, "Sarasa"));
        peliculas.add(new Pelicula("Armagedon", 160 , 18, "Spilberg"));
        peliculas.add(new Pelicula("Titanic", 180 , 18, "Tim barton"));
        peliculas.add(new Pelicula("Godzilla", 140 , 18, "Spilberg"));
        
        return peliculas;
    }

}
