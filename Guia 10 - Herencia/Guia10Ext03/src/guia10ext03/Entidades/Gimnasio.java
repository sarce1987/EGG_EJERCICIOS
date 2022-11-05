
package guia10ext03.Entidades;

import guia10ext03.Numeradores.TipoGimnasio;
import java.util.Scanner;


public class Gimnasio {

   private TipoGimnasio tipo;
   public Scanner leer = new Scanner(System.in);
    public Gimnasio() {
    }

    public Gimnasio(TipoGimnasio tipo) {
        this.tipo = tipo;
    }

    public TipoGimnasio getTipo() {
        return tipo;
    }

    public void setTipo(TipoGimnasio tipo) {
        this.tipo = tipo;
    }
    
 public void crearGimnasio(){
     System.out.print("Seleccione el tipo de gimnasio A o B: ");
        String tipo = leer.next().toUpperCase();
        switch(tipo){
            case "A":
                this.tipo = TipoGimnasio.A;
                break;
            case "B":
                this.tipo = TipoGimnasio.B;
                break;
            default :
                crearGimnasio();
                
        }
 }   

    @Override
    public String toString() {
        return "Gimnasio{" + "tipo=" + tipo +'}';
    }
    
   
 
}
