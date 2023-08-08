package Exercicio3;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double terceiraNota = input.nextDouble();

        double total = primeiraNota + segundaNota + terceiraNota;
        double media = total/3;

        if (media >= 7){
            System.out.println("O aluno foi aprovado com média: "+media);
        } else if (media >= 5 && media < 7) {
            System.out.println("O aluno irá fazer a recuperação, sua média é de: "+media);
        }else {
            System.out.println("O aluno foi reprovado com média: "+media);
        }
    }
}