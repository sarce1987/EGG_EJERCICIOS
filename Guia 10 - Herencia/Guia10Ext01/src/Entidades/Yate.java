
package Entidades;


public class Yate extends Barco {
    private int potencia;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int potencia, int numCamarotes, String matricula, int eslora, short anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    public int calcularModulo(){
        int modulo = super.calcularModulo()+ potencia + numCamarotes;
        return modulo;
    }
}
