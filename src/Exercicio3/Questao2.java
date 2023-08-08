package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casasDecimaisDesejadas = 2;
        DecimalFormat df = new DecimalFormat("#." +"0".repeat(casasDecimaisDesejadas));

        System.out.print("Digite seu salário atual: ");
        double salarioAtual = input.nextInt();
        double salarioMinimo = 1320;
        double salariosMinimos = salarioAtual/salarioMinimo;
        System.out.println("O seu salário corresponde a "+df.format(salariosMinimos)+" salários mínimos.");
    }
}