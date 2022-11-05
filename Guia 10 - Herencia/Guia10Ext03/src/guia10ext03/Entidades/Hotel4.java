
package guia10ext03.Entidades;

import guia10ext03.Numeradores.TipoGimnasio;


public class Hotel4 extends Hotel {
    
    protected Gimnasio gimansio; 
    protected String nombRestaurant;
    protected int capacidadRestaurant;

    public Hotel4() {
    }

    public Hotel4(Gimnasio gimansio, String nombRestaurant, int capacidadRestaurant, int cantHabitaciones, int numCamas, int cantPisos, Double precioHabitaciones, String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombreAlojamiento, direccion, localidad, nombreGerente);
        this.gimansio = gimansio;
        this.nombRestaurant = nombRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Gimnasio getGimansio() {
        return gimansio;
    }

    public void setGimansio(Gimnasio gimansio) {
        this.gimansio = gimansio;
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
    public void crearHotel4(){
        super.crearHotel();
        
        Gimnasio gim = new Gimnasio();
        gim.crearGimnasio();
        this.gimansio = gim;
        
        
        System.out.print("Nombre del restaurant: ");
        this.nombRestaurant = leer.next();
        
        System.out.print("Capacidad de personas del restaurant: ");
        this.capacidadRestaurant=leer.nextInt();
        
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        int valRestaurant=0 , valGimnasio=0;
       
        //valor agregado por restaurante
        if (this.capacidadRestaurant<30) {
            valRestaurant = 10;
        }else if(this.capacidadRestaurant>=30 && this.capacidadRestaurant<=50){
            valRestaurant = 30;
        }else if(this.capacidadRestaurant>50){
            valRestaurant = 50;
        }
        
        //calcular valor agregado por gimnasio
        if (this.gimansio.getTipo().equals(TipoGimnasio.A)) {
            valGimnasio = 50;
        }else{
            valGimnasio = 30;
        }
        
        this.precioHabitaciones =  50D + (1*this.cantHabitaciones) + valRestaurant +valGimnasio;
    }

    @Override
    public String toString() {
        
        return super.toString()+ "\ngimansio=" + gimansio + ", nombRestaurant=" + nombRestaurant + ", capacidadRestaurant=" + capacidadRestaurant;
    }
    
    
}
