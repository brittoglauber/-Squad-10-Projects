package Exercicio3;

public class Questao49 {
    public static void main(String[] args) {
        long primeiroTermo = 1, segundoTermo = 1;

        System.out.println("Os primeiros 50 termos da sequência de Fibonacci: ");

        for (int i = 1; i <= 50; i++) {
            System.out.println(primeiroTermo);

            long proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
