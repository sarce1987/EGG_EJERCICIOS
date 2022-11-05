/*
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agu0a y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;


public class JugadorServicio {
    
    /*
    El jugador gatilla entonces la posicion actual avanza en una posicion 
    si la vala se encuentra en la posicion actual entonces moja al jugador
    sino el disparo es falso y la bala no sale.
    */
    public boolean diaparo(RevolverDeAgua revAgua , Jugador jug){
        RevolverDeAguaServicio revAguaServ = new RevolverDeAguaServicio();
        
        revAguaServ.siguienteChorro(revAgua);
        if (revAguaServ.mojar(revAgua)) {
            jug.setMojado(true);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Jugador> crearListaJugadores(int cantJugadores){
        
        ArrayList<Jugador> listaJugadores = new ArrayList();
        
        if (cantJugadores>6) {
            for (int i = 1; i <= 6; i++) {
                listaJugadores.add(new Jugador(i, "Jugador "+i, false));
            }
        }else{
            for (int i = 1; i <= cantJugadores; i++) {
                listaJugadores.add(new Jugador(i, "Jugador "+i, false));
            }
            
        }
        return listaJugadores;
    }
}
