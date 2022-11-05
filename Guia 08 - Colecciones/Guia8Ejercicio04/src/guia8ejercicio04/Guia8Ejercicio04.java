
package guia8ejercicio04;

import guia8ejercicio04.Servicios.PeliculaServicio;
import guia8ejercicio04.Utilidades.Comparadores;
import java.util.Collections;
import java.util.Scanner;


public class Guia8Ejercicio04 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        PeliculaServicio pelServ = new PeliculaServicio();
        int setear=0;
        
        String opcion = "s";
        
        
        
        
       
       do{ 
        System.out.println("---- INGRESE UNA OPCION ---- "
                + "\n 1)Ingrese una pelicula"
                + "\n 2)Mostrar en pantalla todas las peliculas"
                + "\n 3)Mostrar en pantalla peliculas con una duracion mayor a 1 hora"
                + "\n 4)Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla"
                + "\n 5)Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla"
                + "\n 6)Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla."
                + "\n 7)Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla."
                + "\n 8)Salir");
           System.out.println("\nIngrese una opcion");
        setear = leer.nextInt();
        
        switch (setear) {
              case 1:
                do {
                    /*
                En la linea 21 lo que se hace es llamar al servicio y al metodo crearPelicula. Este metodo devuelve una pelicula
                entonces lo pasamos como argumento al metodo crarLista que crea una lista de peliculas
                     */
                    pelServ.crearLista(pelServ.crearPelicula());

                    //Esta parte filtra para que la opcion elegida sea correcta
                    do {
                        System.out.println("Desea agregar otra pelicula? S/N");
                        opcion = leer.next().toLowerCase();
                        if (!opcion.equals("n") && !opcion.equals("s")) {
                            System.out.println("Error!. Se ha ingresado mal el caracter. Vuelva a intentarlo");
                        }
                    } while (!opcion.equals("n") && !opcion.equals("s"));

                } while (opcion.equals("s"));
                break;
              case 2:
                  pelServ.mostrarPeliculas();
                  break;
              case 3:
                   pelServ.mostrarPeliculasMayorHora();
                  break;
              case 4:
                  Collections.sort(pelServ.listPeli, Comparadores.ordenarPorDuracionDesc);
                  pelServ.mostrarPeliculas();
                  break;
                  
              case 5:
                  Collections.sort(pelServ.listPeli, Comparadores.ordenarPorDuracionAsc);
                  pelServ.mostrarPeliculas();
                  break;
              case 6:
                  Collections.sort(pelServ.listPeli, Comparadores.ordenarPorTituloAsc);
                  pelServ.mostrarPeliculas();
                  break;
              case 7:
                  Collections.sort(pelServ.listPeli, Comparadores.ordenarPorDirectorAsc);
                  pelServ.mostrarPeliculas();
                  break;
             
            default:
                break;
        }
       
       }while(setear!=8);
    }
    
}
