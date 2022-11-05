
package guia10ext02.Entidades;

import java.util.Scanner;


public abstract class Edificio {
    
    protected int ancho ;
    protected int largo ;
    protected int alto ;
    protected Scanner leer = new Scanner(System.in);

    public Edificio() {
        System.out.println("---- DATOS CONSTRUCCIONES ----");
        System.out.print("Ancho del Edificio: ");
        this.ancho = leer.nextInt();
        System.out.print("Largo del Edificio: ");
        this.largo = leer.nextInt();
        System.out.print("Alto del Edificio: ");
        this.alto = leer.nextInt();
    }

    public Edificio(int ancho, int largo, int alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
}
