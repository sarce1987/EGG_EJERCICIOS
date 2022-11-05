
package Entidades;


public class Ahorcado {
    

    //Atributos
    private char palabraBuscada[] ;
    private int letrasEncontradas;
    private int jugadasMaximas;
    
    
    //Constructores

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscada, int letrasEncontradas, int jugadasMaximas) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(char[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraBuscada=" + palabraBuscada + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }
    
    
    
}
