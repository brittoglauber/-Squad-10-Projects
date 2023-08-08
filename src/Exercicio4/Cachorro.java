package Exercicio4;

public class Cachorro extends AnimalAB {

    private int quantidadeComida;
    private int distanciaPercurso;
    private int horasSono;

    @Override
    public void comer() {
        quantidadeComida += 2;
        System.out.println("O cachorro comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void moverse() {
        distanciaPercurso += 5;
        System.out.println("O cachorro se moveu. Distância percorrida: " + distanciaPercurso);
    }

    @Override
    public void dormir() {
        horasSono += 8;
        System.out.println("O cachorro dormiu. Quantidade de horas de sono: " + horasSono);
    }
}
