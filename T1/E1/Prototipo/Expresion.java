package Prototipo;

public abstract class Expresion {

    public abstract Expresion getCopia();

    public abstract Expresion getOpuesta();

    public abstract Expresion getNormalizada(Operador operador, Expresion expresion);
}