package Exercicio6.Questao1;

public class Cavalo extends Animal {
    public void correr() {
        System.out.println(getNome() + " está galopando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando.");
    }
}
