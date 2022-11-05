package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    public LibroDAO DAO;
    public Scanner sc;
    public AutorServicio as;
    public EditorialServicio es;

    public LibroServicio() {
        this.DAO = new LibroDAO();
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.as = new AutorServicio();
        this.es = new EditorialServicio();
    }

    public Libro crearLibro() throws Exception {
        try {
            System.out.println("Ingrese el ISBN");
            Long isbn = sc.nextLong();
            sc.nextLine();
            if (isbn < 0 || isbn == null) {
                throw new Exception("No ha especificado un isbn");
            }
            System.out.println("Ingrese el titulo del libro");
            String titulo = sc.nextLine();
            if (titulo == null || titulo.isEmpty()) {
                throw new Exception("No ha especificado un titulo para el libro");
            }
            System.out.println("Ingrese el año: ");
            Integer anio = sc.nextInt();
            if (anio < 0 || anio == null) {
                throw new Exception("No ha especificado el año");
            }
            System.out.println("Ingrese la cantidad de ejemplares: ");
            Integer ejemplares = sc.nextInt();
            if (ejemplares < 0 || ejemplares == null) {
                throw new Exception("No ha especificado la cantidad de ejemplares");
            }
            Boolean alta = true;

            Autor autor = as.buscarAutorPorId(); //Habria que hacer una validacion por si el buscar no encuentra nada

            Editorial editorial = es.buscarEditorialPorID(); //Habria que hacer una validacion por si el buscar no encuentra nada 

            Libro libro = new Libro();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setAlta(alta);
            DAO.guardar(libro);

            return libro;

        } catch (Exception e) {
            e.getStackTrace();
            throw new Exception("Se ha producido un error al agregar un libro");
        }

    }
    
    public Libro buscarLibroPorNombreLibro() throws Exception{
        System.out.println("Ingrese el nombre del libro que quiere buscar: ");
        String nombre = sc.nextLine();
        return DAO.buscarPorNombreLibro(nombre);
    }
    
    public Libro buscarLibroPorId() throws Exception{
        System.out.println("Ingrese el isbn");
        Long isbn = sc.nextLong();sc.nextLine();
        return DAO.buscarPorID(isbn);
    }
    
    
}
