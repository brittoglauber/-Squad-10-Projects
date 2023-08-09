package Exercicio6.Questao4;

import Exercicio6.Questao1.Animal;
import Exercicio6.Questao1.Cachorro;
import Exercicio6.Questao1.Cavalo;
import Exercicio6.Questao1.Preguica;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro();
        jaulas[0].setNome("Bidu");
        jaulas[0].setIdade(3);

        jaulas[1] = new Cavalo();
        jaulas[1].setNome("Pé de Pano");
        jaulas[1].setIdade(5);

        jaulas[2] = new Preguica();
        jaulas[2].setNome("Bingo");
        jaulas[2].setIdade(2);

        jaulas[3] = new Cachorro();
        jaulas[3].setNome("Max");
        jaulas[3].setIdade(2);

        jaulas[4] = new Cavalo();
        jaulas[4].setNome("Thor");
        jaulas[4].setIdade(6);

        jaulas[5] = new Preguica();
        jaulas[5].setNome("Mariana");
        jaulas[5].setIdade(4);

        jaulas[6] = new Cachorro();
        jaulas[6].setNome("Caramelo");
        jaulas[6].setIdade(1);

        jaulas[7] = new Cavalo();
        jaulas[7].setNome("Relâmpago");
        jaulas[7].setIdade(4);

        jaulas[8] = new Preguica();
        jaulas[8].setNome("Jorginho");
        jaulas[8].setIdade(3);

        jaulas[9] = new Cachorro();
        jaulas[9].setNome("Luna");
        jaulas[9].setIdade(2);

        for (Animal animal : jaulas) {
            if (animal != null) {
                System.out.println("Animal na jaula:");
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Idade: " + animal.getIdade());
                animal.emitirSom();

                if (animal instanceof Cachorro) {
                    System.out.println("Fazendo o cachorro correr:");
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    System.out.println("Fazendo o cavalo correr:");
                    ((Cavalo) animal).correr();
                }

                System.out.println();
            }
        }
    }
}

