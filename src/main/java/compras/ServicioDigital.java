package compras;

public class ServicioDigital implements Producto {
    private float precio;
    private String nombre;
    private float iva;

    public ServicioDigital(String nombre, float precio, float iva) {
        this.precio = precio;
        this.nombre = nombre;
        this.iva = iva;
    }

    @Override
    public float precio() {
        return this.precio;
    }

    @Override
    public float costoEnvio(TipoCliente tipo) {
        return 0;
    }

    @Override
    public float impuesto(TipoCliente tipo) {
        if (tipo.equals(TipoCliente.REGULAR)) {
            return this.precio * 0.10f;
        }
        return 0;
    }
}
