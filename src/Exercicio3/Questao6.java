package Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao6 {

    public static double areaCirculo(){
        double raio = 5;
        double area = Math.PI * Math.pow(raio,2);

        return area;
    }

    public static void main(String[] args) {
        int casasDecimais = 2;
        DecimalFormat df = new DecimalFormat("#."+"0".repeat(casasDecimais));

        System.out.println("A área do círculo é: "+df.format(areaCirculo()));
    }
}