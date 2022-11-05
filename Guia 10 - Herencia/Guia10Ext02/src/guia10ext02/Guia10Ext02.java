
package guia10ext02;

import guia10ext02.Entidades.Edificio;
import guia10ext02.Entidades.EdificioDeOficinas;
import guia10ext02.Entidades.Polideportivo;
import guia10ext02.Enumeradores.TipoDeInstalacion;
import java.util.ArrayList;


public class Guia10Ext02 {

  
    public static void main(String[] args) {
      
        ArrayList<Edificio> construcciones = new ArrayList();
        
        Polideportivo p1 = new Polideportivo();
        EdificioDeOficinas e1 = new EdificioDeOficinas();
        Polideportivo p2 = new Polideportivo();
        EdificioDeOficinas e2 = new EdificioDeOficinas();
        
        
        
        construcciones.add(p1);
        construcciones.add(p2);
        construcciones.add(e1);
        construcciones.add(e2);
        
        int i = 0, j=0;
        for (Edificio aux : construcciones) {
            System.out.println("---- SUPERFICIE Y VOLUMEN ----");
            aux.calcularSuperficie();
            aux.calcularVolumen();
           
            
            if (aux instanceof Polideportivo) {
                
                if (((Polideportivo) aux).getTipoInstalacion().equals(TipoDeInstalacion.ABIERTO)) {
                    i += 1;                 
                }else{                  
                    j +=1;                  
                }
            } else{         
                EdificioDeOficinas e = (EdificioDeOficinas) aux;
                e.cantPersonas();
            }    
        }
        System.out.println("Cantidad de polideportivos Abiertos: " + i);
        System.out.println("Cantidad de polideportivos Techados: " + j);
    }
    
}
