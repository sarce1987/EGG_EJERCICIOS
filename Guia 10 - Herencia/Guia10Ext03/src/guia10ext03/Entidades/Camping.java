
package guia10ext03.Entidades;


public final class Camping extends Extrahotelero{
    private int capMaxCarpas ;
    private int cantBanios;
    private boolean restaurant ;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean restaurant, boolean privado, int m2, String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        super(privado, m2, nombreAlojamiento, direccion, localidad, nombreGerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    public void crearCamping(){
        super.crearExtrahotelero();
        System.out.print("Cantidad maxima de carpas: ");
        this.capMaxCarpas = leer.nextInt();
        System.out.print("Cantidad de baños: ");
        this.cantBanios = leer.nextInt();
         String opcion;
        do {            
            System.out.println("Tiene restaurant? S/N: ");
            opcion = leer.next().toLowerCase();
            
            if (!opcion.equals("s") && !opcion.equals("n")) {
                System.out.println("Opcion incorrecta vuelva a intentar");
            }else if(opcion.equals("s")){
                this.restaurant = true;
            }else{
                this.restaurant = false;
            }
        } while (!opcion.equals("s") && !opcion.equals("n"));
    }

    @Override
    public String toString() {
        return super.toString()+ "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", restaurant=" + restaurant + '}';
    }
    
    
}
