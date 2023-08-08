package Exercicio4;

public class Elefante extends AnimalAB {

    private int quantidadeComida;
    private int distanciaPercurso;
    private int horasSono;

    @Override
    public void comer() {
        quantidadeComida += 10;
        System.out.println("O elefante comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void moverse() {
        distanciaPercurso += 2;
        System.out.println("O elefante se moveu. Distância percorrida: " + distanciaPercurso);
    }

    @Override
    public void dormir() {
        horasSono += 4;
        System.out.println("O elefante dormiu. Quantidade de horas de sono: " + horasSono);
    }
}