package Exercicio3;
import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê os inputs do usuário
        System.out.println("Digite o primeiro horário:");
        System.out.print("Horas: ");
        int horas1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos1 = scanner.nextInt();

        System.out.println("Digite o segundo horário:");
        System.out.print("Horas: ");
        int horas2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos2 = scanner.nextInt();
        // Chama a função que verifica a diferença
        int diferencaEmSegundos = calcularDiferencaEmSegundos(horas1, minutos1, segundos1, horas2, minutos2, segundos2);

        System.out.println("A diferença entre os horários é de " + diferencaEmSegundos + " segundos.");

        scanner.close();
    }
    // Função para calcular a diferença
    public static int calcularDiferencaEmSegundos(int horas1, int minutos1, int segundos1, int horas2, int minutos2, int segundos2) {
        int totalSegundos1 = (horas1 * 3600) + (minutos1 * 60) + segundos1;
        int totalSegundos2 = (horas2 * 3600) + (minutos2 * 60) + segundos2;

        return totalSegundos1 > totalSegundos2 ? totalSegundos1 - totalSegundos2 : totalSegundos2 - totalSegundos1;
    }
}