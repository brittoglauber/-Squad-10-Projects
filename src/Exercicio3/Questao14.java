package Exercicio3;
import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de um mês: ");
        String nomeMes = scanner.nextLine();

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        int numero = -1;

        for(int i = 0; i < meses.length; i++){
            if(nomeMes.equalsIgnoreCase(meses[i])){
                numero = i + 1;
                break;
            }
        }

        if(numero != -1){
            System.out.println("O número referente ao mês de " + nomeMes + " é " + numero);
        } else {
            System.out.println("Mês não existe.");
        }

        scanner.close();
    }
}
