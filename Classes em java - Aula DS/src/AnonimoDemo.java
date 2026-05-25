interface Saudacao {
    void mostrarMensagem();
}

public class AnonimoDemo {
    static void main(String[] args) {
        Saudacao s = new Saudacao() {
            @Override
            public void mostrarMensagem() {
                System.out.println("olá, usuário!! Essa mensagem é fruto de uma class anônima.");
            }
        };

        s.mostrarMensagem();
    }
}
