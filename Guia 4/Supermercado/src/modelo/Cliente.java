package modelo;

public class Cliente {
    private int idCliente;
    private String nombre;
    private long dni;
    private String direccion;

    public Cliente(int idCliente, String nombre, long dni, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return String.format(
            "Cliente {\n" +
            "  ID: %d\n" +
            "  Nombre: %s\n" +
            "  DNI: %d\n" +
            "  Dirección: %s\n" +
            "}", idCliente, nombre, dni, direccion);
    }
}
