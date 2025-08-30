public class CriterioCombinadoOr extends CriterioCombinado {
    public CriterioCombinadoOr(CriterioBusqueda primer, CriterioBusqueda segundo) {
        super(primer, segundo);
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return primerCriterio.cumple(pelicula) || segundoCriterio.cumple(pelicula);
    }
}
