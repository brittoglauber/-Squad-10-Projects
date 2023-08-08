package Exercicio3;

import java.util.Scanner;

public class Questao65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = scanner.nextInt();

        for (int i = 1; i <= numLinhas; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}