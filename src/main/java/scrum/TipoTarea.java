package scrum;

public interface TipoTarea {
    boolean puedeContenerA(TipoTarea tipoTarea);

    boolean puedeSerContenidaPorHistoriaDeUsuario();

    boolean puedeSerContenidaPorEpica();

    boolean puedeSerCompleja();

    boolean puedeSerSimple();
}

