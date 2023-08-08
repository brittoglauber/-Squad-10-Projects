package Exercicio3;

import java.util.Scanner;

public class Questao64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de triângulos: ");
        int numTriangulos = scanner.nextInt();

        for (int t = 1; t <= numTriangulos; t++) {
            for (int i = 1; i <= t; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}