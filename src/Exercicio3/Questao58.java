package Exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite uma data no formato dia/mês/ano");
        String dataStr = scanner.nextLine();

        System.out.println("Digite uma quantidade de dias a ser adicionado a essa data:");
        int qteDias = scanner.nextInt();

        LocalDate data = LocalDate.parse(dataStr, dateFormatter);
        LocalDate dataAntes = data;

        data = data.plusDays(qteDias);

        System.out.println("\n" + dataAntes.format(dateFormatter) + " + " + qteDias + " = " + data.format(dateFormatter));
    }
}
