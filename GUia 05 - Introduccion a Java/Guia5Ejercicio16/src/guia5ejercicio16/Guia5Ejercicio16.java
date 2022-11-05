/*
16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.  
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.  
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals(). 
 */
package guia5ejercicio16;

import java.util.Scanner;


public class Guia5Ejercicio16 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        boolean no_salir = true;
        int suma_correctas =0, suma_incorrectas =0 , longitud;
        
        do{
        System.out.println("Ingrese una cadena:");
        cadena = leer.nextLine();
        
        longitud = cadena.length();
        
        //Condicion de salida del programa
        if(cadena.equals("&&&&&")){
            no_salir=false;    
        }
        
        if( cadena.substring(0 , 1).equals("X") && cadena.substring(4 , 5).equals("O") && cadena.length() == 5 ){
            
            System.out.println("CORRECTO");
            
            suma_correctas = suma_correctas+1;
            
        }else{
            
            System.out.println("INCORRECTA");
            suma_incorrectas = suma_incorrectas + 1;
               
        }
        
  
        
        }while(no_salir);
        
        System.out.println("CORRECTAS = " + suma_correctas);
        System.out.println("INCORRECTAS =" +suma_incorrectas);
        
        
      
        
        
    }
   
    
}
