final class UtilitarioMatematica {
    public int somar(int a, int b) {
        return a + b;
    }
}

public class FinalDemo {
    static void main(String[] args) {
        UtilitarioMatematica soma = new UtilitarioMatematica();
        System.out.println("Soma: " + soma.somar(15, 10));
    }
}
