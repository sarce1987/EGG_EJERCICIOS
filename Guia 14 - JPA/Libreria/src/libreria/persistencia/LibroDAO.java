
package libreria.persistencia;

import libreria.entidades.Libro;


public class LibroDAO extends DAO <Libro> {
    
    @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }
    
    public Libro buscarPorID(Long isbn) throws Exception{
       try{
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
       }catch(Exception e){
           throw new Exception("No se encontró ningun libro");
           
       }  
    }
    
    public Libro buscarPorNombreLibro(String nombre) throws Exception{
        try{
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l "
                + "WHERE l.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return libro;
        }catch (Exception e){
            throw new Exception("No se encontró ningun libro");
        }
    }
}
