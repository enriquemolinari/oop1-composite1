package modelo;

public interface Cargo {
    boolean puedeSerJefeDe(Cargo cargo);

    boolean puedeSerSubordinadoDeDirector();

    boolean puedeSerSubordinadoDeMandoMedio();

    boolean puedeSerSubordinadorDeJunior();
}
