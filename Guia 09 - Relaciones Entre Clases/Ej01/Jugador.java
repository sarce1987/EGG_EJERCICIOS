package Ej01;

public class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador() {
        id = 1;
        vivo = true;
    }

    public Jugador(int id, String nombre, boolean vivo) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = vivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public boolean disparar(Revolver r){
        boolean disparar = r.disparar();
        if(disparar){
            vivo = false;
        }
        return disparar;
    }

    @Override
    public String toString() {
        return "Jugador " + id +": " + nombre + "\n¿Esta vivo?: " + vivo;
    }
    
    
}
