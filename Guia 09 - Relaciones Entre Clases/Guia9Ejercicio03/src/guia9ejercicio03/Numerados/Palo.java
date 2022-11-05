/*
un palo (espadas, bastos, oros y copas)
 */
package guia9ejercicio03.Numerados;


public enum Palo {
    ESPADA("Espada") , BASTO("Basto") , ORO("Oro") , COPA("Copa");
    
    private String nombre;
    
    private Palo(String nombre){
        this.nombre = nombre;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
