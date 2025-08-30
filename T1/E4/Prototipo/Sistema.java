import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Pelicula> peliculas;
    public static final Sistema INSTANCE = new Sistema();

    private Sistema() {
        this.peliculas = new ArrayList<>();
    }

    public List<Pelicula> buscar(CriterioBusqueda criterio) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (criterio.cumple(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }
}
