package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    /*
    • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
     */
    Scanner leer = new Scanner(System.in);

///////// METODO CREARJUEGO /////////////
    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra buscada");
        String palabra = leer.next();

        char palabraBuscada[] = new char[palabra.length()]; // definicion del vector

        //llenado del vector palabraBuscada
        for (int i = 0; i < palabraBuscada.length; i++) {

            palabraBuscada[i] = palabra.charAt(i);
        }

        System.out.print("Ingrese la cantidad de jugadas maximas: ");
        int jugadasMaximas = leer.nextInt();
        int letrasEncontradas = 0;

        //Instansiacion del objeto ahorcado
        return new Ahorcado(palabraBuscada, letrasEncontradas, jugadasMaximas);

    }

    /*
    • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
     */
    //////////// METODO LONGITUD ///////////////
    public void longitud(Ahorcado a) {

        System.out.println("La palabra tiene " + a.getPalabraBuscada().length + " caracteres");

    }

    /*
    • Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    //////////// METODO BUSCAR LETRA //////////
    public void buscar(Ahorcado a, char letra) {

        int cont = 0;
        for (int i = 0; i < a.getPalabraBuscada().length; i++) {

            if (Character.compare(a.getPalabraBuscada()[i], letra) == 0) {
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("La letra no forma parte de la palabra");
        } else {
            System.out.println("La letra está en la palabra");
        }
    }

    /*
    • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    //////// METODO ENCONTRADAS ///////////
    public boolean encontradas(Ahorcado a, char letra) {
        int cont = 0;
        for (int i = 0; i < a.getPalabraBuscada().length; i++) {
            if (Character.compare(a.getPalabraBuscada()[i], letra) == 0) {
                cont++;
            }
        }

        a.setLetrasEncontradas(a.getLetrasEncontradas() + cont);
        System.out.println("Encontradas: " + a.getLetrasEncontradas() + " letras");

        int letrasFaltantes = a.getPalabraBuscada().length - a.getLetrasEncontradas();
        System.out.println("Faltan encontrar: " + letrasFaltantes + " letras");

        //valores de retorno
        if (cont != 0) {
            return true;

        } else {
            return false;

        }

    }

    /*
   • Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    ///////// METODO INTENTOS /////////
    public void intentos(Ahorcado a, char letra) {

        if (!encontradas(a, letra)) {
            a.setJugadasMaximas(a.getJugadasMaximas() - 1);
        }

        System.out.println("Le quedan: " + a.getJugadasMaximas() + " oportunidades");
    }
    /*
    • Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
     */
    //////////// METODO JUEGO ////////////
    
    public void juego(Ahorcado a){
        longitud(a);
        int finJuego = 0;  
        char letra;
        String letraAux = "";
        int repetir=1;
       do{
         
         
          do{ 
           System.out.println("Ingrese una letra");
           letra = leer.next().charAt(0);
           for (int i = 0; i < letraAux.length(); i++) {
               if (Character.compare(letraAux.charAt(i), letra)== 0) {
                   System.out.println("La letra ya se ingreso, vuelva a intentar");
                   repetir = 0;
               }else{
                   repetir = 1;
               }
           }
          }while(repetir == 0);
             
           
          
          letraAux += letra;
          
           
           
        buscar(a, letra);
        intentos(a, letra);
        
           if (a.getJugadasMaximas()==0) {
               System.out.println("Usted ha perdido no le quedan mas oportunidades");
               finJuego=1;
           }else if (a.getLetrasEncontradas() == a.getPalabraBuscada().length) {
               System.out.println("FELICITACIONES!! Usted ha adivinado la palabra");
               finJuego = 1;
           }
       }while(finJuego == 0);
       
    }
    
}
