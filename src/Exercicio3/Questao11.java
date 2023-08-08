package Exercicio3;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();

        if (idade < 16){
            System.out.println("Você é jovem demais para votar.");
        } else if (idade <=16 || idade >= 65) {
            System.out.println("Para a sua faixa etária, o voto é facultativo.");
        }else {
            System.out.println("Para a sua faixa etária, o voto é obrigatório.");
        }
    }
}