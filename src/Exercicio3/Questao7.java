package Exercicio3;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor pago pelo cliente: ");
        double valorCliente = input.nextDouble();

        double comissaoGarcom = valorCliente * 0.1 ;

        System.out.println("A comissão do garçom é de: R$"+comissaoGarcom);


    }
}