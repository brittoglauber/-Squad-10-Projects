package Exercicio3;
import java.util.Scanner;

public class Questao23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita informações da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite o dia de nascimento da primeira pessoa: ");
        int dia1 = scanner.nextInt();
        System.out.print("Digite o mês de nascimento da primeira pessoa: ");
        int mes1 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        // Solicita informações da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite o dia de nascimento da segunda pessoa: ");
        int dia2 = scanner.nextInt();
        System.out.print("Digite o mês de nascimento da segunda pessoa: ");
        int mes2 = scanner.nextInt();

        // Verifica qual pessoa faz aniversário primeiro
        String primeiroAniversariante;
        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            primeiroAniversariante = nome1;
        } else {
            primeiroAniversariante = nome2;
        }

        // Exibe o nome do primeiro aniversariante
        System.out.println("O primeiro aniversariante é: " + primeiroAniversariante);

        scanner.close();
    }
}
