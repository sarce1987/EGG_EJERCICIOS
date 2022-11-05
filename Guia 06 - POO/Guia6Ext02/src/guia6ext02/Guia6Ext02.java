/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package guia6ext02;

import java.util.Scanner;

public class Guia6Ext02 {

    public static void main(String[] args) {

        Puntos p1 = crearPuntos();
        
        System.out.println(p1.toString());
        
        distanciaPuntos(p1);
    }

    
    public static Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in);
        int x1, y1, x2, y2;

        System.out.println("Ingrese las coordenadas del punto P1");
        System.out.print("Ingrese X1: ");
        x1 = leer.nextInt();
        System.out.print("Ingrese Y1: ");
        y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas del punto P2");
        System.out.print("Ingrese X2: ");
        x2 = leer.nextInt();
        System.out.print("Ingrese Y2: ");
        y2 = leer.nextInt();
        
        Puntos p = new Puntos(x1, y1, x2, y2);
        return p;
    }
    
    public static void distanciaPuntos(Puntos p){
        
        double dist = Math.sqrt(Math.pow((p.getX2()-p.getX1()), 2)+Math.pow((p.getY2()-p.getY1()), 2));
        System.out.println("La distancia entre los dos puntos es de: "+dist);
        
    }
}
