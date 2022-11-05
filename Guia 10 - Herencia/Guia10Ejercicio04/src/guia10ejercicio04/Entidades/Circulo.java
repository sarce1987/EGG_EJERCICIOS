
package guia10ejercicio04.Entidades;

import guia10ejercicio04.Interface.calculoFormas;


public class Circulo implements calculoFormas {

       private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
       
       
    
    @Override
    public void calcularArea() {
        double area = pi*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: "+area);
    }

    @Override
    public void calcularPerimetro() {
        
        double perimetro = 2*pi*radio;
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
    
}
