public class CriterioEdadMinima extends CriterioBusqueda {
    private int edad;
    private Comparador comparador;

    public CriterioEdadMinima(int edad, Comparador comparador) {
        this.edad = edad;
        this.comparador = comparador;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return comparador.comparar(pelicula.getEdadMinima(), edad);
    }
}
