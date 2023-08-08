package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casasDecimais = 2;
        DecimalFormat df = new DecimalFormat("#." + "0".repeat(casasDecimais));

        System.out.print("Digite a quantidade de homens: ");
        int homens = input.nextInt();

        System.out.print("Digite a quantidade de mulheres: ");
        int mulheres = input.nextInt();
        System.out.println();

        int totalPessoas = homens + mulheres;
        double totalPessoasDouble = totalPessoas;
        double percentualHomens = (homens/totalPessoasDouble) *100;
        double percentualMulheres = (mulheres/totalPessoasDouble) *100;

        System.out.println("O percentual de homens é: "+df.format(percentualHomens)+"%");
        System.out.println("O percentual de mulheres é: "+df.format(percentualMulheres)+"%");
    }
}