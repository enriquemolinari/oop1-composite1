package compras;

public class Corporativo implements Categoria {
    @Override
    public float impuestoServicioDigital(float precio) {
        return 0;
    }

    @Override
    public float costoEnvioProductoFisico(float costo) {
        return costo - (costo * 0.5f);
    }
}
