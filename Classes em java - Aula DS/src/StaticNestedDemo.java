class Empresa {
    static class Departamento {
        private String nome;

        public Departamento(String nome) {
            this.nome = nome;
        }

        public void mostrar() {
            System.out.println("Departamento: " + nome);
        }
    }
}

public class StaticNestedDemo {
    static void main(String[] args) {
        Empresa.Departamento setor = new Empresa.Departamento("Financeiro");
        setor.mostrar();
    }
}
