/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor

• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package guia6ejercicio09;


public class Guia6Ejercicio09 {

   
    public static void main(String[] args) {
       
        Matematica m = new Matematica();
        
        m.setA(Math.random()*10);
        m.setB(Math.random()*10);
        
        System.out.println(m.toString());
        System.out.println("El mayor de los numeros es: "+m.devolverMayor());
        
        m.calcularPotencia();
        m.calculaRaiz();
    }
    
}
