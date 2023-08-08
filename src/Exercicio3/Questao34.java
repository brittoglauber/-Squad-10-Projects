package Exercicio3;

import java.util.Random;

public class Questao34 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("50 números sorteados de 1 a 100:");

        for (int i = 0; i < 50; i++) {
            int numeroSorteado = random.nextInt(100) + 1;
            System.out.print(numeroSorteado + " ");
        }
    }
}
