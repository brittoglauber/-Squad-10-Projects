package Exercicio3;
import java.util.Scanner;

public class Questao21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o cargo e o salário do funcionário
        System.out.print("Digite o cargo do funcionário (Diretoria, Gerência, Operacional): ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Calcula o valor de empréstimo com base no cargo
        double percentual;
        if (cargo.equalsIgnoreCase("Diretoria")) {
            percentual = 0.3;
        } else if (cargo.equalsIgnoreCase("Gerência")) {
            percentual = 0.25;
        } else if (cargo.equalsIgnoreCase("Operacional")) {
            percentual = 0.2;
        } else {
            System.out.println("Cargo inválido. O empréstimo não pode ser calculado.");
            return;
        }

        double valorEmprestimo = salario * percentual;

        // Exibe o valor de empréstimo possível
        System.out.println("O valor de empréstimo possível para um funcionário de " + cargo +
                " com salário de R$" + salario + " é R$" + valorEmprestimo);

        scanner.close();
    }
}
