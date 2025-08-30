package Prototipo;

import java.util.List;

public abstract class Expresion {

    public abstract float evaluar();

    public abstract String imprimir();

    public abstract Expresion getCopia();

    public abstract Expresion getOpuesta();

    public abstract List<Constante> getNumeros();

    public abstract List<Operador> getOperadores();

    public abstract Expresion getNormalizada(Operador operador, Expresion expresion);
}