
package Entidades;


public class Cliente {
    private String nombre;
    private String dni;
    private Barco barco;

    public Cliente() {
    }

    public Cliente(String nombre, String dni, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", barco=" + barco + '}';
    }
    
    
    
}
