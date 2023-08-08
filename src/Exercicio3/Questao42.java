package Exercicio3;

import java.util.Arrays;

public class Questao42 {
    public static void main(String[] args) {

        int[] numSorteados = new int[3];

        for (int i = 0; i < 40; i++) {
            numSorteados[0] = sortearNumero();
            numSorteados[1] = sortearNumero();
            numSorteados[2] = sortearNumero();

            Arrays.sort(numSorteados);

            System.out.println("Grupo " + (i + 1) + " exibido em ordem crescente: " + numSorteados[0] + " " + numSorteados[1]
                    + " " + numSorteados[2]);
        }
    }

    private static int sortearNumero() {
        return (int) (Math.random() * 60);
    }
}
