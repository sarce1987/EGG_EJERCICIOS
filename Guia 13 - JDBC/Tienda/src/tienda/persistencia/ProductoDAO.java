
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {
    
    public void guardarPorducto(Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (nombre , precio , codigo_fabricante)"
                    + "VALUES ('"+producto.getNombre()+"', '"+producto.getPrecio()+"' , "+producto.getCodigoFabricante()+")";          
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void modificarProductoPorId(Producto producto , int id) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = '" + producto.getPrecio() + "' , codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = '" + id + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
 
    
    public Collection<Producto> listarProductosSegunConsulta(String sql) throws Exception{
         try {
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
               producto = new Producto();
               producto.setCodigo(resultado.getInt(1));
               producto.setNombre(resultado.getString(2));
               producto.setPrecio(resultado.getDouble(3));
               producto.setCodigoFabricante(resultado.getInt(4));
               productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
        
    }
    
}

