/*
12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
package guia6ejercicio12;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Date;
import java.util.Scanner;


public class Guia6Ejercicio12 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        //Priemro invocamos a la clase servicio
        
        PersonaServicio ps = new PersonaServicio();
        
        //Con esto creamos una persona
        Persona p1 = ps.crearPersona();
        //Calculamos la edad de esa persona
        ps.calcularEdad(p1);
       
        //Pedimos ingresar una nueva edad de otra persona
        System.out.println("Ingrese la fecha de nacimiento de la otra persona");
        System.out.print("dia: ");
        int dia = leer.nextInt();    
        System.out.print("mes: ");
        int mes = leer.nextInt();  
        System.out.print("año: ");
        int anio = leer.nextInt();  
        Date otraFechaNacimiento = new Date(anio - 1900 , mes - 1 , dia);
        if(ps.menorQue(p1, otraFechaNacimiento)){
            System.out.println("La persona 1 es mas vieja");
        }else{
            System.out.println("La persona 2 es mas vieja");
        }
        
        //Mostraremos los datos de la persona
        
        ps.mostrarPersona(p1);
    }
    
}
