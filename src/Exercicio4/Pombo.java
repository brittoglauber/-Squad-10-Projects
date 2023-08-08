package Exercicio4;

public class Pombo extends AnimalVoadorAB {

    private int quantidadeComida;
    private int distanciaPercurso;
    private int horasSono;

    @Override
    public void comer() {
        quantidadeComida += 4;
        System.out.println("O pombo comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void dormir() {
        horasSono += 6;
        System.out.println("O pombo dormiu. Quantidade de horas de sono: " + horasSono);
    }

    @Override
    public void voar() {
        distanciaPercurso += 40;
        System.out.println("O pombo voou. Distância percorrida: " + distanciaPercurso);
    }
}
