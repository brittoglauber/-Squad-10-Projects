package Exercicio6.Questao6;

public class EmpresaMain {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 123);
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Maria", 456, "Escola Centro Educacional Monteiro Lobato");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Carlos", 789, "Escola Ari de Sá");
        FuncionarioGraduacao funcionario4 = new FuncionarioGraduacao("Ana", 101, "Escola DEF", "Universidade Federal da Bahia");

        // Exibir informações dos funcionários
        System.out.println(funcionario1.getNome() + " - Código: " + funcionario1.getCodigoFuncional());
        System.out.println(funcionario2.getNome() + " - Código: " + funcionario2.getCodigoFuncional() + " - Escola: " + funcionario2.getEscola() + "Renda total após ensino básico: " + funcionario2.getRendaTotal());
        System.out.println(funcionario3.getNome() + " - Código: " + funcionario3.getCodigoFuncional() + " - Escola: " + funcionario3.getEscola() + "Renda total após ensino médio: " + funcionario3.getRendaTotal());
        System.out.println(funcionario4.getNome() + " - Código: " + funcionario4.getCodigoFuncional() + " - Escola: " + funcionario4.getEscola() + " - Universidade: " + funcionario4.getUniversidade() + "Renda total após graduação: " + funcionario4.getRendaTotal());
    }
}


