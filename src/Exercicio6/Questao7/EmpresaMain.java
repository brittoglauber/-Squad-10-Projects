package Exercicio6.Questao7;

import Exercicio6.Questao6.Funcionario;
import Exercicio6.Questao6.FuncionarioEnsinoBasico;
import Exercicio6.Questao6.FuncionarioEnsinoMedio;
import Exercicio6.Questao6.FuncionarioGraduacao;

public class EmpresaMain {

    public static void main(String[] args) {

        final int NUM_FUNCIONARIOS = 10;
        final int NUM_BASICO = (int) (NUM_FUNCIONARIOS * 0.4);
        final int NUM_MEDIO = (int) (NUM_FUNCIONARIOS * 0.4);

        Funcionario[] funcionarios = new Funcionario[NUM_FUNCIONARIOS];
        // Cria instancias de funcionarios de acordo com a proporção proposta
        for (int i = 0; i < NUM_BASICO; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("FuncionarioBasico" + i, i + 1, "Escola Centro Educacional Monteiro Lobato");
        }
        for (int i = NUM_BASICO; i < NUM_BASICO + NUM_MEDIO; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("FuncionarioMedio" + i, i + 1, "Escola Ari de Sá");
        }
        for (int i = NUM_BASICO + NUM_MEDIO; i < NUM_FUNCIONARIOS; i++) {
            funcionarios[i] = new FuncionarioGraduacao("FuncionarioSuperior" + i, i + 1, "Escola DEF", "Universidade Federal da Bahia");
        }

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;
        // Percorre a lista de funcionarios verificando o tipo de cada instância e calculando o custo
        for (Funcionario func : funcionarios) {
            custoTotal += func.getRendaTotal();

            if (func instanceof FuncionarioGraduacao) {
                custoSuperior += func.getRendaTotal();
            } else if (func instanceof FuncionarioEnsinoMedio) {
                custoMedio += func.getRendaTotal();
            } else if (func instanceof FuncionarioEnsinoBasico){
                custoBasico += func.getRendaTotal();
            }
        }

        System.out.println("Custo total da empresa: " + custoTotal);
        System.out.println("Custo total por nível de escolaridade:");
        System.out.println("Ensino básico: " + custoBasico);
        System.out.println("Ensino médio: " + custoMedio);
        System.out.println("Nível superior: " + custoSuperior);
    }

}

