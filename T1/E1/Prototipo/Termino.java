import java.util.ArrayList;
import java.util.List;

public class Termino extends Expresion {

    private Expresion primerTermino, segundoTermino;
    private Operador operador;

    Termino(Expresion primerTermino, Expresion segundoTermino, Operador operador) {
        this.primerTermino = primerTermino;
        this.segundoTermino = segundoTermino;
        this.operador = operador;
    }

    public float evaluar() {
        return operador.getResultado(this.primerTermino.evaluar(), this.segundoTermino.evaluar());
    }

    public List<Float> getNumeros() {
        List<Float> out = new ArrayList<>(this.primerTermino.getNumeros());
        out.addAll(this.segundoTermino.getNumeros());
        return out;
    }

    public List<Operador> getOperadores() {
        List<Operador> out = new ArrayList<>(this.primerTermino.getOperadores());
        out.add(this.operador);
        out.addAll(this.segundoTermino.getOperadores());
        return out;
    }

    public String imprimir() {
        return "("
                + this.primerTermino.imprimir()
                + this.operador.getSimbolo()
                + this.segundoTermino.imprimir()
                + ")";
    }

    public Expresion getCopia() {
        return new Termino(
                this.primerTermino.getCopia(),
                this.segundoTermino.getCopia(),
                this.operador());
    }

    public Expresion getOpuesta() {
        return new Termino(
                this.primerTermino.getOpuesta(),
                this.segundoTermino.getOpuesta(),
                this.operador.getOpuesto());
    }

    public Expresion getNormalizada(Operador operador, Expresion expresion) {
        return new Termino(
                this.primerTermino.getNormalizada(operador, expresion),
                this.segundoTermino.getNormalizada(operador, expresion),
                this.operador);
    }
}
