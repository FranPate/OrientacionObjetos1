package modelo;
import java.util.ArrayList;
import java.util.List;

public class AdmProducto {
    private List<Producto> lstProducto;

    public AdmProducto() {
        this.lstProducto = new ArrayList<>();
    }

	public List<Producto> getLstProducto() {
		return lstProducto;
	}

	public void setLstProducto(List<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}
    
	public boolean agregarProducto(String nombreProducto, float precio) {
	    for (Producto producto : lstProducto) {
	        if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
	            throw new IllegalArgumentException("El producto ya existe en la lista.");
	        }
	    }
	    Producto nuevoProducto = new Producto(lstProducto.size() + 1, nombreProducto, precio);
	    return lstProducto.add(nuevoProducto);
	}
	
	public Producto traerProducto(int idProducto) {
	    // Buscar el producto por ID
	    for (Producto producto : lstProducto) {
	        if (producto.getIdProducto() == idProducto) {
	            return producto;
	        }
	    }
	    return null; // Producto no encontrado
	}
	
	public boolean eliminarProducto(int idProducto) {
	    Producto producto = traerProducto(idProducto); // Reutiliza el método traerProducto
	    if (producto == null) {
	        throw new IllegalArgumentException("El producto no existe en la lista.");
	    }
	    return lstProducto.remove(producto);
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("AdmProducto { \n");
	    for (Producto producto : lstProducto) {
	        sb.append(producto).append("\n");
	    }
	    sb.append("}");
	    return sb.toString();
	}
}