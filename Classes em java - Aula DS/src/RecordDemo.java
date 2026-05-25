record Aluno (String nome, int idade) {
    public Aluno {
        if (idade < 0) {
            throw new IllegalArgumentException("O valor Idade não pode ser negativo!");
        }
    }
}

public class RecordDemo {
    static void main(String[] args) {
        Aluno info = new Aluno ("Pedro", 16);

        System.out.println("Nome: " + info.nome());
        System.out.println("Idade: " + info.idade());
        System.out.println(info);
    }
}
