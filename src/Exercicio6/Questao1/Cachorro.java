package Exercicio6.Questao1;

public class Cachorro extends Animal {
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}

