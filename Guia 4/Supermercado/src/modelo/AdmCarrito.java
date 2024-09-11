package modelo;

import java.util.ArrayList;
import java.util.List;

public class AdmCarrito {
    private List<Carrito> lstCarrito;

    public AdmCarrito() {
        this.lstCarrito = new ArrayList<>();
    }

    public boolean agregarCarrito(Cliente cliente) {
        for (Carrito carrito : lstCarrito) {
            if (carrito.getCliente().equals(cliente)) {
                throw new IllegalArgumentException("El carrito ya existe.");
            }
        }
        Carrito nuevoCarrito = new Carrito(lstCarrito.size() + 1, cliente);
        return lstCarrito.add(nuevoCarrito);
    }

    public Carrito traerCarrito(int idCarrito) {
        for (Carrito carrito : lstCarrito) {
            if (carrito.getIdCarrito() == idCarrito) {
                return carrito;
            }
        }
        return null;
    }

    public boolean eliminarCarrito(int idCarrito) {
        Carrito carrito = traerCarrito(idCarrito);
        if (carrito == null) {
            throw new IllegalArgumentException("El carrito no existe.");
        }
        return lstCarrito.remove(carrito);
    }

    @Override
    public String toString() {
        return "AdmCarrito{" +
                "lstCarrito=" + lstCarrito +
                '}';
    }
}
