
package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    //////////////// METODO CREAR PERSONA ///////////////
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
       
        char sexo;
        int sex_auxiliar=0;
        do{
        System.out.println("Ingrese el sexo [M],[F] o [O]");
        sexo = leer.next().toLowerCase().charAt(0);
            if (Character.compare(sexo, 'f')!=0 && Character.compare(sexo, 'm')!=0 && Character.compare(sexo, 'o')!=0) {
                System.out.println("El caracter ingresado es incorrecto.");
                
            }else{
                sex_auxiliar = 1;
                
            }
        }while(sex_auxiliar == 0);
              
        System.out.println("Ingrese el peso [Kg]: ");
        int peso = leer.nextInt();
        System.out.println("Ingrese la altura [cm]: ");
        int altura = leer.nextInt();

       return new Persona(nombre, edad, sexo, peso, altura);

    }
    /*
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    
    ///////////////// METODO CALCULAR IMC ////////////////
    public int calcularIMC(Persona p){
        
        double IMC ;
        double altura;
        altura =(double) p.getAltura() / 100;

         IMC = p.getPeso() /Math.pow(altura, 2);

         if (IMC < 20) {
             return -1;      
        }else if(IMC >= 20 && IMC <= 25){             
                return 0;
        }else {          
             return 1;
        }
     
    }
        /*
         • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
         */     
        //////////////// METODO ES MAYOR DE EDAD ///////////////////
    
    public boolean esMayorDeEdad(Persona p){
        
        return p.getEdad()>=18;
        
    }
}
