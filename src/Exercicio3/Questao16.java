package Exercicio3;

import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do seu aniversário: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês do seu aniversário: ");
        int mes = scanner.nextInt();

        // Verifica o mês
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

                // Verificar trimestre de nascimento
                int trimestre = (mes - 1) / 3 + 1;
                System.out.println("Trimestre de nascimento: " + trimestre);

            } else {
                System.out.println("Dia inválido.");
            }
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
    // Obter o nome do mês
    public static String obterNomeMes(int mes) {
        String[] nomesMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        return nomesMeses[mes - 1];
    }
}


