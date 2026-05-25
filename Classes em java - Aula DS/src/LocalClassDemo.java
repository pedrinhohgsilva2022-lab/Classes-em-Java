class Relatorio {
    public void gerar() {
        class Cabecalho {
            private String titulo;

            public Cabecalho(String titulo) {
                this.titulo = titulo;
            }

            public void mostrar() {
                System.out.println("===" + titulo + "===");
            }
        }

        Cabecalho top = new Cabecalho(" Relatório de vendas mensal ");
        top.mostrar();
        System.out.println("Conteúdo do relatório...");
    }
}

public class LocalClassDemo {
    static void main(String[] args) {
        Relatorio exibir = new Relatorio();
        exibir.gerar();
    }
}
