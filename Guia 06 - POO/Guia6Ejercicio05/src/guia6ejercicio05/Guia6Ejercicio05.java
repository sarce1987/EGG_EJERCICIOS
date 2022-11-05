/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guia6ejercicio05;

import Entidades.Cuenta;
import Servicios.CuentaServicio;
import java.util.Scanner;


public class Guia6Ejercicio05 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       
        CuentaServicio cs = new CuentaServicio();
        int opcion;
        
         //Crear cuenta
        System.out.println("Crear cuenta: ");
        Cuenta cuenta1 = cs.crearCuenta();
       
        do{
        System.out.println("Menu:" +"\n"
        + "1) Hacer un retiro"+"\n"
        + "2) Ingresar dinero"+"\n"
        + "3) Retiro expres"+"\n"
        + "4) Mostrar saldo"+"\n"
        + "5) Mostrar datos de la cuenta"+"\n"
        + "6) Salir"+"\n"
        + "Seleccione una opcion: ");
      
        opcion = leer.nextInt();
        
        switch(opcion){
           
            case 1:
                System.out.println("* Hacer un retiro");
                cs.retirar(cuenta1);
                break;
            case 2:
                System.out.println("* Ingresar dinero: ");
                cs.ingresar(cuenta1);
                break;
            case 3:
                System.out.println("Retiro expres: ");
                cs.extraccionRapida(cuenta1);
                break;
            case 4:
                System.out.println("Consultar el saldo: ");
                cs.consultarSaldo(cuenta1);
                break;
            case 5:
                System.out.println("Mostrar datos de la cuenta: ");
                cs.consultarDatos(cuenta1);
                break;
            case 6:
                System.out.println("Se salio del programa");
                break;
        }
        }while(opcion != 6);
    }
    
}
