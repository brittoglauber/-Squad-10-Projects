package Exercicio3;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int nascimento = input.nextInt();

        System.out.print("Digite o ano atual: ");
        int atual = input.nextInt();

        int idade = atual - nascimento;
        System.out.print("A sua idade é: "+idade+" anos");
    }
}