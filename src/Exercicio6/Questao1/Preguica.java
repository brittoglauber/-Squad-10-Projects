package Exercicio6.Questao1;

public class Preguica extends Animal {
    public void subirEmArvores() {
        System.out.println(getNome() + " está subindo em árvores.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está fazendo um som característico.");
    }
}

