package Exercicio3;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double terceiraNota = input.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double quartaNota = input.nextDouble();

        int quantidadeProvas = 4;

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / quantidadeProvas;
        System.out.println();
        System.out.println("A média deste aluno é: "+media);


    }
}