package modelo;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private float precio;

    public Producto(int idProducto, String nombreProducto, float precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("Producto { ID: %d, Nombre: %s, Precio: %.2f }", idProducto, nombreProducto, precio);
    }
}