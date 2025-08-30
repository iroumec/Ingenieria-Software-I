public class ComparadorMenor extends Comparador {
    private static final ComparadorMenor INSTANCE = new ComparadorMenor();

    private ComparadorMenor() {
    }

    public static ComparadorMenor getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean comparar(int v1, int v2) {
        return v1 < v2;
    }

    @Override
    public boolean comparar(double v1, double v2) {
        return v1 < v2;
    }
}
