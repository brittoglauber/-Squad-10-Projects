package Exercicio5;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Pedro", "Estrada do Brasil", "983943843", 708, 4000, 10);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código setor: " + empregado.getCodigoSetor());
        System.out.println("Salário bruto: R$" + empregado.getSalarioBase());
        System.out.println("Porcentagem de imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário líquido: R$" + empregado.calcularSalario());
    }
}
