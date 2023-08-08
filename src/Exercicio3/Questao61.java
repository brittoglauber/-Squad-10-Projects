package Exercicio3;

import java.util.Scanner;

public class Questao61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {

            for (int asterisco = 1; asterisco <= i ; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}