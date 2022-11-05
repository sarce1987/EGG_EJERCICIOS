/*
 5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package guia6ext05;

import java.util.Scanner;


public class Guia6Ext05 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MesSecreto ms = new MesSecreto();
        String mes;
        int salida = 0 ;
        do{
            System.out.println("Adivine el mes secrerto");
            mes = leer.next().toLowerCase();
           
            if (mes.equals(ms.getMesSecreto())  ) {
                System.out.println("Buenisimo!! Usted ha acertado :)");
                salida = 1;
            }else{
                System.out.println("Usted no ha acertado. Vuelva a intentar");
            }
            
        }while(salida != 1);
        
    }
    
}
