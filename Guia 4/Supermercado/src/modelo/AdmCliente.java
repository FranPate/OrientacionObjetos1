package modelo;

import java.util.ArrayList;
import java.util.List;

public class AdmCliente {

    private List<Cliente> lstCliente;

    public AdmCliente() {
        this.lstCliente = new ArrayList<>();
    }

    public boolean agregarCliente(String nombre, long dni, String direccion) {
        for (Cliente cliente : lstCliente) {
            if (cliente.getDni() == dni) {
                throw new IllegalArgumentException("El cliente con DNI " + dni + " ya existe.");
            }
        }
        Cliente nuevoCliente = new Cliente(lstCliente.size() + 1, nombre, dni, direccion);
        lstCliente.add(nuevoCliente);
        return true;
    }

    public Cliente traerCliente(int idCliente) {
        for (Cliente cliente : lstCliente) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    // TODO
    public boolean eliminarCliente(int idCliente) {
        Cliente clienteAEliminar = null;

        for (Cliente cliente : lstCliente) {
            if (cliente.getIdCliente() == idCliente) {
                clienteAEliminar = cliente;
                return true;
            }
        }

        if (clienteAEliminar == null) {
            throw new IllegalArgumentException("El cliente con ID " + idCliente + " no existe.");
        }

        boolean tieneCarritosAsociados = false;
        for (Carrito carrito : ) {
            if (carrito.getCliente().equals(clienteAEliminar)) {
                tieneCarritosAsociados = true;
            }
        }

        if (tieneCarritosAsociados) {
            throw new IllegalArgumentException("El cliente tiene carritos asociados y no se puede eliminar.");
        }

        return lstCliente.remove(clienteAEliminar);
    }

    @Override
    public String toString() {
        return "AdmCliente{" +
                "lstCliente=" + lstCliente +
                '}';
    }
}
