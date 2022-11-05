/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Cadena {
    //Atributos
    
    private String cadena;
    private int longitud;
    
    //Constructores

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //////////////// METODO CONTAR VOCALES //////////////
    //Contara la cantidad de voacales que tiene la cadena
    
    public void contarVocales(Cadena c){
        int j =0;
        String caracter;
        for (int i = 0; i < c.getLongitud(); i++) {
            
            caracter = c.getCadena().toLowerCase().substring(i,i+1);
            if ( caracter.equals("a")
              || caracter.equals("e")
              || caracter.equals("i")
              || caracter.equals("o")
              || caracter.equals("u")) {
                
                j+=1;
            }
        }
        
        System.out.println("La frase tiene :"+j+" vocales");
  
    }
// • Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
// Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    /////////////////////// METODO INVERTIR CADENA ////////////////////////
    public void invertirFrase(Cadena c){
        
        String cadena_alrevez="";
        for (int i = c.getLongitud()-1; i >= 0 ; i--) {
            
            cadena_alrevez = cadena_alrevez + c.getCadena().charAt(i);
        }
        
        System.out.println("La cadena alrevez es: "+cadena_alrevez);
    }
    
    /*
    • Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    
    //////////////// METODO VECES REPETIDO /////////////
    
    public void vecesRepetido(String letra , Cadena c){
        int cont=0;
        for (int i = 0; i < c.longitud; i++) {
            if (c.getCadena().substring(i, i+1).equals(letra)) {
                cont +=1;
            }
        }
        System.out.println("La letra "+letra+" se repitio "+cont+" veces");
    }
    /*
     Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
    */
    
    //////////////// METODO COMPARAR LONGITUD ///////////////////////
    
    public void compararLongitud(String frase ){
        if (cadena.length() == frase.length()) {
            System.out.println("Las dos cadenas tienen la misma dimension");
        }else if(cadena.length()< frase.length()){
            System.out.println("La nueva frase tiene una dimension mayor");
            
        }else{
            System.out.println("La frase del objeto es mayor que la frase nueva");
        }

    }
     /*
        • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        */      
        /////////////////////// METODO UNIR FRASES ////////////////////
    
     public void unirFrases(String frase){
         String frase_unida = cadena + frase;
         
         System.out.println(frase_unida);
         
        }
    
     /*
     • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
     */
     
     //////////////////// METODO REEMPLAZAR STRING ///////////////////
     
     public void reemplazar(String letra){
         String cadena_modificada="";
         
         
         for (int i = 0; i < cadena.length(); i++) {
             
             if (cadena.substring(i,i+1).equals("a")) {
                 
                 cadena_modificada += letra;
             }else{
                 
                 cadena_modificada += cadena.substring(i,i+1);
             }
             
         }
         System.out.println(cadena_modificada);
     }
     /*
     • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    
     public boolean contiene(String letra){
         
         boolean resp = false;
         for (int i = 0; i < cadena.length(); i++) {
             if (cadena.substring(i, i+1).equals(letra)) {
                 
                 resp = true;
             }
         }
         if (resp) {
                 
                 return resp;
             }else
                 return false;
     }
     
     
     
     @Override
    public String toString() {
        return "Cadena{" + "cadena=" + cadena + ", longitud=" + longitud + '}';
    }
    
    
    
    
    
}
