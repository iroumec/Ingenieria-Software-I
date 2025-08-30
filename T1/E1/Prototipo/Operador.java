package Prototipo;

public abstract class Operador {

    public abstract float getResultado(Expresion primerTermino, Expresion segundoTermino);

    public abstract Operador getOpuesto();

    public abstract String getSimbolo();
}
