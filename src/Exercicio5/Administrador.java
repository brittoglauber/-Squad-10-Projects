package Exercicio5;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioAdministrador = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + ajudaDeCusto;
        return salarioAdministrador;
    }
}
