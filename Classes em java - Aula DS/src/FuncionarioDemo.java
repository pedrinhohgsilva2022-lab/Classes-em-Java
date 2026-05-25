abstract class Funcionario {
    protected String nome;

    public Funcionario (String nome) {
        this.nome = nome;
    }

    public void mostrarNome() {
        System.out.println("Funcionario: " + nome);
    }

    public abstract double calcularSalario();
}

class FuncionarioCLT extends Funcionario {
    private double salarioBase;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}

public class FuncionarioDemo {
    static void main(String[] args) {
        Funcionario func = new FuncionarioCLT ("Pedro", 4200.0);
        func.mostrarNome();
        System.out.println("Salario do funcionário: R$ " + func.calcularSalario());
    }
}
