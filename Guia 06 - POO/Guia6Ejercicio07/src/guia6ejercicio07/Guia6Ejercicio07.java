/*
7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package guia6ejercicio07;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Guia6Ejercicio07 {

   
    public static void main(String[] args) {
       
        //Crear variables necesarias para la ejecucion
        PersonaServicio ps = new PersonaServicio();
        Persona P[] = new Persona[4];
        int IMC [] = new int[4];
        boolean mayor_de_edad[] = new boolean[4];
        //este ciclo para genera las 4 personas
        for (int i = 0; i < P.length; i++) {   
            P[i] = ps.crearPersona();
            System.out.println("");
        }
        
        //En esta parte se calcula el valor IMC de cada una de las personas y se guarda en un array
        
        for (int i = 0; i < P.length; i++) {
            IMC[i] = ps.calcularIMC(P[i]);
    
        }
        int cont_case1=0, cont_case2=0,cont_case3=0; //Cuenta quienes tiene un peso ideal bajo peso o sobrepeso
        int cont_mayor=0,cont_menor=0;//Cuenta cuantos son mayor de edad y menor de edad
        
        for (int i = 0; i < P.length; i++) {
            switch (IMC[i]) {
                case -1:
                    System.out.println(P[i].getNombre()+" Esta por debajo de su peso ideal");
                    cont_case1+=1;
                    break;
                case 0:
                    System.out.println(P[i].getNombre()+" Está en su peso ideal");
                    cont_case2+=1;
                    break;
                case 1:
                    System.out.println(P[i].getNombre()+" Tiene sobrepeso");
                    cont_case3+=1;
                    break;     
                    
            }
            //Este if corrobora que la persona sea mayor de edad
            mayor_de_edad[i] = ps.esMayorDeEdad(P[i]);
            if (mayor_de_edad[i]) {
                System.out.println("Es mayor de edad");
                cont_mayor+=1;
            }else{
                System.out.println("No es menor de edad");
                cont_menor+=1;
                
            }
        }
        
        System.out.println("% de personas por debajo de su peso ideal "+(double)(cont_case1)/4*100+"%");
        System.out.println("% de personas en su peso ideal "+(double)(cont_case2)/4*100+"%");
        System.out.println("% de personas con sobrepeso "+(double)(cont_case3)/4*100+"%\n");
        
        System.out.println("% de mayores de edad "+(double)(cont_mayor)/4*100+"%");
        System.out.println("% de menores de edad "+(double)(cont_menor)/4*100+"%");
        
        for (int i = 0; i < 4; i++) {
            System.out.println(P[i].toString());
            
        }
    }  
    
    
    
    
}
