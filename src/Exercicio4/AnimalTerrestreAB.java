package Exercicio4;

public abstract class AnimalTerrestreAB extends AnimalAB {
    private String nome;
    private String tipoAnimal;
    private String habitat;
    private int idade;
    private int quantidadePatas;
    private double altura;
    private double peso;
    public void caminhar() {
        System.out.println("O animal está caminhando.");
    }
}
