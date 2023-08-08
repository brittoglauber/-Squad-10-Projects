package Exercicio3;
import java.util.Scanner;
public class Questao60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double valorDivida = input.nextDouble();

        System.out.print("Digite a taxa de correção mensal (%): ");
        double taxaCorrecao = input.nextDouble() / 100.0;

        System.out.print("Digite a quantidade de anos: ");
        int quantidadeAnos = input.nextInt();

        int quantidadeMeses = quantidadeAnos * 12;

        System.out.println("\nTabela de Evolução da Dívida:");
        System.out.println("Ano\tMês\tValor da Dívida");

        for (int ano = 0; ano <= quantidadeAnos; ano++) {
            for (int mes = 1; mes <= 12; mes++) {
                int mesTotal = (ano * 12) + mes;
                double valorCorrigido = valorDivida * Math.pow(1 + taxaCorrecao, mesTotal);

                System.out.printf("%d\t%d\t%.2f\n", ano, mes, valorCorrigido);
            }
        }
    }
}