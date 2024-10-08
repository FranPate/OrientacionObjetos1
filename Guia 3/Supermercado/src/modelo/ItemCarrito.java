package modelo;

public class ItemCarrito {
    private int idItem;
    private Producto producto;
    private int cantidad;

    public ItemCarrito(int idItem, Producto producto, int cantidad) {
    	this.idItem = idItem;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdItem() {
        return idItem;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularSubTotal() {
        return cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return String.format(
            "  ID: %d\n" +
            "  Producto: %s\n" +
            "  Cantidad: %d\n" +
            "  Subtotal: %.2f\n"
            , idItem, producto.getNombreProducto(), cantidad, calcularSubTotal());
    }
}
