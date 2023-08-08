package Exercicio3;

import java.util.Scanner;

public class Questao47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtePacientes = 0, qteHomens = 0, qteMulheresAlturaPeso = 0, qtePessoasIdade18a25 = 0, idadeMaisVelho = 0, somaIdadeHomens = 0,
                alturaMulherMaisBaixa = 999, alturaHomemMaisBaixa = 999;
        double mediaIdadeHomens;
        String nomePacienteMaisVelho = "", nomeMulherMaisBaixa = "", nomeHomemMaisBaixo = "";

        while (true) {
            System.out.println("Digite o nome do paciente " + (qtePacientes + 1) + " (ou digite fim para encerrar)");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o gênero do paciente (M para masculino e F para feminino)");
            String genero = scanner.nextLine();

            System.out.println("Digite o peso do paciente em kg");
            double peso = scanner.nextDouble();

            System.out.println("Digite a idade do paciente");
            int idade = scanner.nextInt();

            System.out.println("Digite a altura do paciente em cm");
            int altura = scanner.nextInt();
            scanner.nextLine();

            System.out.println();
            qtePacientes++;

            if (genero.equalsIgnoreCase("M")) {
                qteHomens++;
                somaIdadeHomens += idade;
                if (altura < alturaHomemMaisBaixa) {
                    alturaHomemMaisBaixa = altura;
                    nomeHomemMaisBaixo = nome;
                }

            } else if (genero.equalsIgnoreCase("F") && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }

            if (genero.equalsIgnoreCase("F") && altura >= 160 && altura <= 170 && peso > 70) {
                qteMulheresAlturaPeso++;
            }

            if (idade >= 18 && idade <= 25) {
                qtePessoasIdade18a25++;
            }

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomePacienteMaisVelho = nome;
            }
        }

        mediaIdadeHomens = (double) somaIdadeHomens / qteHomens;

        System.out.println("\nA quantidade de pacientes é de: " + qtePacientes);
        System.out.println("A média da idade dos homens é de: " + mediaIdadeHomens);
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg é de: " + qteMulheresAlturaPeso);
        System.out.println("A quantidade de pessoas com idade entre 18 a 25 é de: " + qtePessoasIdade18a25);
        System.out.println("O nome do paciente mais velho é: " + nomePacienteMaisVelho);
        System.out.println("O nome da mulher mais baixa é: " + nomeMulherMaisBaixa);
        System.out.println("O nome do homem mais baixo é: " + nomeHomemMaisBaixo);
    }
}
