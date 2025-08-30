package Prototipo;

public class Multiplicacion extends Operador {

    private static Multiplicacion INSTANCE;

    private Multiplicacion() {
        // Intentionally empty.
    }

    public static Multiplicacion getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Multiplicacion();
        }

        return INSTANCE;
    }

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return primerTermino.evaluar() * segundoTermino.evaluar();
    }

    public Operador getOpuesto() {
        return Division.getInstance();
    }

    public String getSimbolo() {
        return "/";
    }
}