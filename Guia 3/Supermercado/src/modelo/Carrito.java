package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private int idCarrito;
    private LocalDate fecha;
    private LocalTime hora;
    private List<ItemCarrito> items;

    public Carrito(int idCarrito) {
        this.idCarrito = idCarrito;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.items = new ArrayList<>();
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public boolean agregarItem(Producto producto, int cantidad) {
        for (ItemCarrito item : items) {
            if (item.getProducto().getIdProducto() == producto.getIdProducto()) {
                item.setCantidad(item.getCantidad() + cantidad);
                return true;
            }
        }
        items.add(new ItemCarrito(items.size() + 1, producto, cantidad));
        return true;
    }

    public boolean eliminarItem(int idProducto, int cantidad) {
        for (ItemCarrito item : items) {
            if (item.getProducto().getIdProducto() == idProducto) {
                if (cantidad >= item.getCantidad()) {
                    items.remove(item);
                } else {
                    item.setCantidad(item.getCantidad() - cantidad);
                }
                return true;
            }
        }
        return false; // El producto no se encontró en el carrito
    }

    public float calcularSubTotal() {
        float subTotal = 0;
        for (ItemCarrito item : items) {
            subTotal += item.calcularSubTotal();
        }
        return subTotal;
    }

    public float calcularTotal() {
        // En este caso, el total es el mismo que el subtotal, 
        // pero este método puede ser modificado para aplicar descuentos o impuestos.
        return calcularSubTotal();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrito {\n");
        sb.append("  ID Carrito: ").append(idCarrito).append("\n");
        sb.append("  Fecha: ").append(fecha).append("\n");
        sb.append("  Hora: ").append(hora).append("\n");
        sb.append("  Items:\n");
        for (ItemCarrito item : items) {
            sb.append("    ").append(item).append("\n");
        }
        sb.append("  Total: ").append(String.format("%.2f", calcularTotal())).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
