package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {

    Scanner leer = new Scanner(System.in);

    public Raices agregarValores() {
        System.out.println("Ingrese el valor 'a': ");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor 'b': ");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor 'c': ");
        int c = leer.nextInt();
        Raices r = new Raices(a, b, c);
        return r;
    }

    /*
    • Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
     */
    public double getDiscriminante(Raices r) {
        double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        return discriminante;
    }

    /*
    • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices r) {
        if (getDiscriminante(r) >= 0) {
            System.out.println("El discriminate es " + getDiscriminante(r));
            System.out.println("El sistema tiene dos soluciones");
            return true;

        } else {
            return false;
        }

    }

    /*
    • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    para que esto ocurra, el discriminante debe ser igual que 0. 
     */

    public boolean tieneRaiz(Raices r) {
        if (getDiscriminante(r) == 0) {
            System.out.println("El sistema tiene una unica solución");
            return true;
        } else {
            return false;

        }

    }
    /*• Método obtenerRaices(): llama a tieneRaíces() y si devolviera ó́true, imprime las 2 
posibles soluciones. 
    */
    public void obtenerRaices(Raices r){
        double x1=0 , x2=0; // estas son las racices
        
        if (tieneRaices(r)) {
            //(-b±√((b^2)-(4*a*c)))/(2*a) ecuacion para obtener las raices
            x1 = (-r.getB() + Math.sqrt(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/(2*r.getA());
            x2 = (-r.getB() - Math.sqrt(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/(2*r.getA());
        }
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
    
    /*
    • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
    */
    
    public void obtenerRaiz(Raices r){
        double x = 0 ;
        if (tieneRaiz(r)) {
             x = (-r.getB() + Math.sqrt(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/(2*r.getA());
            System.out.println("Unica raiz; x = "+x);
        }
    }
    /*
    • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje. 
    */
    public void calcular(Raices r){
        obtenerRaices(r);
        obtenerRaiz(r);
        
    }
    
}
