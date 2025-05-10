package LaserX;

public class EmpleadoRegular implements Empleado {
    private final String nombre;
    private float salario;

    public EmpleadoRegular(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public float salario() {
        return this.salario;
    }

    @Override
    public float calcularSalario() {
        return this.salario;
    }
}
