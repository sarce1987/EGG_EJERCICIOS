
package guia6ejercicio09;


public class Matematica {
    //Atributos
    
    private double a;
    private double b;
    
    //Constructores
    
    public Matematica(){
        
    }
    
    public Matematica(double a , double b){
        
        this.a = a;
        this.b = b;
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
   /*
    Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
    valor
    */ 
    public double devolverMayor(){
        return Math.max(a, b);
    }
    
    /*
    Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.
    */
    
    public void calcularPotencia(){
        double max = Math.round(Math.max(a, b));
        double min = Math.round(Math.min(a, b));
        double pot = Math.pow(max, min);
        
        System.out.println("La potencia es: "+pot); 
    }
    
    // Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    
    public void calculaRaiz(){
        
        double raiz = Math.sqrt(Math.min(a, b));
        System.out.println("La raiz cuadrada del menor es: "+raiz);
    }

    @Override
    public String toString() {
        return "Matematica{" + "a=" + a + ", b=" + b + '}';
    }
    
    
    
}
