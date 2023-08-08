package Exercicio3;

import java.util.Scanner;

public class Questao45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNum = 0;

        System.out.println("Digite 100 números e diremos qual é o maior");

        for (int i = 0; i < 100; i++) {
            int num = scanner.nextInt();
            maiorNum = Math.max(num, maiorNum);
        }
        System.out.println("\nO maior valor informado dentre esses 100 números é: " + maiorNum);
    }
}
