
package guia10ext02.Entidades;

import guia10ext02.Enumeradores.TipoDeInstalacion;



public final class Polideportivo extends Edificio {

    private String nombre;
    private TipoDeInstalacion tipoInstalacion; //Techado o Abierto


    public Polideportivo() {
        super();
        System.out.print("Nombre del polideportivo: ");
        this.nombre = leer.next();
        System.out.println("Seleccionar tipo de instalacion: ");
        System.out.println("1)Techada ");
        System.out.println("2)Abierto ");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: 
                this.tipoInstalacion = TipoDeInstalacion.TECHADO;
                break;
            case 2:
                this.tipoInstalacion = TipoDeInstalacion.ABIERTO;
                break;
         }
    }

    public Polideportivo(String nombre, TipoDeInstalacion tipoInstalacion, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TipoDeInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
     
    
     @Override
    public void calcularSuperficie() {
        System.out.println("La superficie " +(ancho * largo) + "m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen " + (ancho * largo * alto) +"m3");
    }
    
    
}
