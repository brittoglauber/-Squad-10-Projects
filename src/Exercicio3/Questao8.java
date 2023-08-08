package Exercicio3;
import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        double numerador = input.nextDouble();

        System.out.print("Digite o denominador (não pode ser zero): ");
        double denominador = input.nextDouble();

        double resultado = racionalParaReal(numerador, denominador);
        System.out.println(resultado);

    }
    public static double racionalParaReal(double numerador, double denominador) {
        if (denominador != 0) {
            double resultado = numerador / denominador;
            return resultado;
        } else {
            System.out.println("Denominador não pode ser zero! Divisão por zero não é permitida.");
            return Double.NaN;
        }
    }
}