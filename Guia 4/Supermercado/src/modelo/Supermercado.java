package modelo;

public class Supermercado {
    private AdmProducto admProducto;
    private AdmCliente admCliente;
    private AdmCarrito admCarrito;

    public Supermercado() {
    	this.admProducto = new AdmProducto();
    	this.admCliente = new AdmCliente();
    	this.admCarrito = new AdmCarrito();
    }

    public boolean agregarProducto(String nombreProducto, float precio) {
        return admProducto.agregarProducto(nombreProducto, precio);
    }

    public Producto traerProducto(int idProducto) {
        return admProducto.traerProducto(idProducto);
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
        return admProducto.eliminarProducto(idProducto);
    }
    
    public boolean agregarCliente(String nombreCliente, long dni, String direccion) {
        return admCliente.agregarCliente(nombreCliente, dni, direccion);
    }

    public Cliente traerCliente(int idCliente) {
        return admCliente.traerCliente(idCliente);
    }

    public boolean eliminarCliente(int idCliente) {
        return admCliente.eliminarCliente(idCliente);
    }
    
    public boolean agregarCarrito(Cliente cliente) {
        return admCarrito.agregarCarrito(cliente);
    }

    public Carrito traerCarrito(int idCarrito) {
        return admCarrito.traerCarrito(idCarrito);
    }

    public boolean eliminarCarrito(int idCarrito) {
        return admCarrito.eliminarCarrito(idCarrito);
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "admProducto=" + admProducto +
                ", admCliente=" + admCliente +
                ", admCarrito=" + admCarrito +
                '}';
    }
}