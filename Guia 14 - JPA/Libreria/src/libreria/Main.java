
package libreria;

import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;


public class Main {

    
    public static void main(String[] args) throws Exception {
      
//        try {
//            AutorServicio aserv = new AutorServicio();
//
//            aserv.crearAutor("Sebastian");
//
//
//            System.out.println(aserv.buscarAutorPorNombre("Sebastian"));
//
//
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
        EditorialServicio edserv = new EditorialServicio();
        edserv.crearEditorial();
        edserv.crearEditorial();
        edserv.crearEditorial();
        
        AutorServicio as = new AutorServicio();
        as.crearAutor();
        as.crearAutor();
        as.crearAutor();
        
        
       //System.out.println(edserv.buscarEditorialPorID());
        
       // edserv.editarEditorialPorNombre();
       // edserv.darDeBaja();
       // edserv.darAlta();
           
       LibroServicio ls = new LibroServicio();
       
       ls.crearLibro();
      
    }
    
}
