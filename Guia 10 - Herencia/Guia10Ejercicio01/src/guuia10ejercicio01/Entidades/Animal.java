
package guuia10ejercicio01.Entidades;


public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse(){
        System.out.println(nombre+" se alimenta con "+alimento);
    }
    
    
    
}
