public class CriterioDuracion extends CriterioBusqueda {
    private double duracion;
    private Comparador comparador;

    public CriterioDuracion(double duracion, Comparador comparador) {
        this.duracion = duracion;
        this.comparador = comparador;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return comparador.comparar(pelicula.getDuracion(), duracion);
    }
}
