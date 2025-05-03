package modelo;

public class Director implements Cargo {

    @Override
    public boolean puedeSerJefeDe(Cargo cargo) {
        return cargo.puedeSerSubordinadoDeDirector();
    }

    @Override
    public boolean puedeSerSubordinadoDeDirector() {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDeMandoMedio() {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadorDeJunior() {
        return false;
    }
}
