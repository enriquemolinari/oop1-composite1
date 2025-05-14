package compras;

public class Cliente {
    private String nombre;
    private Categoria categoria;

    public Cliente(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
    public void visit(ProductoFisico productoFisico) {
        this.categoria.visit(productoFisico);
    }

    public void visit(ServicioDigital servicioDigital) {
        this.categoria.visit(servicioDigital);
    }

    float totalImpuesto() {
        return categoria.impuestos();
    }

    float totalEnvio() {
        return categoria.envio();
    }
}
