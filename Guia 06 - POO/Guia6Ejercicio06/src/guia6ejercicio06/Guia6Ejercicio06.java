/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío x
• Constructor con la capacidad máxima y la cantidad actual x
• Métodos getters y setters. x
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package guia6ejercicio06;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;


public class Guia6Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        //Crear la cafetera
        Cafetera c1 = cs.crearCafetera();
        
        
        
        char salir ='n';
        int opcion ;
        int tamañoTasa;
        int agregar;
        
        do{
            
            System.out.println(
            "MENU" + "\n"
            + "1) Llenar cafetera" +"\n"
            + "2) Servir taza" + "\n"
            + "3) Vaciar cafetera" + "\n"
            + "4) Agregar cafe" + "\n"
            + "5) Mostrar cafetera" + "\n"        
            + "6) Salir S/N");
            
            System.out.println("Seleccione una opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cs.llenarCafetera(c1);
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la tasa: ");
                    tamañoTasa = leer.nextInt();
                    cs.servirTasa(c1, tamañoTasa);
                    break;
                case 3:
                    cs.vaciarCafetera(c1);
                    break;
                case 4:
                    System.out.println("Cuanto desea agregar a la cafetera: ");
                    agregar = leer.nextInt();
                    cs.agregarCafe(c1, agregar);
                    break;
                case 5:
                    System.out.println(c1.toString());
                    break;
                case 6:
                    System.out.println("Desea salir? S/N");
                    salir = leer.next().toLowerCase().charAt(0);
                    break;
            }

        }while(Character.compare(salir, 'n')==0);
           
        
        
        
    }
    
}
