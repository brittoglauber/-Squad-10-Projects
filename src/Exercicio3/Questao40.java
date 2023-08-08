package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas:");
        DecimalFormat df = new DecimalFormat("#.##");
        int qtePessoas = scanner.nextInt();
        int maiorIdade = 0, menorIdade = 999, somaIdades = 0, qteMaiorDeIdade = 0;
        double mediaIdades;

        for (int i = 0; i < qtePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1));
            int idade = scanner.nextInt();
            somaIdades += idade;

            maiorIdade = Math.max(maiorIdade, idade);
            menorIdade = Math.min(menorIdade, idade);

            if (idade >= 18) {
                qteMaiorDeIdade++;
            }
        }
        mediaIdades = (double) somaIdades / qtePessoas;

        System.out.println("A média das idades informadas é: " + df.format(mediaIdades));
        System.out.println("A maior idade entre as idades informadas é: " + maiorIdade);
        System.out.println("A menor idade entre as idades informadas é: " + menorIdade);
        System.out.println("A quantidade de pessoas maior de idade é: " + qteMaiorDeIdade);
    }
}
