package Ej01;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    public Revolver r;

    public Juego() {
        jugadores = new ArrayList<>();
        r = new Revolver();
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public boolean finJuego() {
        return jugadores.stream().anyMatch((jg) -> (!jg.isVivo()));
    }

    public void ronda(List<Jugador> jugadores) {
        System.out.println("---COMIENZA EL JUEGO---");
        for (Jugador j : jugadores) {
            if (j.disparar(r)) {
                System.out.println(j.getNombre() + " ha muerto.");
                break;
            } else {
                System.out.println(j.getNombre() + " ha sobrevivido.");
                r.siguienteBala();
            }
        }

    }
}
