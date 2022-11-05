
package Entidades;

public class Cuenta {
    
    //Atributos
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interes;

    
    //Constructor vacio y constructor con atributos
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes){
        
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
        
    }

    
    //Metodos getters & setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    
    
    
}
