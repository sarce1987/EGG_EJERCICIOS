
package guia10ejercicio02.Entidades;


public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
   public void crearTelevisor(){
       crearElectrodomestico();
       System.out.println("Ingrese de cuantas pulgadas es el televisor: ");
       this.resolucion = leer.nextInt();
       System.out.println("El televisor tiene TDT? (S/N)");
       String opcion = leer.next().toLowerCase();
       this.tdt = opcion.equals("s");
   } 
   
   public void precioFinal(){
       super.precioFinal();
       if (this.resolucion>40) {
           this.precio = precio*1.3;
       }
       if (this.tdt) {
           this.precio += 500;
       }
       System.out.println("El precio final es $" + precio);
   }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }
    
   
   
}
