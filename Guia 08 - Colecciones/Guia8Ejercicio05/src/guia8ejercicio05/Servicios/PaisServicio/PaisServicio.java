/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio05.Servicios.PaisServicio;

import guia8ejercicio05.Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class PaisServicio {
    
    Scanner leer;
    TreeSet<Pais> paises;
    
    public PaisServicio(){  
        leer= new Scanner(System.in);
        paises = new TreeSet();
    }
    public Pais crearPais(){
        Pais p = new Pais();
        System.out.println("Igrese el nombre del pais");
        p.setNombrePais(leer.nextLine());
        return p;
    }
    
    public void listaPais(Pais p){
        paises.add(p);
    }
    
    public void mostrarPaises(){
        Iterator it = paises.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
