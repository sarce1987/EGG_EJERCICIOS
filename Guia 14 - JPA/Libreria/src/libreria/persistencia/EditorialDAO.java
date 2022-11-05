
package libreria.persistencia;

import libreria.entidades.Editorial;


public class EditorialDAO extends DAO<Editorial>{
    
  public void guardarEditorial(Editorial editorial){
      guardar(editorial);
  }  
    
  public Editorial buscarEditorial(String nombre){
      try{
      conectar();
      Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e "
              + "WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
      desconectar();
      return editorial;
      }catch(Exception e){
          System.out.println("No se encontro ninguna editorial");
          return null;
      }
      
  } 
  
  public Editorial buscarEditorialPorID (Integer id){
      try {
          conectar();
          Editorial editorial = em.find(Editorial.class, id);       
          desconectar();
          return editorial;
      } catch (Exception e) {
          System.out.println("No se encontró ninguna editorial");
          return null;
      }  
  }
  
  public void editarEditorial(Editorial editorial){
      editar(editorial);
      
  }
  
}
