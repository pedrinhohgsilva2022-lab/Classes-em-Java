class ClassConcreta {
    private String nome;
    private int idade;

    public ClassConcreta(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome " + nome + ". idade: " + idade);
    }
}

public class PessoaDemo {
    public static void main(String[] args) {
        ClassConcreta people = new ClassConcreta("Pedro", 22);
        people.apresentar();
    }
}
