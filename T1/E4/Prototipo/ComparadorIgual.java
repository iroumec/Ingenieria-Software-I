public class ComparadorIgual extends Comparador {
    private static final ComparadorIgual INSTANCE = new ComparadorIgual();

    private ComparadorIgual() {
    }

    public static ComparadorIgual getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean comparar(int v1, int v2) {
        return v1 == v2;
    }

    @Override
    public boolean comparar(double v1, double v2) {
        return v1 == v2;
    }
}
