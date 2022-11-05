
package guia10ejercicio02.Entidades;

import java.util.Scanner;




public class Electrodomestico {
    
   protected double precio;
   protected String color;
   protected char consumoEnergetico;
   protected double peso;
   Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
   
    private void comprobarConsumoEnergetico(char consumoEnergetico){
        
        
        if (consumoEnergetico< 'A' || consumoEnergetico>'F') {
            
            this.consumoEnergetico ='F';
            System.out.println("La letra ingresada no fue correcta. Por defecto se colocó consumo F");
        }else{
            
            this.consumoEnergetico = consumoEnergetico;
            System.out.println("Letra ingresada correctamente ");
        }
    }
    
    
    private void comprobarColor(String color){
        String col = color.toLowerCase();
        
        if (col.equals("blanco")||col.equals("negro")||col.equals("rojo")||col.equals("azul")||col.equals("gris")) {
            System.out.println("El color fue seleccionado correctamente");
            this.color = col;
        }else{
            System.out.println("No existe ese color se pndra el color por defecto");
            this.color = "blanco";    
        }
        
    }

    
    public void crearElectrodomestico(){
        this.precio = 1000;
        System.out.println("Escriba el color del electrodomestico (Blanco , Negro , Rojo, Azul o Gris)");
        this.color = leer.next();
        comprobarColor(this.color);
        System.out.println("Consumo energetico A, B, C, D, E o F");
        this.consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(this.consumoEnergetico);
        System.out.println("Que peso tiene?");
        this.peso = leer.nextDouble();
        
    }
    
    public void precioFinal(){
        
        switch(consumoEnergetico){
            case 'A':
                this.precio+=1000;
                break;
            case 'B':
                this.precio+=800;
                break;
            case 'C':
                this.precio+=600;
                break;
            case 'D':
                this.precio+=500;
                break;
            case 'E':
                this.precio+=300;
                break;
            case 'F':
                this.precio+=100;
                break;
        }
        
        if (this.peso>=1 && this.peso<=19) {
            this.precio +=100;
        }
        if (this.peso>=20 && this.peso<=49) {
            this.precio +=100;
        }
        if (this.peso>=50 && this.peso<=79) {
            this.precio +=100;
        }
        if (this.peso>=80) {
            this.precio +=100;
        }
        
    }
    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
}
