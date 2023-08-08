package Exercicio3;

import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os três números são iguais.");
        } else {
            double maiorNumero = Math.max(numero1, Math.max(numero2, numero3));
            System.out.println("O maior número é: " + maiorNumero);
        }

        scanner.close();
    }
}
