
package guia9ext02;

import guia9ext02.Servicios.EspectadorServicio;


public class Guia9Ext02 {

  
    public static void main(String[] args) {
        
        EspectadorServicio es = new EspectadorServicio();
       
        es.mostrarEspectadores( es.espectadoresAleatorios(50));
        
        System.out.println("\n"+es.espectadoresAleatorios(3).get(2));
        System.out.println("\n"+es.espectadoresAleatorios(3).get(2));
    }
    
}
