package modelo;

public class Producto {
	// atributos
    private int idProducto;
    private String nombreProducto;
    private float precio;

    // contstructor
    public Producto(int idProducto, String nombreProducto, float precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    // metodos getter y setter
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
        return String.format(
            "Producto {\n" +
            "  ID: %d\n" +
            "  Nombre: %s\n" +
            "  Precio: %.2f\n" +
            "}", idProducto, nombreProducto, precio);
    }
}