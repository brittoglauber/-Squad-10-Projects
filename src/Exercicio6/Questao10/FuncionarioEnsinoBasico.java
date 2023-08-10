package Exercicio6.Questao10;

import Exercicio6.Questao9.Funcionario;

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
