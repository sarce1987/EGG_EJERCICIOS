
package guia8ejercicio05;

import guia8ejercicio05.Servicios.PaisServicio.PaisServicio;


public class Guia8Ejercicio05 {

    
    public static void main(String[] args) {
        
        PaisServicio pServ = new PaisServicio();
        
        pServ.listaPais(pServ.crearPais());
        pServ.listaPais(pServ.crearPais());
        pServ.listaPais(pServ.crearPais());
        pServ.mostrarPaises();
    }
    
}
