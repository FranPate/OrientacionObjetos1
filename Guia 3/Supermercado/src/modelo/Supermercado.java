package modelo;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Producto> productos;

    public Supermercado() {
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(String nombreProducto, float precio) {
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                throw new IllegalArgumentException("El producto ya existe en la lista.");
            }
        }
        return productos.add(new Producto(productos.size() + 1, nombreProducto, precio));
    }

    public Producto traerProducto(int idProducto) {
        for (Producto producto : productos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        return null;  // Si no existe, devuelve null
    }

    public boolean modificarProducto(int idProducto, String nuevoNombre, float nuevoPrecio) {
        Producto producto = traerProducto(idProducto);
        if (producto == null) {
            throw new IllegalArgumentException("El producto no existe en la lista.");
        }
        producto.setNombreProducto(nuevoNombre);
        producto.setPrecio(nuevoPrecio);
        return true;
    }

    public boolean eliminarProducto(int idProducto) {
        Producto producto = traerProducto(idProducto);
        if (producto == null) {
            throw new IllegalArgumentException("El producto no existe en la lista.");
        }
        return productos.remove(producto);
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "productos=" + productos +
                '}';
    }
}