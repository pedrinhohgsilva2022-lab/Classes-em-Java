class computador {
    private String marca;

    public computador (String marca) {
        this.marca = marca;
    }

    class processador {
        private String modelo;

        public processador(String modelo) {
            this.modelo = modelo;
        }

        public void mostrarDados() {
            System.out.println("Marca do computador: " + marca);
            System.out.println("Modelo do processador: " + modelo);
        }
    }
}

public class InnerClassDemo {
    static void main(String[] args) {
        computador componentes = new computador("Dell");

        computador.processador proc = componentes.new processador("Ryzen 5 5700x");
        proc.mostrarDados();
    }
}
