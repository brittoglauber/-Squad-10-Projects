package Exercicio6.Questao2;

import Exercicio6.Questao1.Animal;
import Exercicio6.Questao1.Cachorro;
import Exercicio6.Questao1.Cavalo;
import Exercicio6.Questao1.Preguica;

public class InstanciaAnimais {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.setNome("Bidu");
        cachorro.setIdade(3);

        Animal cavalo = new Cavalo();
        cavalo.setNome("Pé de Pano");
        cavalo.setIdade(5);

        Animal preguica = new Preguica();
        preguica.setNome("Bingo");
        preguica.setIdade(2);

        Animal[] animais = { cachorro, cavalo, preguica };

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
            System.out.println();
        }
    }
}

