package Exercicio3;

import java.util.Scanner;

public class Questao46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações das 200 pessoas");
        int qteHomensMaiorDeIdade = 0, qteMulheresMaiorDeIdade = 0;

        for (int i = 0; i < 200; i++) {
            System.out.println("Idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();
            System.out.println("Gênero da pessoa (M para masculino, F para feminino)");
            char genero = scanner.next().charAt(0);

            if (idade >= 18) {
                if (genero == 'M' || genero == 'm') {
                    qteHomensMaiorDeIdade++;
                } else if (genero == 'F' || genero == 'f') {
                    qteMulheresMaiorDeIdade++;
                }
            }
        }
        System.out.println("Quantidade de homens maiores de idade: " + qteHomensMaiorDeIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + qteMulheresMaiorDeIdade);
    }
}
