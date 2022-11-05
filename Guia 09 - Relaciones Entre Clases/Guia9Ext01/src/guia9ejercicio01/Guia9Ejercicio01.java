/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package guia9ejercicio01;

import guia9ejercicio01.Entidades.Perro;
import guia9ejercicio01.Entidades.Persona;
import guia9ejercicio01.Servicios.Servicio;
import java.util.ArrayList;
import java.util.Scanner;




public class Guia9Ejercicio01 {

    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
       ArrayList<Perro> perros = new ArrayList();
       ArrayList<Persona> personas = new ArrayList();
       Servicio serv = new Servicio();
       perros.add(serv.crearPerro());
       perros.add(serv.crearPerro());
       personas.add(serv.crearPersona());
       personas.add(serv.crearPersona());
       
       serv.mostrarPersona(personas);
       
       serv.procesoAdoptar(personas, perros);
       serv.mostrarPersona(personas);
    } 
    
    

    
    
    
   
}

