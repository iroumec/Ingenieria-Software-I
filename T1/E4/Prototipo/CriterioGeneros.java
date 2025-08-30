import java.util.List;

public class CriterioGeneros extends CriterioBusqueda {
    private List<String> generos;

    public CriterioGeneros(List<String> generos) {
        this.generos = generos;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        for (String genero : generos) {
            if (!pelicula.contieneGenero(genero)) {
                return false;
            }
        }
        return true;
    }
}
