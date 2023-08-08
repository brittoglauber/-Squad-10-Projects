package Exercicio3;

import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as coordenadas do vértice superior esquerdo (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Informe as coordenadas do vértice inferior direito (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double base = Math.abs(x2 - x1);
        double altura = Math.abs(y2 - y1);
        double area = base * altura;

        System.out.println("Área do retângulo: " + area);

        System.out.println("Informe as coordenadas de um ponto (x, y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x < x1 && y > y2) {
            System.out.println("Acima e à esquerda do retângulo.");
        } else if (x >= x1 && x <= x2 && y > y2) {
            System.out.println("Acima do retângulo.");
        } else if (x > x2 && y > y2) {
            System.out.println("Acima e à direita do retângulo.");
        } else if (x < x1 && y >= y1 && y <= y2) {
            System.out.println("À esquerda do retângulo.");
        } else if (x > x2 && y >= y1 && y <= y2) {
            System.out.println("À direita do retângulo.");
        } else if (x < x1 && y < y1) {
            System.out.println("Embaixo e à esquerda do retângulo.");
        } else if (x >= x1 && x <= x2 && y < y1) {
            System.out.println("Embaixo do retângulo.");
        } else if (x > x2 && y < y1) {
            System.out.println("Embaixo e à direita do retângulo.");
        } else if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Dentro do retângulo.");
        } else {
            System.out.println("Na linha do retângulo.");
        }

        scanner.close();
    }
}
