package Exercicio3;

import java.util.Scanner;

public class Questao44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaNumeros = 0;
        double mediaNumeros;

        System.out.print("Digite quantos números você quer digitar: ");
        int qteNumeros = scanner.nextInt();

        for (int i = 0; i < qteNumeros; i++) {
            int num = scanner.nextInt();

            somaNumeros += num;
        }

        mediaNumeros = (double) somaNumeros / qteNumeros;
        System.out.println("A média aritmética entre os " + qteNumeros + " números é: " + mediaNumeros);
    }
}



