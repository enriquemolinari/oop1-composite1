package compras;

public interface Categoria {
    void visit(ProductoFisico productoFisico);

    void visit(ServicioDigital servicioDigital);

    float impuestos();

    float envio();
}
