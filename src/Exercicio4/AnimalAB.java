package Exercicio4;

public class AnimalAB implements AnimalIF {

    @Override
    public void comer(){
        System.out.println("O animal comeu.");
    }

    @Override
    public void moverse() {
        System.out.println("O animal se moveu.");
    }

    @Override
    public void dormir() {
        System.out.println("O animal dormiu.");
    }
}
