package Exercicio3;

import java.util.Random;
import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite a quantidade de números a serem sorteados:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o valor mínimo da faixa de sorteio:");
        int minimo = scanner.nextInt();

        System.out.println("Digite o valor máximo da faixa de sorteio:");
        int maximo = scanner.nextInt();

        System.out.println(quantidade + " números sorteados da faixa " + minimo + " a " + maximo + ":");

        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = random.nextInt(maximo - minimo + 1) + minimo;
            System.out.print(numeroSorteado + " ");
        }

        scanner.close();
    }
}
