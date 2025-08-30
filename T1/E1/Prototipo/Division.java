package Prototipo;

public class Division extends Operador {

    private static Division INSTANCE;

    private Division() {
        // Intentionally empty.
    }

    public static Division getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Division();
        }

        return INSTANCE;
    }

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return primerTermino.evaluar() / segundoTermino.evaluar();
    }

    public Operador getOpuesto() {
        return Multiplicacion.getInstance();
    }

    public String getSimbolo() {
        return "/";
    }
}
