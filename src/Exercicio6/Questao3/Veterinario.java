package Exercicio6.Questao3;

import Exercicio6.Questao1.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.getNome() + ":");
        animal.emitirSom();
        System.out.println("Exame completo.\n");
    }
}

