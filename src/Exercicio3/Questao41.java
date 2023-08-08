package Exercicio3;

import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 100:");

        int numeroSorteado = (int) (Math.random() * 101);
        int qteTentativas = 0;

        while (true) {
            qteTentativas++;

            int numChute = scanner.nextInt();

            if (numChute < numeroSorteado) {
                System.out.println("O número sorteado é maior do que o que você inseriu, digite outro número:");
            } else if (numChute > numeroSorteado) {
                System.out.println("O número sorteado é menor do que o que você inseriu, digite outro número:");
            } else {
                System.out.println("Parabéns! Você acertou o número sorteado " + numeroSorteado + " em " + qteTentativas + " tentativas");
                break;
            }
        }
    }
}
