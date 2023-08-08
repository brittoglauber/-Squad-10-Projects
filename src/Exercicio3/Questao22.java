package Exercicio3;
import java.util.Scanner;

public class Questao22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita a primeira data de aniversário
        System.out.print("Digite o dia do primeiro aniversário: ");
        int dia1 = scanner.nextInt();
        System.out.print("Digite o mês do primeiro aniversário: ");
        int mes1 = scanner.nextInt();

        // Solicita a segunda data de aniversário
        System.out.print("Digite o dia do segundo aniversário: ");
        int dia2 = scanner.nextInt();
        System.out.print("Digite o mês do segundo aniversário: ");
        int mes2 = scanner.nextInt();

        // Verifica se as datas de aniversário são iguais
        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversário são iguais.");
        } else {
            System.out.println("As datas de aniversário não são iguais.");
        }

        scanner.close();
    }
}
