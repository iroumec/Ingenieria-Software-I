package Prototipo;

public class Division {

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
