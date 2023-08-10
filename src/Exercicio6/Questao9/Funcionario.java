package Exercicio6.Questao9;

import Exercicio6.Questao8.Comissao;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private int rendaBasica = 1000;
    private int rendaTotal;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = rendaBasica;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public int getRendaTotal() { return rendaTotal + comissao.calcularAdicional(); }

    public int getRendaBasica() {
        return rendaBasica;
    }

    public void aplicarAumentoRenda(double percentual) {
        rendaTotal *= (1.0 + percentual);
    }

    public void setComissao(Comissao comissao) { this.comissao = comissao; }

    public Comissao getComissao() { return comissao; }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nComissão: " + comissao.calcularAdicional() + "\nSalário Total: " + getRendaTotal();
    }

}

