/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio01.Servicios;

import guia9ejercicio01.Entidades.Perro;
import guia9ejercicio01.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author seba_
 */
public class Servicio {
    
     Scanner leer = new Scanner(System.in);
    
     /*
    -------- METODO PARA CREAR UN PERRO -------
    */
    
    public Perro crearPerro(){
        System.out.println("---- AGREGAR PERRO ----");
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingresara la raza del perro");
        String raza = leer.next();
        System.out.println("Ingrese la edad del perro");
        int edad = leer.nextInt();
        System.out.println("Ingresa el tamaño");
        String tamano = leer.next();
        
        return new Perro(nombre, raza, edad, tamano);
    }
     /*
    -------- METODO PARA CREAR UNA PERSONA -------
    */
    public Persona crearPersona(){
        System.out.println("---- AGREGAR PERSONA ----");
        Persona p = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona: ");
        p.setApellido(leer.next());
        System.out.println("Ingrese el documento de la persona: ");
        p.setDocumento(leer.nextInt());
        System.out.println("Ingrese la edad de la persona: ");
        p.setEdad(leer.nextInt());
      
        
        return p;
    }
    
    public Perro seleccionarPerroAdoptar(ArrayList<Perro> perros){
        System.out.println("Los perros para adoptar son: ");
        for (Perro aux : perros) {
            System.out.println(aux);
        }
        System.out.println("Seleccione el perro que desea adoptar");
        String nombrePerro = leer.next();
        for (Perro aux : perros) {
            if (aux.getNombre().equals(nombrePerro)) {
                return aux;
            }
        }
        return null;
    }
    
  public void procesoAdoptar(ArrayList<Persona> personas , ArrayList<Perro> perros ){
      System.out.println("-------- PROCESO DE ADOPCION ---------");
      System.out.println("Coloque el nombre de la persona: ");
      String nombrePersona = leer.next();
      
      for (Persona aux : personas) {
          if (nombrePersona.equals(aux.getNombre())) {
              aux.setPerro(seleccionarPerroAdoptar(perros));
          }
      }
      
  }
  
  public void mostrarPersona(ArrayList<Persona> personas){
      
      for (Persona aux : personas) {
          System.out.println(aux);
      }
      
  }
  
}
