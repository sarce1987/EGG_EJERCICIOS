
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
   
    Scanner leer = new Scanner(System.in);
   
    public Cafetera crearCafetera(){
        Cafetera c = new Cafetera();
        
        System.out.println("Ingrese la capacidad maxima: ");
        c.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la cantidad actual de cafe: ");
        c.setCantidadActual(leer.nextInt());
        
        return c;
    }
    
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    
    public void llenarCafetera(Cafetera c){
        
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("La cafetera se llenó");
    }
    
    /*
    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
    */
    
    public void servirTasa(Cafetera c , int tamanoTasa){
       
        int cafeServido;
        if (c.getCantidadActual() < tamanoTasa) {
            
            cafeServido = c.getCantidadActual();
            c.setCantidadActual(0);
            System.out.println("La tasa no se llenó "+"\nEn la tasa quedo: "+cafeServido);
            
        }else{
            
            c.setCantidadActual(c.getCantidadActual()-tamanoTasa);
            System.out.println("La tasa se llenó ");
        }
        
        
        
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    
    public void vaciarCafetera(Cafetera c){
        
        c.setCantidadActual(0);
        System.out.println("La cafetera se vacio");
    }
    
    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada
    
    public void agregarCafe(Cafetera c , int agregar){

        c.setCantidadActual(c.getCantidadActual()+agregar);
        
        
    }
    
}



