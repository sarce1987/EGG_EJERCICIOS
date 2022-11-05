/*

 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicio {
    
    //De esta manera generamos estas variables globales
    private Scanner leer;
    
    
    public AlumnoServicio(){
        //Aca con este constructor las inicializamos
        leer = new Scanner(System.in);
        
    }
    
    /**
     * 
     * @return un alumno con su nombre y sus 3 notas en la lista
     */
    public Alumno crearAlumno(){
        ArrayList<Integer> notas = new ArrayList();  
        System.out.println("Ingrese el nombre del Alumno");
        String nombre = leer.next();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota "+(i+1)+" :");
            notas.add(leer.nextInt());
        }
        
       return new Alumno(nombre, notas);    
    }
    
    public void notaFinal(ArrayList<Alumno> listAlum){
        
        System.out.println("-------CALCULO DEL PROMEDIO DE NOTAS-------");
        System.out.println("Ingrese el nombre del alumno que desea encontrar:");
        String alumBusq = leer.next();
        Integer sumaNotas=0;
        double promedio;
        boolean encontro = false;
        for (Alumno aux : listAlum) {
            if (aux.getNombre().equals(alumBusq) ) {
                for (Integer aux2: aux.getNotas()) {
                    sumaNotas += aux2;
                }
                encontro = true;
            }
        }
        
        if (encontro) {
            promedio = sumaNotas/3;
            System.out.println("El promedio de la nota es: " + promedio);
        }else{
        System.out.println("No se encontró ningun nombre");
        }
        
    }
    
}
