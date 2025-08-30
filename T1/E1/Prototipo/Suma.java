package Prototipo;

public class Suma extends Operador {

    public float getResultado(Expresion primerTermino, Expresion segundoTermino) {
        return primerTermino.evaluar() + segundoTermino.evaluar();
    }

    public Operador getOpuesto() {
        return Resta.getInstance();
    }

    public getSimbolo() {
		return "+";
    }

}
