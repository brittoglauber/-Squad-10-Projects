package Exercicio3;
import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita informações da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        // Solicita informações da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        // Verifica a pessoa mais velha e a pessoa mais nova
        String pessoaMaisVelha, pessoaMaisNova;
        if (idade1 > idade2) {
            pessoaMaisVelha = nome1;
            pessoaMaisNova = nome2;
        } else {
            pessoaMaisVelha = nome2;
            pessoaMaisNova = nome1;
        }

        // Exibe o resultado
        System.out.println("A pessoa mais velha é: " + pessoaMaisVelha);
        System.out.println("A pessoa mais nova é: " + pessoaMaisNova);

        scanner.close();
    }

}
