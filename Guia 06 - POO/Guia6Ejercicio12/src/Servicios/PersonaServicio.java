
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {
   Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
       Persona p = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("dia: ");
        int dia = leer.nextInt();    
        System.out.print("mes: ");
        int mes = leer.nextInt();  
        System.out.print("año: ");
        int anio = leer.nextInt();  
        Date fechaNacimiento = new Date(anio-1900 , mes - 1 , dia );
        p.setFechaNacimiento(fechaNacimiento);
        return p;
    }
    
    public void calcularEdad(Persona p){
        Date fechaActual = new Date();
        int edad =fechaActual.getYear() - p.getFechaNacimiento().getYear();
        System.out.println("La persona tiene "+ edad + " años");
    }
    
    /*
     Agregar a la clase el método menorQue(int edad) que recibe como parámetro
    otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.
    */
    
    public boolean menorQue(Persona p , Date otraFechaNacimiento){
      if( p.getFechaNacimiento().before(otraFechaNacimiento)){
          return true;//Retorna verdadero si la fecha 1 está antes de la fecha 2;
      }else{
          return false;
      }
    }
    /*• Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior
    */
    
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
        
    }
}


