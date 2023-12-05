public class TorreHanoiTeste {
    @Test
    TorreHanoi hanoi = new TorreHanoi();
    hanoi.qtdMovimento(-1);

    hanoi.qtdMovimento(600); // > 7

    hanoi.qtdMovimento(0);
}
