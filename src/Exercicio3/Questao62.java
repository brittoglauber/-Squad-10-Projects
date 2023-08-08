package Exercicio3;

import java.util.Scanner;

public class Questao62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = scanner.nextInt();

        for (int i = 1; i <= numLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}