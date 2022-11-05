/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main
 */
package guia8ejercicio03;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;


public class Guia8Ejercicio03 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       AlumnoServicio almServ = new AlumnoServicio();
       ArrayList<Alumno> listaAlumnos = new ArrayList();
       
       
        String opcion = "s";
        do {   
            listaAlumnos.add(almServ.crearAlumno());
           do{ 
            System.out.println("Desea continuar agregando alumnos? S/N: ");
            opcion = leer.next().toLowerCase();
               if (!opcion.equals("n") && !opcion.equals("s")) {
                   System.out.println("Error! no ha seleccionado una opcion valida");
               }
           }while(!opcion.equals("n") && !opcion.equals("s"));
           
        } while (opcion.equals("s"));
        
        System.out.println(listaAlumnos.toString());
        
        almServ.notaFinal(listaAlumnos);
        
    }
    
}
