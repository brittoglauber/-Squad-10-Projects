package Exercicio6.Questao6;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private int rendaBasica = 1000;
    private int rendaTotal;

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

    public int getRendaTotal() { return rendaTotal; }

    public int getRendaBasica() { return rendaBasica; }

    public void aplicarAumentoRenda(double percentual) { rendaTotal *= (1.0 + percentual);}

}

