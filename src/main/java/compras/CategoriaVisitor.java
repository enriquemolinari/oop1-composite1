package compras;

public interface CategoriaVisitor {
    void visit(ProductoFisico productoFisico);

    void visit(ServicioDigital servicioDigital);
}
