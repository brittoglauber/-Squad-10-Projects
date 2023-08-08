package Exercicio3;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor inicial da sua dívida:");
        double dividaAtual = input.nextDouble();

        System.out.print("Insira a quantidade de meses: ");
        int meses = input.nextInt();

        System.out.print("Insira a taxa de juros (em inteiro): ");
        double juros = input.nextDouble()/100;

        double jurosSimples = dividaAtual * meses * juros;
        double valorFinal = dividaAtual + jurosSimples;

        System.out.println("A dívida é de: "+valorFinal);
    }
}