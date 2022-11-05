/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicios;

import Entidades.RevolverDeAgua;
import java.util.Scanner;

public class RevolverDeAguaServicio {
    
     Scanner leer = new Scanner(System.in);
    
    
    public RevolverDeAgua llenarRevolver(){
        
       RevolverDeAgua revAgua = new RevolverDeAgua();
       
       int aleatPosActual = (int) (Math.random()*6+1);
       int aleatMunicion = (int) (Math.random()*6+1);
       revAgua.setPosicionActual(aleatPosActual);
       revAgua.setPosicionAgua(aleatMunicion);
       
       return revAgua;
    }

    public boolean mojar(RevolverDeAgua revAgua){
        
        if (revAgua.getPosicionActual() == revAgua.getPosicionAgua()) {
            return true;
        }else{
            return false;
        }
    }
    /*
    Vendria a ser como el gatilleo
    */
    public void siguienteChorro(RevolverDeAgua revAgua){
       
        if (revAgua.getPosicionActual()+1 > 6) {
            revAgua.setPosicionActual(1);
        }else{
        revAgua.setPosicionActual(revAgua.getPosicionActual()+1);
        }
    }
}
