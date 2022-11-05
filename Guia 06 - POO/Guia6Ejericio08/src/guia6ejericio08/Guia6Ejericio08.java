/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.

• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.

• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.

• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia6ejericio08;

import Entidades.Cadena;
import java.util.Scanner;


public class Guia6Ejericio08 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Creacion de un objeto de cadena
        Cadena c1 = new Cadena();
        String frase;
        int longitud;
        System.out.println("Ingrese una frase \n");
        frase = leer.nextLine();
        longitud = frase.length();
        c1.setCadena(frase);
        c1.setLongitud(longitud);
        
        System.out.println(c1.toString());
        
        c1.contarVocales(c1);
        c1.invertirFrase(c1);
        
        System.out.println("Ingrese un caracter");
        String caracter = leer.next();
        c1.vecesRepetido(caracter , c1);
        
       
        System.out.println("Ingrese una frase nueva ");
        String frase_nueva = leer.next();
        c1.compararLongitud(frase_nueva);
        
        System.out.println("Ingrese una frase para unirla con la de la cadena ");
        String frase_nueva2 = leer.next();
       c1.unirFrases(frase_nueva2);
        
        System.out.println("Ingrese un caracter para cambiarlo por todos los lugares donde exista una 'a' ");
        String caracter2 = leer.next();
        c1.reemplazar(caracter2);
        
        
        System.out.println("Ingrese una letra para averiguar si esta contenida en la frase");
        String letra = leer.next();
        if (c1.contiene(letra)) {
            System.out.println("La frase contiene dicha letra");
        }else{
            System.out.println("La frase no contiene esa letra");
        
        }
    }
    
}
