public class CriterioNot extends CriterioBusqueda {
    private CriterioBusqueda criterio;

    public CriterioNot(CriterioBusqueda criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return !criterio.cumple(pelicula);
    }
}
