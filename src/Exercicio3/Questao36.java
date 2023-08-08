package Exercicio3;

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Números ímpares entre " + numero1 + " e " + numero2 + ":");

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
