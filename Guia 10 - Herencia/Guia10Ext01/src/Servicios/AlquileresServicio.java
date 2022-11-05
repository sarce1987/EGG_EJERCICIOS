
package Servicios;

import Entidades.Alquiler;
import Entidades.Cliente;
import Entidades.Barco;
import Entidades.BarcoMotorizado;
import Entidades.Velero;
import Entidades.Yate;
import Enumerados.PosicionAmarre;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;




public class AlquileresServicio {
    
    private Scanner leer;
    private ArrayList< Alquiler > alquileres;

    public AlquileresServicio() {
        this.leer = new Scanner(System.in);
        this.alquileres = new ArrayList();
    }
   
    public Alquiler crearAlquiler(){
        Alquiler a = new Alquiler();
        System.out.println("--- REGISTRO DE DATOS DE ALQUILER ---");
        Cliente cliente = crearCliente();
        System.out.println("Fecha de alquiler AAAA-MM-DD: ");
        LocalDate fechaAlquiler = LocalDate.parse(leer.next());
        System.out.println("Fecha de devolucion AAAA-MM-DD: ");
        LocalDate fechaDevolucion = LocalDate.parse(leer.next());
        PosicionAmarre posicionAmarre = posicionAmarre();
        return new Alquiler(cliente, fechaAlquiler, fechaDevolucion, posicionAmarre);
        
        
    }
    
    public Cliente crearCliente(){
        System.out.println("-- DATOS DEL CLIENTE --");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("DNI: ");
        String dni = leer.next();
        Barco barco = crearBarco();
        return new Cliente(nombre, dni, barco);
        
    }
    
    public Barco crearBarco(){
        System.out.println("-- DATOS DEL BARCO --");
        System.out.println("Matricula del barco: ");
        String matricula = leer.next();
        System.out.println("Slora: ");
        int slora = leer.nextInt();
        System.out.println("Año de fabricacion: ");
        short anioFabricacion = leer.nextShort();
        
        System.out.println("Seleccione tipo de barco: ");
        System.out.println("1) Velero");
        System.out.println("2) Barco con motor");
        System.out.println("3) Yate");
        int tipoBarco = leer.nextInt();
        
        switch(tipoBarco){
            case 1:
                System.out.println("- VELERO -");
                System.out.println("Numero de mastiles: ");
                int numMastiles = leer.nextInt();
                return new Velero(numMastiles, matricula, slora, anioFabricacion);
              
            case 2:
                System.out.println("- BARCO MOTORIZADO -");
                System.out.println("Potencia del motor: ");
                int potenciaM = leer.nextInt();
                return new BarcoMotorizado(potenciaM, matricula, slora, anioFabricacion);
                
            case 3:
                System.out.println("- YATE -");
                System.out.println("Potencia: ");
                int potenciaY = leer.nextInt();
                System.out.println("Numero de mastiles: ");
                int numMastilesY = leer.nextInt();
                return new Yate(potenciaY, numMastilesY, matricula, slora, anioFabricacion);
                
            default:
                System.out.println("No se agrego ningun barco");
                return null;
        }         
    }
    
   public PosicionAmarre posicionAmarre(){
       System.out.println("- SELECCIONAR POSICION DE AMARRE -");
       System.out.println("1)" + PosicionAmarre.DELANTERA);
       System.out.println("2)" + PosicionAmarre.MEDIO);
       System.out.println("3)" + PosicionAmarre.TRASERA);
       int opcion = leer.nextInt();
       
       switch(opcion){
           case 1:
               return PosicionAmarre.DELANTERA;         
           case 2:                      
               return PosicionAmarre.MEDIO;          
           case 3:
               return PosicionAmarre.TRASERA;        
           default:
               return null;
       }
   }
    
}
