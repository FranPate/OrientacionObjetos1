package test;

import modelo.Carrito;
import modelo.Producto;
import modelo.Supermercado;
import modelo.Cliente;

public class SupermercadoTest {
    public static void main(String[] args) throws Exception {
        Supermercado supermercado = new Supermercado();
        Cliente cliente = new Cliente(1, "Francisco", 43321132, "Medrano 470");
        Carrito carrito = new Carrito(1, cliente);

        // Agregar productos al supermercado
        supermercado.agregarProducto("Manzanas", 1.5f);
        supermercado.agregarProducto("Leche", 2.0f);
        supermercado.agregarProducto("Pan", 1.0f);

        // Traer un producto y modificarlo
        Producto productoModificado = supermercado.traerProducto(1);
        if (productoModificado != null) {
            supermercado.modificarProducto(1, "Manzanas Rojas", 1.8f);
        }

        // Eliminar un producto
        supermercado.eliminarProducto(3);

        // Agregar productos al carrito
        carrito.agregarItem(supermercado.traerProducto(1), 3);
        carrito.agregarItem(supermercado.traerProducto(2), 1);

        // Mostrar contenido del carrito y total
        System.out.println(carrito);

        // Eliminar un item del carrito
        carrito.eliminarItem(supermercado.traerProducto(1), 1);

        // Mostrar el carrito después de la eliminación
        System.out.println(carrito);
    }
}