package Exercicio3;

import java.util.Scanner;

public class Questao51 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long primeiroTermo = 1, segundoTermo = 1, terceiroTermo = 2;

        System.out.println("Digite um valor de n para obter os n primeiros termos da sequência de Tribonacci: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(primeiroTermo);

            long proximoTermo = primeiroTermo + segundoTermo + terceiroTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = terceiroTermo;
            terceiroTermo = proximoTermo;
        }

    }
}

