package Exercicio3;
import java.util.Scanner;

public class Questao25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Solicita os inputs do usuário
        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();
        // Chama a função para a validação do horário
        boolean horarioValido = validarHorario(hora, minutos, segundos);

        if (horarioValido) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }

        scanner.close();
    }
    // Função que valida o horário
    public static boolean validarHorario(int hora, int minutos, int segundos) {
        return hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60;
    }
}