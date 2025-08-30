package Prototipo;

public class Potencia extends Operador {

    private static Potencia INSTANCE;

    private Potencia() {
        // Intentionally empty.
    }

    public static Potencia getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Potencia();
        }

        return INSTANCE;
    }

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return (float) Math.pow(primerTermino.evaluar(), segundoTermino.evaluar());
    }

    public Operador getOpuesto() {
        return Raiz.getInstance();
    }

    public String getSimbolo() {
        return "^";
    }
}