import java.util.List;

public class CriterioActores extends CriterioBusqueda {
    private List<String> actores;

    public CriterioActores(List<String> actores) {
        this.actores = actores;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        for (String actor : actores) {
            if (!pelicula.participaActor(actor)) {
                return false;
            }
        }
        return true;
    }
}
