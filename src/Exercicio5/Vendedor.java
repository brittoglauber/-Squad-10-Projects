package Exercicio5;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public double getValorVendas(){
        return valorVendas;
    }


    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = valorVendas * 0.2; //A comissão equivale a 20% do valor de vendas.
    }

    @Override
    public double calcularSalario() {
        double salarioVendedor = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + comissao;
        return salarioVendedor;
    }
}
