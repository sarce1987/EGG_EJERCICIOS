
package guuia10ejercicio01;

import guuia10ejercicio01.Entidades.Animal;
import guuia10ejercicio01.Entidades.Caballo;
import guuia10ejercicio01.Entidades.Gato;
import guuia10ejercicio01.Entidades.Perro;


public class Guuia10Ejercicio01 {

    public static void main(String[] args) {
        
        //Creacion de un perro
        
        Perro p = new Perro("Stich", "Carnivoro", 15, "Doberman");
        p.alimentarse();
        
        //Ccracion del objeto gato
        
        Animal g = new Gato("Pelusa", "Galletas", 15, "Siames");
        g.alimentarse();
        
        //Creacion del caballo
        
        Animal c = new Caballo("Spark", "Pasto", 25, "Fino");
        c.alimentarse();
    }
    
}
