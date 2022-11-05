
package guia10ext03.Entidades;


public final class Residencia extends Extrahotelero{
    private int cantHabitaciones ;
    private boolean descGremio;
    private boolean campDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descGremio, boolean campDeportivo, boolean privado, int m2, String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        super(privado, m2, nombreAlojamiento, direccion, localidad, nombreGerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremio = descGremio;
        this.campDeportivo = campDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampDeportivo() {
        return campDeportivo;
    }

    public void setCampDeportivo(boolean campDeportivo) {
        this.campDeportivo = campDeportivo;
    }
    
    public void crearResidencia(){
        super.crearExtrahotelero();
        System.out.print("Cantidad de habitaciones: ");
        this.cantHabitaciones = leer.nextInt();
        
        String opcion;
        do {            
            System.out.println("Tiene descuento para gremios? S/N: ");
            opcion = leer.next().toLowerCase();
            
            if (!opcion.equals("s") && !opcion.equals("n")) {
                System.out.println("Opcion incorrecta vuelva a intentar");
            }else if(opcion.equals("s")){
                this.descGremio = true;
            }else{
                this.descGremio = false;
            }
        } while (!opcion.equals("s") && !opcion.equals("n"));
        
        String opcion2;
        do {            
            System.out.println("Tiene campo deportivo? S/N: ");
            opcion2 = leer.next().toLowerCase();
            
            if (!opcion2.equals("s") && !opcion2.equals("n")) {
                System.out.println("Opcion incorrecta vuelva a intentar");
            }else if(opcion2.equals("s")){
                this.campDeportivo = true;
            }else{
                this.campDeportivo = false;
            }
        } while (!opcion2.equals("s") && !opcion2.equals("n"));
    }

    @Override
    public String toString() {
        return super.toString() + "cantHabitaciones=" + cantHabitaciones + ", descGremio=" + descGremio + ", campDeportivo=" + campDeportivo + '}';
    }
    
    
}
