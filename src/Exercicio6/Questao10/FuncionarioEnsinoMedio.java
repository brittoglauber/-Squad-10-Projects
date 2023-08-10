package Exercicio6.Questao10;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        aplicarAumentoRenda(0.50);
    }
}
