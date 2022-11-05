
package guia9ejercicio03.Entidades;

import guia9ejercicio03.Numerados.Palo;


public class Carta {
    
    private int numCarta;
    private Palo palo;

    public Carta() {
    }

    public Carta(int numCarta, Palo palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  numCarta + " de " + palo.getNombre() + "\n";
    }
    
    
}
