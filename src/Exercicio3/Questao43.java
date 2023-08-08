package Exercicio3;

import java.util.Scanner;

public class Questao43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaNumeros = 0, qteNumeros = 0;
        double mediaNumeros;


        System.out.println("Digite 500 números para calcular a média aritmética entre eles");
        for (int i = 0; i < 500; i++) {
            int num = scanner.nextInt();

            somaNumeros += num;
            qteNumeros++;
        }

        mediaNumeros = (double) somaNumeros / qteNumeros;
        System.out.println("A média aritmética entre os 500 números é: " + mediaNumeros);
    }
}
