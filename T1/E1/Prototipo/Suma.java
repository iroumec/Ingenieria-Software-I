package Prototipo;

public class Suma extends Operador {

    private static Suma INSTANCE;

    private Suma() {
        // Intentionally empty.
    }

    public static Suma getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Suma();
        }

        return INSTANCE;
    }

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return primerTermino.evaluar() + segundoTermino.evaluar();
    }

    public Operador getOpuesto() {
        return Resta.getInstance();
    }

    public String getSimbolo() {
        return "+";
    }
}