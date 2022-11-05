package Ej01;

import Entidades.Juego;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        Revolver r = new Revolver();
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("---BIENVENIDO AL JUEGO DE LA RULETA RUSA---");
        System.out.print("Por favor digite el número de jugadores: ");
        int numJugadores = sc.nextInt();
        do {
            if (numJugadores < 0 || numJugadores > 6) {
                System.out.println("Por favor, ingrese una cantidad entre 1 y 6 jugadores.");
                numJugadores = sc.nextInt();
            }
        } while (numJugadores < 0 || numJugadores > 6);
        for (int i = 0; i < numJugadores; i++) {
            Jugador j = new Jugador();
            String nombre;
            System.out.println("Ingrese el nombre del " + (i + 1) + "º jugador: ");
            nombre = sc.next();
            j.setNombre(nombre);
            j.setId(i + 1);
            juego.getJugadores().add(j);
        }
        System.out.println("Lista actual de jugadores: ");
        juego.getJugadores().forEach((player) -> {
            System.out.println(player);
            System.out.println("-------------------------");
        });
        
        while(!juego.finJuego()){
            juego.ronda(juego.getJugadores());
        }
        
//     
//
//        for (int i = 0; i < juego.getJugadores().size(); i++) {
//            juego.getJugadores().get(i).disparar(r);
//        }
////        juego.ronda(juego.getJugadores());
//        System.out.println("Lista actual de jugadores: ");
//        juego.getJugadores().forEach((player) -> {
//            if(player.isVivo()){
//                System.out.println(player.getNombre() + " ha sobrevivido!.");
//            }else{
//                System.out.println(player.getNombre() + " ha muerto.");
//            }
//            System.out.println("-------------------------");
//        });

//        juego.ronda(juego.getJugadores());
//        juego.ronda(juego.getJugadores());
    }

}
