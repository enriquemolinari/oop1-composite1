package compras;

public interface Producto {

    float precio();

    float costoEnvio(TipoCliente tipo);

    float impuesto(TipoCliente tipo);
}
