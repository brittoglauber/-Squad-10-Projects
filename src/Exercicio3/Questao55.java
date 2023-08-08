package Exercicio3;

import java.util.Scanner;

public class Questao55 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double saldo = 100.0; // Saldo inicial de minutos
    double valorMensal = 50.0;
    double valorMinutoExcedenteOutrasOperadoras = 0.65;
    double valorMinutoExcedenteVaiVai = 0.20;
    double valorMinutoTelefoneFixo = 0.5; // Metade do valor

    System.out.println("Bem-vindo(a) à operadora Vai-Vai!");
    System.out.println("Plano mensal: 100 minutos por R$50,00");

    char continuar;
    do {
        System.out.print("\nDigite o tipo de ligação (o = outras operadoras, v = Vai-Vai, f = telefone fixo): ");
        char tipoLigacao = scanner.next().charAt(0);

        System.out.print("Digite a quantidade de minutos: ");
        double minutos = scanner.nextDouble();

        double valorAPagar = 0.0;

        if (tipoLigacao == 'o') {
            valorAPagar = minutos > 100 ? (minutos - 100) * valorMinutoExcedenteOutrasOperadoras : 0;
        } else if (tipoLigacao == 'v') {
            valorAPagar = minutos > 150 ? (minutos - 150) * valorMinutoExcedenteVaiVai : 0;
        } else if (tipoLigacao == 'f') {
            valorAPagar = minutos * valorMinutoTelefoneFixo;
        }

        saldo -= minutos; // Deduz minutos do saldo

        if (saldo < 0) {
            saldo = 0; // Não permite saldo negativo
        }

        valorAPagar += valorMensal; // Adiciona valor mensal
        saldo += 100; // Adiciona minutos do plano mensal

        System.out.println("\nSaldo restante: " + saldo + " minutos");
        System.out.println("Valor a pagar: R$" + valorAPagar);

        System.out.print("\nDeseja fazer outra ligação? (s/n): ");
        continuar = scanner.next().charAt(0);

    } while (continuar == 's' || continuar == 'S');

    System.out.println("\nObrigado por utilizar a operadora Vai-Vai!");
    scanner.close();
}

}
