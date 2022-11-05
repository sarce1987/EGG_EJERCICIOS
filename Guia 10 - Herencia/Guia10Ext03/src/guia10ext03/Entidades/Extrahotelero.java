
package guia10ext03.Entidades;


public abstract class Extrahotelero extends Alojamiento{
    protected boolean privado;
    protected int m2;

    public Extrahotelero() {
    }

    public Extrahotelero(boolean privado, int m2, String nombreAlojamiento, String direccion, String localidad, String nombreGerente) {
        super(nombreAlojamiento, direccion, localidad, nombreGerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
    
    public void crearExtrahotelero(){
        super.crearAlojamiento();
        String opcion;
        do {            
            System.out.print("Es privado? S/N: ");
            opcion = leer.next().toLowerCase();
            if (!opcion.equals("s") && !opcion.equals("n")) {
                System.out.println("Opcion incorrecta vuelva a intentar");
            }else if(opcion.equals("s")){
                this.privado = true;
            }else{
                this.privado = false;
            }
        } while (!opcion.equals("s") && !opcion.equals("n"));
        
        System.out.print("Cuantos metros cuadrados tiene: ");
        this.m2 = leer.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ "\nprivado=" + privado + ", m2=" + m2 ;
    }
    
    
}
