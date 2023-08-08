package Exercicio4;

public class Peixe extends AnimalMarinhoAB {

    private int quantidadeComida;
    private int distanciaPercurso;
    private int horasSono;

    @Override
    public void comer() {
        quantidadeComida += 3;
        System.out.println("O peixe comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void dormir() {
        horasSono += 2;
        System.out.println("O peixe dormiu. Quantidade de horas de sono: " + horasSono);
    }

    @Override
    public void nadar() {
        distanciaPercurso += 15;
        System.out.println("O peixe nadou. Distância percorrida: " + distanciaPercurso);
    }
}
