package Exercicio3;

import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as coordenadas dos vértices do primeiro retângulo:");
        double x1A = scanner.nextDouble();
        double y1A = scanner.nextDouble();
        double x2A = scanner.nextDouble();
        double y2A = scanner.nextDouble();

        System.out.println("Informe as coordenadas dos vértices do segundo retângulo:");
        double x1B = scanner.nextDouble();
        double y1B = scanner.nextDouble();
        double x2B = scanner.nextDouble();
        double y2B = scanner.nextDouble();

        // Verifica se os retângulos se sobrepõem
        boolean sobrepoe = !(x2A < x1B || x1A > x2B || y2A < y1B || y1A > y2B);

        if (sobrepoe) {
            System.out.println("Os retângulos se interceptam em algum lugar.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }

        scanner.close();
    }
}
