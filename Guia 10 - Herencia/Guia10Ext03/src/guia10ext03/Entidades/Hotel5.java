package guia10ext03.Entidades;

public final class Hotel5 extends Hotel4{

    private int cantSalonConferencia;
    private int cantSuites;
    private int cantLimos;

    public Hotel5() {
    }

    public Hotel5(int cantSalonConferencia, int cantSuites, int cantLimos, Gimnasio gimansio, String nombRestaurant, int capacidadRestaurant, int cantHabitaciones, int numCamas, int cantPisos, Double precioHabitaciones, String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        super(gimansio, nombRestaurant, capacidadRestaurant, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombreAlojamiento, direccion, localidad, nombreGerente);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimos = cantLimos;
    }

    public int getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(int cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimos() {
        return cantLimos;
    }

    public void setCantLimos(int cantLimos) {
        this.cantLimos = cantLimos;
    }
    
    
    public void crearHotel5(){
        super.crearHotel4();
        System.out.print("Cantidad de salones de conferencia: ");
        this.cantSalonConferencia=leer.nextInt();
        
        System.out.print("Cantidad de Suites");
        this.cantSuites=leer.nextInt();
        
        System.out.print("Cantidad de limosinas");
        this.cantLimos=leer.nextInt();
        
        calcularPrecio();
    }
    
    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        int valLimo=this.cantLimos*15;
        this.precioHabitaciones += valLimo;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\ncantSalonConferencia=" + cantSalonConferencia + ", cantSuites=" + cantSuites + ", cantLimos=" + cantLimos + '}';
    }
    
    
}
