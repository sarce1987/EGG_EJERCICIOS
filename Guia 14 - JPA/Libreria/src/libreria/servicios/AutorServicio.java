package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    public AutorDAO DAO;
    public Scanner sc;

    //Constructor
    public AutorServicio() {
        this.DAO = new AutorDAO();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Autor crearAutor() throws Exception {
        try {
            //Validacion de que el string no sea un dato vacio
            System.out.println("Ingrese el nombre del autor");
            String nombre = sc.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("No se ha ingresado ningun nombre");
            }
            //Creo el autor y le seteo los datos relevantes
            Autor autor = new Autor();
            autor.setNombre(nombre);
            autor.setAlta(Boolean.TRUE);
            //Guardo el autor en la base de datos
            DAO.guardarAutor(autor);
            return autor;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public Autor buscarAutorPorNombre() {
        try {
            System.out.println("Ingrese el nombre del autor que desea buscar: ");
            String nombre = sc.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("No se ha ingresado ningun nombre");
            }
            return DAO.buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            return null;
        }

    }

    public Autor buscarAutorPorId() throws Exception {
        try {
            System.out.println("Ingrese el Id del autor que desea buscar: ");
            Integer id = sc.nextInt();sc.nextLine();
            if (id <= 0 || id == null) {
                System.out.println("No ha ingresado ningun id");
            }
            return DAO.buscarAutorPorID(id);
        } catch (Exception e) {
            throw new Exception();
        }
    }
    
    public void editarNombreAutor(){
        
        try {
            Autor autor = new Autor();
            System.out.println("Autor a modificiar: ");
            System.out.println("1) Buscar autor por nombre");
            System.out.println("2) Buscar autor por Id");
            int opcion = sc.nextInt();sc.nextLine();
            switch(opcion){
                case 1:
                    autor = buscarAutorPorNombre();
                    break;
                case 2:
                    autor = buscarAutorPorId();
                    break;
            }
            System.out.println("Escriba el nuevo nombre: ");
            String nombre = sc.nextLine();
            autor.setNombre(nombre);
            DAO.editarAutor(autor);
            
            
        } catch (Exception e) {
        }
        
    }
    
    public void darAlta() throws Exception{
        System.out.println("Dar Alta Autor");
        System.out.println("Buscar autor por ID");
        Autor autor = buscarAutorPorId();
        if (autor.getAlta()) {
            System.out.println("El autor ya esta dado de alta");
        }else{
            autor.setAlta(Boolean.TRUE);
            DAO.editarAutor(autor);
            System.out.println("El autor quedo dado de alta");
        }
        
    }
    
    public void darBaja() throws Exception{
        System.out.println("Dar baja Autor");
        System.out.println("Buscar el autor por ID");
        Autor autor = buscarAutorPorId();
        if (!autor.getAlta()) {
            System.out.println("El autor ya está dado de baja");
        }else{
            autor.setAlta(Boolean.FALSE);
            DAO.editarAutor(autor);
            System.out.println("El autor fue dado de baja");
        }
    }
}
