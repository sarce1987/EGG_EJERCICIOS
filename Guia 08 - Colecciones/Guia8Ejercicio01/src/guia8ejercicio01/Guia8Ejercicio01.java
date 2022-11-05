
package guia8ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList
*/
public class Guia8Ejercicio01 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        int i =0; //Contador
        String opc1 ;
        do {            
            
            System.out.println("Ingrese la raza del perro "+ (i+1));
            razas.add(leer.next());
            i++;
           
            do{
            System.out.println("Desea guardar otro perro? S/N :");
            opc1 = leer.next().toLowerCase();
                if (!opc1.equals("s") && !opc1.equals("n")) {
                    System.out.println("Error! Ingreso mal el caracter, vuelva a ingresarlo \n");
                }
            }while(!opc1.equals("s") && !opc1.equals("n"));
            
        } while (opc1.equals("s"));
        
      ///////// MOSTRAR PERROS /////////
     mostraRaza(razas);
        
        /*
            2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
            pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
            Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
            la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
            se mostrará la lista ordenada
        */
        
        System.out.println("Ingrese la raza del perro que desea buscar en la lista: ");
        String razaBuscar = leer.next();
        eliminaRaza(razas, razaBuscar);
        
        
        
       
        
    }
    
    public static void mostraRaza(ArrayList<String> razas){
         System.out.println("------ RAZAS DE PERROS ------");
        for (String aux : razas) {
            System.out.println("- " + aux);
        }
        System.out.println("");
        
    }
    
    public static void eliminaRaza(ArrayList<String> razas , String razaBuscar){
        Iterator<String> it = razas.iterator();
         boolean encontro=false;
         while(it.hasNext()){
            String aux = it.next();
            if (aux.equals(razaBuscar)) {
                it.remove();
                encontro = true;
            }
                
         }
         
         if (encontro) {
             System.out.println("Se encontro el elemento a eliminar");
             mostraRaza(razas);
        }else{
             System.out.println("No se encontro ningun elemento a eliminar");
             mostraRaza(razas);
             
         }
       
    }
}
