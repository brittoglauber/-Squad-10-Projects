package Exercicio3;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor do seu salário bruto: ");
        double salarioBruto = input.nextDouble();

        System.out.print("Insira o valor total dos descontos no seu salário: ");
        double descontos = input.nextDouble();

        double salarioLiquido = salarioBruto - descontos;

        System.out.println();
        System.out.print("Insira a quantia que você deseja pegar: ");
        double emprestimo = input.nextDouble();

        if (emprestimo <= 0.3 * salarioLiquido){
            System.out.println("Você está apto a realizar um emprésitmo no valor de R$"+emprestimo);
        }else{
            System.out.println("Você não está apto a realizar este empréstimo.");
        }
    }
}