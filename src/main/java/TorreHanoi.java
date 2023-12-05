import java.lang.Math;

public class TorreHanoi {
    private int numDisco;

    public double qtdMovimento(int numDisco) {
        double qtdMovimentoMin = Math.pow(2, numDisco) - 1;
        return qtdMovimentoMin;
    }
}
