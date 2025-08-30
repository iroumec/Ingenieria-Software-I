import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioEstreno;
    private double duracion;
    private int edadMinima;
    private String director;
    @SuppressWarnings("unused")
    private String sinopsis;
    private List<String> generos;
    private List<String> actores;

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public double getDuracion() {
        return duracion;
    }

    public boolean participaActor(String actor) {
        return actores != null && actores.contains(actor);
    }

    public boolean contieneGenero(String genero) {
        return generos != null && generos.contains(genero);
    }

    public boolean esRentable(CriterioBusqueda criterio) {
        return criterio.cumple(this);
    }

    public boolean esDirigidaPor(String director) {
        return this.director != null && this.director.equalsIgnoreCase(director);
    }

    public boolean tituloContienePalabra(String palabra) {
        return titulo != null && titulo.toLowerCase().contains(palabra.toLowerCase());
    }
}
