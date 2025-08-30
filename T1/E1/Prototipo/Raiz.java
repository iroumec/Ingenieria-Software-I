package Prototipo;

public class Raiz extends Operador {

    private static Raiz INSTANCE;

    private Raiz() {
        // Intentionally empty.
    }

    public static Raiz getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Raiz();
        }

        return INSTANCE;
    }

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return (float) Math.pow(primerTermino.evaluar(), 1 / segundoTermino.evaluar());
    }

    public Operador getOpuesto() {
        return Potencia.getInstance();
    }

    public String getSimbolo() {
        return "^-";
        // Poner "√" creo que sería poco claro, ya que habría que invertir el orden en
        // el que se muestran los términos.
    }
}