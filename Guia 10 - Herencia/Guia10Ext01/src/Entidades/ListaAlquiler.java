
package Entidades;

import java.util.ArrayList;


public class ListaAlquiler {
    
    private ArrayList<Alquiler> alquileres;

    public ListaAlquiler() { 
        alquileres = new ArrayList();
    }
    
    public void agregarALista(Alquiler a){    
        alquileres.add(a);       
    }
    
    
    
    
    
    
}
