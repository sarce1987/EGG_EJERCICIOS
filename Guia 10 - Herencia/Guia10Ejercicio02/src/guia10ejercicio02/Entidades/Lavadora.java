
package guia10ejercicio02.Entidades;


public final class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    public void crearLavador(){
        crearElectrodomestico();
        System.out.println("Ingrese la carga");
        this.carga=leer.nextInt();
    }
    

    public void precioFinal(){
      super.precioFinal();
        if (this.carga > 30) {
            this.precio +=500;
        }
            
      System.out.println("El precio final es $" + precio); 
    }
  
    
}
