package Exercicio3;

import java.util.Scanner;

public class Questao50 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long primeiroTermo = 1, segundoTermo = 1;

        System.out.println("Digite um valor de n para obter o n-ésimo termo da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " +primeiroTermo);
            }

            long proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}

