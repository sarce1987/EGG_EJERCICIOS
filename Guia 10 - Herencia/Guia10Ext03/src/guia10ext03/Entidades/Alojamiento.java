
package guia10ext03.Entidades;

import java.util.Scanner;


public abstract class Alojamiento {
    protected String nombreAlojamiento;
    protected String direccion;
    protected String localidad;
    protected String nombreGerente;
    public Scanner leer = new Scanner(System.in);
    public Alojamiento() {
    }

    public Alojamiento(String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        this.nombreAlojamiento = nombreAlojamiento;
        this.direccion = direccion;
        this.localidad = localidad;
        this.nombreGerente = nombreGerente;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public void crearAlojamiento(){
        System.out.print("Nombre: ");
        this.nombreAlojamiento = leer.next();
        leer.nextLine();
        
        System.out.print("Direccion: ");
        this.direccion = leer.nextLine();
        
        
        System.out.print("Localidad: ");
        this.localidad = leer.next();
          leer.nextLine();
          
        System.out.print("Nombre del gerente: ");
        this.nombreGerente = leer.nextLine();
        
    }

    @Override
    public String toString() {
        return "\n"+ nombreAlojamiento + "\n, direccion=" + direccion + ", localidad=" + localidad + ", nombreGerente=" + nombreGerente ;
    }
    
    
}
