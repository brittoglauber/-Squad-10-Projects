package Exercicio3;

import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        boolean ehPerfeito = verificarPerfeito(numero);

        if (ehPerfeito) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }

    public static boolean verificarPerfeito(int n) {
        if (n <= 1) {
            return false;
        }
        int somaDivisores = 1; // Começamos com 1 porque todo número é divisível por 1

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == n;
    }
}
