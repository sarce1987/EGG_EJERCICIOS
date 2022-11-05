package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    public EditorialDAO DAO;
    public Scanner sc;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Editorial crearEditorial() throws Exception {
        try {
            System.out.println("Ingrese el nombre de la editorial: ");
            String nombre = sc.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("No ha ingresado ningun nombre de editorial");
            }
            Editorial editorial = new Editorial();
            editorial.setNombre(nombre);
            editorial.setAlta(Boolean.TRUE);
            DAO.guardarEditorial(editorial);
            return editorial;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Editorial buscarEditorialPorNombre() throws Exception {
        try {
            System.out.println("Ingrese el nombre de la editorial que desea buscar: ");
            String nombre = sc.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("No ha ingresado un nombre de editorial");
            }
            return DAO.buscarEditorial(nombre);
        } catch (Exception e) {
            e.getStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public Editorial buscarEditorialPorID() throws Exception {
        try {
            System.out.println("Ingrese el ID de la editorial que desea buscar: ");
            Integer id = sc.nextInt();sc.nextLine();
            if (id < 0 || id == null) {
                throw new Exception("No se ha ingresado ningun ID");
            }
            return DAO.buscarEditorialPorID(id);

        } catch (Exception e) {
            e.getStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public void editarEditorialPorNombre() {

        try {
            Editorial editorial = new Editorial();
            System.out.println("Editar editorial");
            System.out.println("1) Buscar editorial a editar por nombre");
            System.out.println("2) Buscar editorial a editar por id");
            int opcion = sc.nextInt(); sc.nextLine();
           
            switch (opcion) {
                case 1:
                    editorial = buscarEditorialPorNombre();
                    break;
                case 2:
                    editorial = buscarEditorialPorID();
                    break;
            }
            System.out.println("Ingrese el nuevo nombre de la editorial: ");
            String nombre = sc.nextLine();
            editorial.setNombre(nombre);
            DAO.editarEditorial(editorial);
        } catch (Exception e) {
        }

    }
    
    public void darAlta(){
        try {
            System.out.println("Dar de alta una editorial");
            Editorial editorial = buscarEditorialPorID();
            if (editorial.getAlta()) {
                System.out.println("La editorial ya esta dada de alta");
            }else{
                editorial.setAlta(Boolean.TRUE);
                DAO.editarEditorial(editorial);
                System.out.println("Se dio de alta la editorial");
            }
        } catch (Exception e) {
        }
    }
     
    public void darDeBaja(){
        try {
            System.out.println("Dar de baja una editorial");
            Editorial editorial = buscarEditorialPorID();
            if (!editorial.getAlta()) {
                System.out.println("La editorial ya esta dada de baja");
            }else{
                editorial.setAlta(Boolean.FALSE);
                DAO.editarEditorial(editorial);
                System.out.println("Se dio de baja la editorial");
            }
        } catch (Exception e) {
        }
    }

}
