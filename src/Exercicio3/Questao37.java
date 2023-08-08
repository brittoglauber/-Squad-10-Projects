package Exercicio3;

import java.util.Scanner;
public class Questao37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
