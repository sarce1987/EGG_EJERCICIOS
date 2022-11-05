
package tienda.servicios;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


public class FabricanteServicio {
    
    public Scanner leer;
    private final FabricanteDAO fdao;
    
    public FabricanteServicio(){
        leer = new Scanner(System.in);
        fdao = new FabricanteDAO();
    }
    
    public Fabricante agregarFabricante() throws Exception{
        try {
            System.out.println("Ingrese el nombre del fabricante");
            String nombre = leer.next();
            //Validacion del nombre
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("No ha ingresado un nombre para el fabricante");
            }    
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            return fabricante;           
        } catch (Exception e) {
            throw e;
        }   
    }
    
    //g) Ingresar un fabricante a la base de datos
    public void crearGuardarFabricante() throws Exception{
        try {
            fdao.guardarFabricante(agregarFabricante());
        } catch (Exception ex) {
            throw ex;
        }
    }
}
