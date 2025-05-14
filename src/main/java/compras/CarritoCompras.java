package compras;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private final Cliente cliente;
    private List<Producto> productos;

    public CarritoCompras(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public float calcularPrecio() {
        float total = 0;
        for (Producto producto : productos) {
            producto.accept(cliente);
        }
        return cliente.totalEnvio() + cliente.totalImpuesto();
    }
}
