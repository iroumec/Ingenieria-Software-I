package Prototipo;

public class Resta extends Operador {

    private static Resta INSTANCE;

    private Resta() {
        // Intentionally empty.
    }

    public static Resta getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Resta();
        }

        return INSTANCE;
    }

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return primerTermino.evaluar() - segundoTermino.evaluar();
    }

    public Operador getOpuesto() {
        return Suma.getInstance();
    }

    public String getSimbolo() {
        return "-";
    }
}