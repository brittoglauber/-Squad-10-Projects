package Exercicio3;

import java.util.Scanner;

public class Questao56 {
    public static void main(String[] args) {

        int totalVotos = 0, votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosEmBranco = 0;
        String ganhadorEleicao = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro candidato");
        String nomeCandidato1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo candidato");
        String nomeCandidato2 = scanner.nextLine();

        System.out.println("Digite o nome do terceiro candidato");
        String nomeCandidato3 = scanner.nextLine();

        while (true) {
            System.out.println("Digite o número do candidato (1, 2 ou 3) ou 0 para votar em branco");
            int voto = scanner.nextInt();
            scanner.nextLine();

            if (voto == 0) {
                votosEmBranco++;
            } else if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Número invalido. Tente novamente (1, 2 ou 3) ou 0 para votar em branco");
                continue;
            }

            totalVotos++;

            System.out.println("Digite 1 para continuar a votação ou 0 para encerrar a votação");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            }
        }

        double percentualCandidato1 = (double) votosCandidato1 / totalVotos * 100;
        double percentualCandidato2 = (double) votosCandidato2 / totalVotos * 100;
        double percentualCandidato3 = (double) votosCandidato3 / totalVotos * 100;
        double percentualEmBranco = (double) votosEmBranco / totalVotos * 100;

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            ganhadorEleicao = nomeCandidato1;
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            ganhadorEleicao = nomeCandidato2;
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            ganhadorEleicao = nomeCandidato3;
        } else {
            ganhadorEleicao = "Não houve ganhador";


        }
        System.out.println("\nAqui está o resultado da eleição");
        System.out.println("Candidato " +nomeCandidato1+ " teve " +votosCandidato1+ " votos e " +percentualCandidato1+ " % dos votos");
        System.out.println("Candidato " +nomeCandidato2+ " teve " +votosCandidato2+ " votos e " +percentualCandidato2+ " % dos votos");
        System.out.println("Candidato " +nomeCandidato3+ " teve " +votosCandidato3+ " votos e " +percentualCandidato3+ " % dos votos");
        System.out.println("Quantidade de votos em branco: " +votosEmBranco+ " e " +percentualEmBranco+ " % dos votos");
        System.out.println("Total de votos: " +totalVotos);
        System.out.println("Ganhador da eleição: " +ganhadorEleicao);
    }
}
