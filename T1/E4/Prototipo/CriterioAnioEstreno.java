public class CriterioAnioEstreno extends CriterioBusqueda {
    private int anio;
    private Comparador comparador;

    public CriterioAnioEstreno(int anio, Comparador comparador) {
        this.anio = anio;
        this.comparador = comparador;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return comparador.comparar(pelicula.getAnioEstreno(), anio);
    }
}
