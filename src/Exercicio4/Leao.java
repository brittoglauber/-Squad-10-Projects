package Exercicio4;

public class Leao extends AnimalAB {

    private int quantidadeComida;
    private int distanciaPercurso;
    private int horasSono;

    @Override
    public void comer() {
        quantidadeComida += 5;
        System.out.println("O leão comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void moverse() {
        distanciaPercurso += 4;
        System.out.println("O leão se moveu. Distância percorrida: " + distanciaPercurso);
    }

    @Override
    public void dormir() {
        horasSono += 6;
        System.out.println("O leão dormiu. Quantidade de horas de sono: " + horasSono);
    }
}