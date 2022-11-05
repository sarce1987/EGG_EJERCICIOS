
package Entidades;


public class Velero extends Barco {
    
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, int eslora, short anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    public int calcularModulo(){
        int modulo = super.calcularModulo()+ numMastiles;
        return modulo;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + '}';
    }
    
    
}
