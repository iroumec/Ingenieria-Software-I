public class CriterioDirector extends CriterioBusqueda {
    private String director;

    public CriterioDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.esDirigidaPor(director);
    }
}
