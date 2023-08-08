package Exercicio4;

public abstract class AnimalVoadorAB extends AnimalAB {
    private String nome;
    private String tipoAnimal;
    private String habitat;
    private int idade;
    private int quantidadePatas;
    private double altura;
    private double peso;
    private int quantidadeDeAsas;
    private double envergaduraAsa;
    public void voar() {
        System.out.println("O animal está voando.");
    }
}
