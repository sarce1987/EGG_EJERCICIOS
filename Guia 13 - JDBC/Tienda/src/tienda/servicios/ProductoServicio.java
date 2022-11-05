package tienda.servicios;

import java.util.Collection;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {
    
    private final ProductoDAO pdao;
    private final FabricanteDAO fdao;
    public Scanner leer;
    
    public ProductoServicio() {
        this.pdao = new ProductoDAO();
        this.leer = new Scanner(System.in);
        this.fdao = new FabricanteDAO();
    }

    public Producto crearProducto() throws Exception {
        
        try {
            System.out.println("Ingresar el nombre del producto:  ");
            String nombre = leer.next();
            //Validacion del nombre
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("Debe ingresar un nombre. La cadena esta vacia");
            }
            
            System.out.println("Ingrese el precio del producto: ");
            Double precio = leer.nextDouble();
            //Validacion del precio
            if (precio == null) {
                throw new Exception("Debe ingresar un precio");
            }
            //Antes de agregar un codigo de fabricante, Mostramos una lista
            //de los fabricantes
            System.out.println("Seleccione de la lista el fabricante del producto: ");            
            Collection<Fabricante> fabricantes = fdao.listarFabricantes();
            for (Fabricante aux : fabricantes) {
                System.out.println(aux.getCodigo() + " - " + aux.getNombre());
            }
            Integer codigoFabricante = leer.nextInt();
            //Validacion del codigo
            if (codigoFabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            
            Producto producto = new Producto();
            producto.setCodigoFabricante(codigoFabricante);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            
            return producto;
            
        } catch (Exception e) {
            throw e;            
        }
        
    }
    
   //f) Ingresar un producto a la base de datos
    public void crearGuardarProducto() throws Exception {     
        pdao.guardarPorducto(crearProducto());
    }
    
   //h) Editar un produto con datos a eleccion
    public void modificarProducto() throws Exception {
        
        try {
            listarTodosLosProductos();
            System.out.println("Seleccione el id del producto que desear modificar");
            int id = leer.nextInt();//Falta la parte de validacion
           
            System.out.println("Modifique el producto");           
            pdao.modificarProductoPorId(crearProducto(), id);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
      
    //a) Listar el nombre de todos los productos que hay en la tabla producto
    public void listarTodosLosProductos() throws Exception{
        String sql = "SELECT * FROM producto ORDER BY codigo ";
        try {
            Collection<Producto> productos = pdao.listarProductosSegunConsulta(sql);
            for (Producto aux : productos) {
                System.out.println(aux);
            }
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    //b) Listar los nombres y los precios de todos los productos de la tabla producto
    public void listarNombrePrecioDeProductos() throws Exception{
        String sql = "SELECT * FROM producto ORDER BY codigo ";
        try {
            Collection<Producto> productos = pdao.listarProductosSegunConsulta(sql);
            for (Producto aux : productos) {
                System.out.println(aux.getNombre() +" - $"+ aux.getPrecio());
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    //c) Listar aquellos productos que su precio esté entre 120 y 202   
    public void listarProductosEntre120Y202() throws Exception{
        String sql = "SELECT * FROM producto "
                + "WHERE precio BETWEEN 120 AND 202 "
                + "ORDER BY precio ";
        try {
            Collection<Producto> productos = pdao.listarProductosSegunConsulta(sql);
            for (Producto aux : productos) {
                System.out.println(aux.getNombre() +" - $"+ aux.getPrecio());
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    //d)Buscar y listar todos los portatiles de la tabla producto   
    public void listarProductosPortatiles() throws Exception{
        String sql = "SELECT * FROM producto "
                + "WHERE nombre LIKE 'Portátil%' "
                + "ORDER BY nombre ";
        try {
            Collection<Producto> productos = pdao.listarProductosSegunConsulta(sql);
            for (Producto aux : productos) {
                System.out.println(aux);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    //e) Listar el nombre y el precio del producto mas barato
     public void listarNombPrecProdMasBarato() throws Exception{
        String sql = "SELECT * FROM producto "
                + "ORDER BY precio ASC "
                + "LIMIT 1";
        try {
            Collection<Producto> productos = pdao.listarProductosSegunConsulta(sql);
            for (Producto aux : productos) {
                System.out.println(aux.getNombre() +" - $"+ aux.getPrecio());
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
}
