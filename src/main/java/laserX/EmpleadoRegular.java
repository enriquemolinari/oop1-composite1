package laserX;

public class EmpleadoRegular implements Empleado {
    private final String nombre;
    private float salario;
    private Cargo cargo;

    public EmpleadoRegular(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = Cargo.JUNIOR;
    }

    public float salario() {
        return this.salario;
    }

    @Override
    public float calcularSalario() {
        return this.salario;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }
}
