package Exercicio5;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public double getValorProducao(){
        return valorProducao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = valorProducao * 0.1; //A comissão equivale a 10% do valor de produção.
    }

    @Override
    public double calcularSalario() {
        double salarioOperario = getSalarioBase() - (getSalarioBase() * (getImposto() / 100) + comissao);
        return salarioOperario;
    }
}
