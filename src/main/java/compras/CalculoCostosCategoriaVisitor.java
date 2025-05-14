package compras;

public interface CalculoCostosCategoriaVisitor extends CategoriaVisitor {
    float impuestos();

    float envio();
}
