package Exercicio6.Questao10;

import Exercicio6.Questao9.Funcionario;
import Exercicio6.Questao8.Comissao;
import Exercicio6.Questao8.Gerente;
import Exercicio6.Questao8.Supervisor;
import Exercicio6.Questao8.Vendedor;

public class EmpresaMain {

    public static void main(String[] args) {

        final int NUM_FUNCIONARIOS = 10;
        final int NUM_GERENTES = (int) (NUM_FUNCIONARIOS * 0.1);
        final int NUM_SUPERVISORES = (int) (NUM_FUNCIONARIOS * 0.2);

        Comissao comissaoGerente = new Gerente();
        Comissao comissaoSupervisor = new Supervisor();
        Comissao comissaoVendedor = new Vendedor();

        Funcionario[] funcionarios = new Funcionario[NUM_FUNCIONARIOS];

        final int NUM_BASICO = (int) (NUM_FUNCIONARIOS * 0.4);
        final int NUM_MEDIO = (int) (NUM_FUNCIONARIOS * 0.4);
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
        // Atribui as comissões de acordo com a proporção proposta
        for (int i = 0; i < NUM_GERENTES; i++) {
            funcionarios[i].setComissao(comissaoGerente);
        }
        for (int i = NUM_GERENTES; i < NUM_GERENTES + NUM_SUPERVISORES; i++) {
            funcionarios[i].setComissao(comissaoSupervisor);
        }
        for (int i = NUM_GERENTES + NUM_SUPERVISORES; i < NUM_FUNCIONARIOS; i++) {
            funcionarios[i].setComissao(comissaoVendedor);
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

        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;
        // Percorre a lista de funcionarios verificando a comissão de cada instância e calculando o custo
        for (Funcionario func : funcionarios) {

            if (func.getComissao() instanceof Gerente) {
                custoGerentes += comissaoGerente.calcularAdicional();
            } else if (func.getComissao() instanceof Supervisor) {
                custoSupervisores += comissaoSupervisor.calcularAdicional();
            } else if (func.getComissao() instanceof Vendedor) {
                custoVendedores += comissaoVendedor.calcularAdicional();
            }
        }

        System.out.println("Custo por nível de cargo:");
        System.out.println("Gerentes: " + custoGerentes);
        System.out.println("Supervisores: " + custoSupervisores);
        System.out.println("Vendedores: " + custoVendedores);

        System.out.println("\nCusto total por nível de escolaridade:");
        System.out.println("Ensino básico: " + custoBasico);
        System.out.println("Ensino médio: " + custoMedio);
        System.out.println("Nível superior: " + custoSuperior);

        System.out.println("\nCusto total da empresa: " + custoTotal);

    }
}