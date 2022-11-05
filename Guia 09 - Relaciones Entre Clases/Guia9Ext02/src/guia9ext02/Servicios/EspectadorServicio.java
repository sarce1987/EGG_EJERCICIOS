
package guia9ext02.Servicios;

import guia9ext02.Entidades.Espectador;
import java.util.ArrayList;
import java.util.Scanner;


public class EspectadorServicio {
    
    public Scanner leer; //Variable global para leer datos por teclado
    
    public EspectadorServicio(){
        
        leer = new Scanner(System.in);
    }
    
    public ArrayList<Espectador> espectadoresAleatorios(int cant){
        
        ArrayList<Espectador> espectadores = new ArrayList();
        String nombre;
        int edad;
        double dineroDisponible;
        
        String[] nombres = { "Sebastian" ,"Jorge" , "David" , "Jessica" , "Andrea" ,"Alejandra" , "Carolina" , "Juan" , "Diego"
                            , "Andres" , "Romina"};
        
        String[] apellidos = { "Arce" , "Lopez" , "Garcia" , "Basabe" , "Benegas" , "Nieto" , "Perez" , "Castro" , "Castillo" , "Gomez"};
        
        for (int i = 0; i < cant; i++) {
            nombre = nombres[(int) (Math.floor(Math.random()*((nombres.length-1)-0+1)+0))] + " " +
                    apellidos[(int) (Math.floor(Math.random()*((apellidos.length-1)-0+1)+0))];
            
            edad = (int) (Math.random()*(70 - 6 + 1) + 6);
            
            dineroDisponible = (double) (Math.random()*1000 + 1);
            
            espectadores.add(new Espectador(nombre, edad, dineroDisponible));
        }
        return espectadores;
        }
        
    
        public void mostrarEspectadores(ArrayList<Espectador> espectadores){
            
            for (Espectador aux : espectadores) {
                
                System.out.println(aux);
            }
            
        }
    
    }
    

