import java.util.List;

public class CriterioPalabrasEnTitulo extends CriterioBusqueda {
    private List<String> palabras;

    public CriterioPalabrasEnTitulo(List<String> palabras) {
        this.palabras = palabras;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        for (String palabra : palabras) {
            if (!pelicula.tituloContienePalabra(palabra)) {
                return false;
            }
        }
        return true;
    }
}
