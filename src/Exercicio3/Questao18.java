package Exercicio3;

import java.util.Scanner;

public class Questao18 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do seu aniversário: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês do seu aniversário: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o dia de hoje: ");
        int diaHoje = scanner.nextInt();

        System.out.print("Digite o mês de hoje: ");
        int mesHoje = scanner.nextInt();

        System.out.print("Digite o ano de hoje: ");
        int anoHoje = scanner.nextInt();

        // Verifica o mês
        if (mes >= 1 && mes <= 12) {
            int diasNoMes = switch (mes) {
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29; // Considerando que todos os anos são bissextos
                default -> 31;
            };

            if (dia >= 1 && dia <= diasNoMes) {
                String nomeMes = obterNomeMes(mes);
                System.out.println("Data de aniversário válida!");
                System.out.println("Nome do mês: " + nomeMes);

                // Verificar trimestre de nascimento
                int trimestre = (mes - 1) / 3 + 1;
                System.out.println("Trimestre de nascimento: " + trimestre);

                // Apresentar o signo do horóscopo
                String signo = obterSigno(mes, dia);
                System.out.println("Signo do horóscopo: " + signo);

                int idade = calcularIdade(anoNascimento, anoHoje, mes, dia, mesHoje, diaHoje);
                System.out.println("Idade atual: " + idade + " anos");

            } else {
                System.out.println("Dia inválido.");
            }
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }

    // Obter o nome do mês
    public static String obterNomeMes(int mes) {
        String[] nomesMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        return nomesMeses[mes - 1];
    }
    // Obter o signo correspondente
    public static String obterSigno(int mes, int dia) {
        return  mes == 3 && dia >= 21 || mes == 4 && dia <= 19 ? "Áries" :
                mes == 4 || mes == 5 && dia <= 20 ? "Touro" :
                mes == 5 || mes == 6 && dia <= 20 ? "Gêmeos" :
                mes == 6 || mes == 7 && dia <= 22 ? "Câncer" :
                mes == 7 || mes == 8 && dia <= 22 ? "Leão" :
                mes == 8 || mes == 9 && dia <= 22 ? "Virgem" :
                mes == 9 || mes == 10 && dia <= 22 ? "Libra" :
                mes == 10 || mes == 11 && dia <= 21 ? "Escorpião" :
                mes == 11 || mes == 12 && dia <= 21 ? "Sagitário" :
                mes == 12 || mes == 1 && dia <= 19 ? "Capricórnio" :
                mes == 1 || mes == 2 && dia <= 18 ? "Aquário" :
                                                    "Peixes";
    }
    // Calcula a idade do usuário
    public static int calcularIdade(int anoNascimento, int anoHoje, int mesNascimento, int diaNascimento, int mesHoje, int diaHoje) {
        int idade = anoHoje - anoNascimento;

        if (mesHoje < mesNascimento || (mesHoje == mesNascimento && diaHoje < diaNascimento)) {
            idade--;
        }

        return idade;
    }

}
