
package guia9ejercicio03.Servicios;

import guia9ejercicio03.Entidades.Baraja;
import guia9ejercicio03.Entidades.Carta;
import guia9ejercicio03.Numerados.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class BarajaServicio {
    
    Scanner leer = new Scanner(System.in);
    public Baraja barajaInicial = crearBaraja();
    public Baraja barajaRepartida = new Baraja(); // esto esta de mas
    

    
    public Baraja crearBaraja(){
        
        ArrayList<Carta> cartas = new ArrayList();
        for (Palo aux : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(i, aux));
                }
            }  
        }  
        return new Baraja(cartas);
    }
    
    
    public void barajar(){
        
        Collections.shuffle(barajaInicial.getCartas());
    }
    
    public Carta siguienteCarta(){
        Carta c = barajaInicial.getCartas().get(0);
        System.out.println("La siguiente carta es " + c);
        return c;
    }
    
    public void darCartas(){
        
        System.out.println("Cuantas cartas quiere repartir");
        int cant = leer.nextInt();
        if (cant> barajaInicial.getCartas().size()) {
            System.out.println("No hay suficientes cartas en el mazo para repartir");
        }else{
            for (int i = 0; i < cant; i++) {
                System.out.println("Se reparte al jugador la carta "+barajaInicial.getCartas().get(0).toString());
                System.out.println(barajaRepartida.getCartas());
                barajaRepartida.getCartas().add(barajaInicial.getCartas().get(0));
                barajaInicial.getCartas().remove(0); //Remuevo las cartas del mazo original
            }
        }
     
    }
    
    public void cartasDisponibles(){
        
        System.out.println("Cantidad de cartas disponibles: " + barajaInicial.getCartas().size());
    }
    
    /*
     cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
    */
    
    public void cartasMonton(){
        if (barajaRepartida.getCartas().isEmpty()) {
            System.out.println("Todavia no se ha repartido ninguna carta");
        }else{
            System.out.println("Las cartas que han sido repartidas son: ");
            for (int i = 0; i < barajaRepartida.getCartas().size(); i++) {
                System.out.println(barajaRepartida.getCartas().get(i));
            }
        }
    }
    
    public void mostrarBaraja(){
        if (barajaInicial.getCartas().isEmpty()) {
            System.out.println("No quedan mas cartas en la baraja");
        }else{
            System.out.println("Las cartas que quedan en la baraja son: ");
            for (int i = 0; i < barajaInicial.getCartas().size(); i++) {
                System.out.println(barajaInicial.getCartas().get(i));
            }
        }
        
        
    }
    
    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Ver cant de cartas aun en el mazo");
        System.out.println("7. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                darCartas();
                menu();
                break;
            case "4":
                cartasMonton();
                menu();
                break;
            case "5":
                mostrarBaraja();
                menu();
                break;
            case "6":
                cartasDisponibles();
                menu();
                break;    
                
            case "7":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }

    }
}
