package Prototipo;

import java.util.ArrayList;
import java.util.List;

public class Constante extends Expresion {

    private float valor;

    Constante(float valor) {
        this.valor = valor;
    }

    public float evaluar() {
        return valor;
    }

    public List<Constante> getNumeros() {
        List<Constante> out = new ArrayList<>();
        out.add(this);
        return out;
    }

    public List<Operador> getOperadores() {
        return new ArrayList<>();
    }

    public String imprimir() {
        return Float.toString(this.valor);
    }

    public Expresion getCopia() {
        return new Constante(this.valor);
    }

    public Expresion getOpuesta() {
        return new Constante(this.valor);
    }

    public Expresion getNormalizada(Operador operador, Expresion expresion) {
        float valorNormalizado = (new Termino(this, expresion, operador)).evaluar();
        return new Constante(valorNormalizado);
    }
}