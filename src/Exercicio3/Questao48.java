package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double somaNotas = 0;

        System.out.println("Digite a quantidade de notas");
        int qteNotas = scanner.nextInt();

        for (int i = 0; i < qteNotas; i++) {
            System.out.println("Digite a nota " + (i + 1));
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        System.out.println("Digite o total de aulas");
        int totalAulas = scanner.nextInt();

        System.out.println("Digite o total de faltas");
        int totalFaltas = scanner.nextInt();

        double media = somaNotas / qteNotas;
        double frequencia = ((double) (totalAulas - totalFaltas) / totalAulas) * 100;

        if (media >= 7 && frequencia >= 75) {
            System.out.println("O aluno teve uma média de " + df.format(media) + " e uma frequência de "
                    + df.format(frequencia) + "% e foi aprovado");
        } else if (media < 7) {
            System.out.println("O aluno teve uma média de " + df.format(media) + " e uma frequência de "
                    + df.format(frequencia) + "% e foi reprovado por nota");
        } else {
            System.out.println("O aluno teve uma média de " + df.format(media) + " e uma frequência de "
                    + df.format(frequencia) + "% e foi reprovado por ter menos de 75% de frequência");
        }

    }
}
