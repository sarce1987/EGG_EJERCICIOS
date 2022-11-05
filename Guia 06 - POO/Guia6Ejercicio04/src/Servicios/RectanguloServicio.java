
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;


public class RectanguloServicio {
    Scanner leer = new Scanner(System.in);
    
    //Metodo que crea el rectangulo
    public Rectangulo crearRectangulo(){
        
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la altura del rectangulo: ");
        r.setAltura(leer.nextInt());
        System.out.println("Ingrese la base del rectangulo: ");
        r.setBase(leer.nextInt());
        
        return r;
    }
    
    //Calcula el perimetro de un objeto rectangulo
    public void perimetro(Rectangulo r){
        
        int per = r.getAltura()*2 + r.getBase()*2;
        System.out.println("El perimetro del rectangulo es: "+per);
    }
    
    //Calcula la superficie de un objeto rectangulo
    public void superficie(Rectangulo r){
        int sup = r.getAltura()*r.getBase();
        System.out.println("La superficie del rectangulo es: "+sup);
    }
    
    //Va a dibujar un rectangulo con asteriscos
    public void dibujar(Rectangulo r){
        for (int i = 1; i <= r.getAltura(); i++) {
            for (int j = 1; j <= r.getBase(); j++) {
                if (i==1 || i==r.getAltura()) {
                    System.out.print("*");
                }else if(j==1||j==r.getBase()){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
}
