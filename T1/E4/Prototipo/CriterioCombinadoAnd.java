public class CriterioCombinadoAnd extends CriterioCombinado {
    public CriterioCombinadoAnd(CriterioBusqueda primer, CriterioBusqueda segundo) {
        super(primer, segundo);
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return primerCriterio.cumple(pelicula) && segundoCriterio.cumple(pelicula);
    }
}
