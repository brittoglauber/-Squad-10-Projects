package Exercicio6.Questao6;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escola;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        aplicarAumentoRenda(0.10);
    }

    public String getEscola() {
        return escola;
    }

}
