package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.print("Digite o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.print("Digite o valor de incremento em reais: ");
        double incremento = scanner.nextDouble();

        System.out.print("Digite o valor de 1 dólar em reais: ");
        double valorDolar = scanner.nextDouble();

        System.out.println("\nTabela de Conversão de Reais para Dólares:");
        System.out.println("---------------------------------------");
        System.out.println("Reais\t\tDólares");

        for (double reais = valorInicial; reais <= valorFinal; reais += incremento) {
            double dolares = reais / valorDolar;
            System.out.println(decimalFormat.format(reais) + "\t\t$" + decimalFormat.format(dolares));
        }

        scanner.close();
    }
}
