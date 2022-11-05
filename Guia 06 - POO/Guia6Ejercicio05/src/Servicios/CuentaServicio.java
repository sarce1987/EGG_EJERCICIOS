package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    Scanner leer = new Scanner(System.in);
   
    //Este metodo sirve para instanciar un objeto
    public Cuenta crearCuenta() {

        System.out.println("Ingrese el numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo actual de la cuenta: ");
        double saldoActual = leer.nextDouble();
        System.out.println("Ingrese el interes");
        double interes = leer.nextDouble();

        return new Cuenta(numeroCuenta, dniCliente, saldoActual, interes);
        

    }

   /* 
   Método ingresar(double ingreso): el método recibe una cantidad de dinero a 
   ingresar y se la sumara a saldo actual.
   */
   
    
    public void ingresar(Cuenta c){
        System.out.println("Cantidad de dinero que desea ingresar a la cuenta: ");
        double ingreso = leer.nextDouble();
        
        c.setSaldoActual(c.getSaldoActual()+ingreso);// esta linea suma el ingreso al saldo actual
       
    }
    /*
    Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    */
    
    public void retirar(Cuenta c){
        System.out.println("Ingrese el monto a retirar de la cuenta");
        double retirar = leer.nextDouble();
        
        if (retirar > c.getSaldoActual()) {
            c.setSaldoActual(0);
        }else{
            
            c.setSaldoActual(c.getSaldoActual()-retirar); //Con esto le reto al saldo actual l oque se ha retirado
        }
 
    }
    /*
    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    que el usuario no saque más del 20%.    
    */
    
    
    public void extraccionRapida(Cuenta c){
        System.out.println("Usted a ingresado a la extraccion rapida solo puede retirar hasta un 20% de su saldo: "+c.getSaldoActual()*0.2);
        double retirar;
        char salir = 'n';
        
        do{
        System.out.println("Ingrese el monto a retirar: ");
        retirar = leer.nextDouble() ;
            if (retirar > c.getSaldoActual()*0.2) {
                System.out.println("El monto supera el 20% de su cuenta");
                System.out.println("Desea salir? S/N");
                salir = leer.next().toLowerCase().charAt(0);
                /*
                Esta linea lee por pantalla una cadena la convierte en minuscula y la convierte en caracter
                */
            }else{
                
                c.setSaldoActual(c.getSaldoActual()-retirar);
                System.out.println("Operacion realizada con exito:");
                System.out.println("Su saldo actual es de: "+c.getSaldoActual());
                salir ='s';
            }
        
        }while (Character.compare(salir, 'n')==0); 
            

    }
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(Cuenta c){
        
        System.out.println("Su saldo es de: "+c.getSaldoActual());
    }
    
    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta c){
        
        System.out.println(c.toString());
    }
    
}
