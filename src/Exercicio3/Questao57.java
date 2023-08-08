package Exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a primeira data no formato dia/mês/ano");
        String dataStr1 = scanner.nextLine();
        LocalDate data1 = LocalDate.parse(dataStr1, dateFormatter);

        System.out.println("Digite a segunda data no formato dia/mês/ano");
        String dataStr2 = scanner.nextLine();
        LocalDate data2 = LocalDate.parse(dataStr2, dateFormatter);

        data1 = data1.plusDays(1);

        System.out.println("\nAs datas que estão entre as datas informadas são:");

        while (data1.isBefore(data2)) {
            System.out.println(data1.format(dateFormatter));
            data1 = data1.plusDays(1);
        }
    }
}
