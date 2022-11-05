
package guia10ext02.Entidades;




public final class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantPersonasOficinas;
    private int numPisos;
    public EdificioDeOficinas() {
        super();
        System.out.print("Cantidad de pisos del Edificio de oficinas:");
        this.numPisos = leer.nextInt();
        System.out.print("Numero de oficinas: ");
        this.numOficinas = leer.nextInt();
        System.out.print("Cantidad de personas por oficina: ");
        this.cantPersonasOficinas = leer.nextInt();
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonasOficinas, int numPisos, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.numOficinas = numOficinas;
        this.cantPersonasOficinas = cantPersonasOficinas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasOficinas() {
        return cantPersonasOficinas;
    }

    public void setCantPersonasOficinas(int cantPersonasOficinas) {
        this.cantPersonasOficinas = cantPersonasOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    
    public void cantPersonas(){
        System.out.println("Hay solo una oficina por piso. Por lo tanto");
        System.out.println("Personas por piso: " +(cantPersonasOficinas*numOficinas)); 
        
    }
    
   @Override
    public void calcularSuperficie() {
        System.out.println("La superficie " +(ancho * largo) + "m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen " + (ancho * largo * alto) +"m3");
    }
    
    
   
    
    
}
