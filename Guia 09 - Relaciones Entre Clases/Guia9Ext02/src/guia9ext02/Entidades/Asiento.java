
package guia9ext02.Entidades;


public class Asiento {
    private int fila;
    private String columna;
    private boolean ocupado;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(int fila, String columna, Espectador espectador) {
        this.fila = fila;
        this.columna = columna;
        this.espectador = espectador;
        setOcupado();
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado() {
        if (espectador != null) {
            ocupado = true;
        }else{
            ocupado = false;
        }
        
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    
    
    
    
    
}
