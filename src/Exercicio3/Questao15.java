package Exercicio3;
import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do seu aniversário: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês do seu aniversário: ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            int diasNoMes = switch (mes) {
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29; // Considerando que todos os anos são bissextos
                default -> 31;
            };

            if (dia >= 1 && dia <= diasNoMes) {
                String nomeMes = obterNomeMes(mes);
                System.out.println("Data de aniversário válida!");
                System.out.println("Nome do mês: " + nomeMes);
            } else {
                System.out.println("Dia inválido.");
            }
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }

    public static String obterNomeMes(int mes) {
        String[] nomesMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        return nomesMeses[mes - 1];
    }
}