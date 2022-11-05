package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        try {
            String a = leer.next();
            String b = leer.next();

            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            DivisionNumero.divisionNumeros(c, d);

        }catch(NumberFormatException nfe){
            System.out.println("Se agregaron letras en vez de numeros");
        }catch(InputMismatchException ime){
            System.out.println("no se que es esto");         
        }catch(ArithmeticException ae){
            System.out.println("Division por cero");
        }
    }

}
