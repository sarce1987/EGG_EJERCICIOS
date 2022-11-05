package libreria.persistencia;

import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor> {

    public void guardarAutor(Autor autor) {
        guardar(autor);
    }

    public Autor buscarAutorPorNombre(String nombre) {

        try {
            conectar();
            Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a "
                    + "WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            desconectar();
            return autor;
        } catch (Exception e) {
            System.out.println("No se encontró ningun autor");
            return null;
        }
    }

    public Autor buscarAutorPorID(Integer id) {
        try {
            conectar();
            Autor autor = em.find(Autor.class, id);
            desconectar();
            return autor;
        } catch (Exception e) {
            System.out.println("No se encontró ningun autor");
            return null;
        }
    }
    
    public void editarAutor(Autor autor){
        
        editar(autor);
    }
}
