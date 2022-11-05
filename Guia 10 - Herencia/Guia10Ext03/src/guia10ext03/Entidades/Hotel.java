
package guia10ext03.Entidades;


public abstract class Hotel extends Alojamiento{
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected Double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, Double precioHabitaciones, String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        super(nombreAlojamiento, direccion, localidad, nombreGerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    public void crearHotel(){
        super.crearAlojamiento();
        System.out.print("Cantidad de habitaciones: ");
        this.cantHabitaciones = leer.nextInt();
        
        System.out.print("Cantidad de camas: ");
        this.numCamas = leer.nextInt();
        
        System.out.print("Cantidad de pisos: ");
        this.cantPisos = leer.nextInt();
        
      
        
        
    }
    
    public abstract void calcularPrecio();

    @Override
    public String toString() {
        
        return super.toString()+  "\ncantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones;
    }
    
    
}
