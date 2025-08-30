public class ComparadorMayor extends Comparador {
    private static final ComparadorMayor INSTANCE = new ComparadorMayor();

    private ComparadorMayor() {
    }

    public static ComparadorMayor getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean comparar(int v1, int v2) {
        return v1 > v2;
    }

    @Override
    public boolean comparar(double v1, double v2) {
        return v1 > v2;
    }
}
