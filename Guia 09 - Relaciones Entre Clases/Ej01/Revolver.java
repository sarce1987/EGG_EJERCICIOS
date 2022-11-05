package Ej01;

public class Revolver {

    private int posActual;
    private int posBala;

    public Revolver() {
        posActual = (int) (Math.random() * 6 + 1);
        posBala = (int) (Math.random() * 6 + 1);
    }

    public Revolver(int posActual, int posBala) {
        this.posActual = posActual;
        this.posBala = posBala;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosBala() {
        return posBala;
    }

    public void setPosBala(int posBala) {
        this.posBala = posBala;
    }

    public boolean disparar() {
        return posActual == posBala;
    }

    public void siguienteBala() {
        posActual = (int) (Math.random() * 6 + 1);
    }

    @Override
    public String toString() {
        return "Posción actual: " + posActual + "\nPosición bala: " + posBala;
    }

}
