
package guia10ext03.Servicios;

import guia10ext03.Entidades.Alojamiento;
import guia10ext03.Entidades.Camping;
import guia10ext03.Entidades.Hotel;
import guia10ext03.Entidades.Hotel4;
import guia10ext03.Entidades.Hotel5;
import guia10ext03.Entidades.Residencia;
import guia10ext03.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AlojamientoServicio {
    
    Scanner leer;
    ArrayList<Alojamiento> alojamientos;
    
    public AlojamientoServicio(){
        
        leer = new Scanner(System.in);
        alojamientos = new ArrayList();
    }
    
    
    public Alojamiento crearHotel5(){
       Hotel5 h5 = new Hotel5();
       h5.crearHotel5();
       return h5;
        
    }
    
    public Alojamiento crearHotel4(){
       Hotel4 h4 = new Hotel4();
       h4.crearHotel4();
       return h4;       
    }
    
    
    public Alojamiento crearCamping(){
        Camping c = new Camping();
        c.crearCamping();
        return c;
    }
    
    public Alojamiento crearResidencia(){
        Residencia r = new Residencia();
        r.crearResidencia();
        return r;
    }
    
    public void mostrarAlojamientos(){
        
        for (Alojamiento aux : alojamientos) {
            System.out.println(aux);
        }
    }
    
    
    public void mostrarAlojamientosSegunPrecio(){
       ArrayList<Hotel> hoteles = new ArrayList();
       
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel) {
                hoteles.add((Hotel) aux);
                
            }
        }
        
        Collections.sort(hoteles, Comparadores.ordenarPorPrecioDesc);
        for (Hotel aux : hoteles) {
            System.out.println(aux);
        }
        
    }
    
    public void mostrarCampingConRestaurant(){
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isRestaurant()) {
                    System.out.println(aux);
                }
            }
        } 
    }
    
    public void residenciasConDesc(){
        for (Alojamiento aux : alojamientos) {
            
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescGremio()) {
                    System.out.println(aux);
                }
                
            }
            
        }
        
    }
   
    
    /*
    ----------------- MENU -------------------
    */
    public void menu(){
        System.out.println("\nMENU");
        System.out.println("1) Crear Alojamiento");
        System.out.println("2) Mostrar todos los alojamientos");
        System.out.println("3) Mostrar hoteles de mas caros a mas baratos");
        System.out.println("4) Mostrar todos los camping con restaurante");
        System.out.println("5) Mostrar todas las residencias que tienen descuento");
        System.out.println("6) Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion=leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("\nCREAR ALOJAMIENTO");
                System.out.println("Que tipo de alojamiento desea agregar: ");
                System.out.println("1) Hotel");
                System.out.println("2) Extrahotelereo");
                int opcion2 = leer.nextInt();
                switch(opcion2){
                    case 1: hotelMenu();
                            break;
                    case 2: extraHoteleroMenu();
                            break;
                }
                menu();
                break;
                
            case 2:
                mostrarAlojamientos();
                menu();
                break;
                         
            case 3: 
                mostrarAlojamientosSegunPrecio();
                menu();
                break;
                
            case 4:
                mostrarCampingConRestaurant();
                menu();
                break;
                
            case 5:
                residenciasConDesc();
                menu();
                break;
                
            case 6:
                System.out.println("FIN DEL PROGRAMA");
                break;
            default:
                System.out.println("Opcion incorrecta");
                menu();
        }  
    }
    
   
    public void hotelMenu(){
        System.out.println("\nHOTEL");
        System.out.println("1) Hotel 4 Estrellas");
        System.out.println("2) Hotel 5 Estrellas");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: 
                System.out.println("\nHOTEL 4 ESTRELLAS");
                alojamientos.add(crearHotel4());
                break;
            case 2: 
                System.out.println("\nHOTEL 5 ESTRELLAS");
                alojamientos.add(crearHotel5());
                break;
                
            default:
                System.out.println("Opcion incorrecta");
                hotelMenu();
        }   
    }
    
    public void extraHoteleroMenu(){
        System.out.println("\nEXTRA HOTELERO");
        System.out.println("1) Camping");
        System.out.println("2) Residencia");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: 
                System.out.println("\nCAMPING");
                alojamientos.add(crearCamping());
                break;
            case 2: 
                System.out.println("\nRESIDENCIA");
                alojamientos.add(crearResidencia());
                break;
                
            default:
                System.out.println("Opcion incorrecta");
                hotelMenu();
        }
    }

  
    
}
