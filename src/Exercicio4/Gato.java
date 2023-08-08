package Exercicio4;

public class Gato extends AnimalAB {

    private int quantidadeComida;
    private int distanciaPercurso;
    private int horasSono;

    @Override
    public void comer() {
        quantidadeComida += 1;
        System.out.println("O gato comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void moverse() {
        distanciaPercurso += 3;
        System.out.println("O gato se moveu. Distância percorrida: " + distanciaPercurso);
    }

    @Override
    public void dormir() {
        horasSono += 12;
        System.out.println("O gato dormiu. Quantidade de horas de sono: " + horasSono);
    }
}