/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual 
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la 
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán 
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
 */
package guia9ejercicio02_nuevo.Entidades;


public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

   public void llenarRevolver(){
        this.posicionActual = (int) (Math.random() * 6 + 1);
        this.posicionAgua=(int) (Math.random() * 6 + 1);
   }
    
    public boolean mojar(){
        
        if (posicionActual == posicionAgua) {
            return true;
        }else{
            return false;
        }
    }
    
    public void siguienteChorro(){
       
        if (posicionActual+1 >6) {
            posicionActual=1;
        }else{
            posicionActual= posicionActual+1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
