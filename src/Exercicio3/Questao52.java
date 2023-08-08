package Exercicio3;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class Questao52 {
    public static void main(String[] args) {

        BigInteger totalGraos = BigInteger.ZERO, graosCasa = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            totalGraos = totalGraos.add(graosCasa);
            graosCasa = graosCasa.multiply(BigInteger.valueOf(2));
        }
        BigInteger totalSacosArroz = totalGraos.divide(BigInteger.valueOf(50000)); //Dizendo que um saco de arroz de 1kg tem 50000 grãos
        BigInteger totalEmReais = totalSacosArroz.multiply(BigInteger.valueOf(8));

        System.out.println("O sudito teria que ganhar um total de " + totalGraos + " grãos de arroz.");
        System.out.println("O sudito teria que ganhar um total de " + totalSacosArroz + " sacos de arroz de 1kg cada.");
        System.out.println("Se cada saco de arroz está R$ 8,00 o sudito vai ganhar um total de R$ " +String.format("%,d", totalEmReais));
    }
}
