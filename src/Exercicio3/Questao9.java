package Exercicio3;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();

        if(idade >=18){
            System.out.println("Você é maior de idade");
        }else if (idade < 0){
            System.out.println("Digite uma idade válida.");
        }else {
            System.out.println("Você NÃO é maior de idade");
        }

    }
}