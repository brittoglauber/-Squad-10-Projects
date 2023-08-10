package Exercicio6.Questao6;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
        aplicarAumentoRenda(1.00);
    }
    public String getUniversidade() {
        return universidade;
    }
}

