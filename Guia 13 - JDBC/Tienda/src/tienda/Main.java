package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Main {

    public static void main(String[] args) throws Exception {

        menu();

    }

    /*
    a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
     */
    public static void menu() throws Exception {
        Scanner leer = new Scanner(System.in);
        ProductoServicio pserv = new ProductoServicio();
        FabricanteServicio fserv = new FabricanteServicio();

        System.out.println("MENU");
        System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.");
        System.out.println("b) Lista los nombres y los precios de todos los productos de la tabla producto.");
        System.out.println("c) Listar aquellos productos que su precio esté entre 120 y 202.");
        System.out.println("d) Buscar y listar todos los Portátiles de la tabla producto.");
        System.out.println("e) Listar el nombre y el precio del producto más barato.");
        System.out.println("f) Ingresar un producto a la base de datos.");
        System.out.println("g) Ingresar un fabricante a la base de datos");
        System.out.println("h) Editar un producto con datos a elección.");
        System.out.println("i) Salir");

        System.out.print("Elija una opcion: ");
        String opcion = leer.next().toLowerCase();
        String opcion2 = "";
        switch (opcion) {
            case "a":
                pserv.listarTodosLosProductos();
                menu();
                break;
            case "b":
                pserv.listarNombrePrecioDeProductos();
                menu();
                break;
            case "c":
                pserv.listarProductosEntre120Y202();
                menu();
                break;
            case "d":
                pserv.listarProductosPortatiles();
                menu();
                break;
            case "e":
                pserv.listarNombPrecProdMasBarato();
                menu();
                break;
            case "f":
                pserv.crearGuardarProducto();
                menu();
                break;
            case "g":
                fserv.crearGuardarFabricante();
                menu();
                break;
            case "h":
                pserv.modificarProducto();
                menu();
                break;
            case "i":
                System.out.println("Esta seguro que desea salir? S/N");
                opcion2 = leer.next().toLowerCase();
                if (opcion2.equals("s")) {
                    break;
                } else {
                    menu();
                }

            default:
                System.out.println("Datos ingresados incorrectos");
                menu();

        }
    }

}
