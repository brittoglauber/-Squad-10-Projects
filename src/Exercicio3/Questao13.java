package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casasDecimais = 1;
        DecimalFormat df = new DecimalFormat("#." +"0".repeat(casasDecimais));

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double terceiraNota = input.nextDouble();

        double total = primeiraNota + segundaNota + terceiraNota;
        double media = total/3;

        if (media >= 7){
            System.out.println("O aluno foi aprovado com média: "+df.format(media));
        } else if (media >= 5 && media < 7) {
            System.out.println("O aluno irá fazer a recuperação, sua média é de: "+df.format(media));
            System.out.println();
            System.out.print("Insira a nota da prova final: ");
            double notaFinal = input.nextDouble();
            if (notaFinal >= 5){
                System.out.println("O aluno foi aprovado após fazer a prova final, com nota: "+notaFinal);
            }else {
                System.out.println("O aluno foi reprovado após fazer a prova final, com nota: "+notaFinal);
            }
        }else {
            System.out.println("O aluno foi reprovado com média: "+df.format(media));
        }
    }
}