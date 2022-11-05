
package Entidades;


public class BarcoMotorizado extends Barco{
    private int potencia;

    public BarcoMotorizado() {
    }

    public BarcoMotorizado(int potencia, String matricula, int eslora, short anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public int calcularModulo(){
        int modulo = super.calcularModulo()+ potencia;
        return modulo;
    }
}
