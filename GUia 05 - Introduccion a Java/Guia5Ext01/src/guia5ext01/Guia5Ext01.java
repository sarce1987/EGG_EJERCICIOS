/*
 01) Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas
 */
package guia5ext01;

import java.util.Scanner;

public class Guia5Ext01 {

    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los minutos: ");
        
        double minutos = leer.nextDouble();
        
        // 60 min = 1 hora
        // X min * 1h/60min * 1dia/24h = X(min)/1440 → dias
        
        double dias = Math.floor(minutos / 1440) ;
        
        // X dias * 24h/dia
        
        double horas = Math.floor((minutos / 1440 - dias)*24) ;
        
        
        System.out.println("Equivale a : "+dias+" Dias y "+horas+" Horas");
        
    }
    
}
