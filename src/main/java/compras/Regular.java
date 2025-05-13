package compras;

public class Regular implements Categoria {
    @Override
    public float impuestoServicioDigital(float precio) {
        return precio * 0.10f;
    }

    @Override
    public float costoEnvioProductoFisico(float costo) {
        return costo;
    }
}
