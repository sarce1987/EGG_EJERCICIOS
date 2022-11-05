
package Entidades;


public class Operacion {
   
    ///Atributos
    private int num1;
    private int num2;
    
    //a)Constructor por defecto(Vacio)
    public Operacion(){ 
        
    }
    
    //b)Constructor con los atributos
    public Operacion(int num1 , int num2){
        this.num1=num1;
        this.num2=num2;
        
    }
    //c)Metodos Getter&Setter

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
    
}
