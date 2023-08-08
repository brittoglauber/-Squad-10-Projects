package Exercicio3;
import java.util.Scanner;

public class Questao19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Verifica a ordem e exibe em ordem crescente
        if (numero1 < numero2) {
            System.out.println("Os números em ordem crescente são: " + numero1 + " " + numero2);
        } else {
            System.out.println("Os números em ordem crescente são: " + numero2 + " " + numero1);
        }

        scanner.close();
    }
}
