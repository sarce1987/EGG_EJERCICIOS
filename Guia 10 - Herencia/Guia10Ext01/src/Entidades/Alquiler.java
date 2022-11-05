
package Entidades;

import Enumerados.PosicionAmarre;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class Alquiler {
    
    private Cliente cliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private PosicionAmarre posicionAmarre;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, PosicionAmarre posicionAmarre) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public PosicionAmarre getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(PosicionAmarre posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void calcularPrecio(){
        int diasTranscurridos = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        cliente.getBarco().calcularModulo();
        int precio = diasTranscurridos*cliente.getBarco().calcularModulo();
        System.out.println("Precio de alquiler: $"+precio);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "cliente=" + cliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + '}';
    }
  
    
    
}
