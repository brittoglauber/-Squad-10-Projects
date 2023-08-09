package Exercicio5;

public class testeOperario {
    public static void main(String[] args) {
        Operario opr = new Operario("Luciano","rua redbull","1123123",1234,9000,2,800);

        System.out.println("Nome: "+opr.getNome());
        System.out.println("Endereço: "+opr.getEndereco());
        System.out.println("Telefone: "+opr.getTelefone());
        System.out.println("Código setor: "+opr.getCodigoSetor());
        System.out.println("Salário base: R$"+opr.getSalarioBase());
        System.out.println("porcentagem de impostos: "+opr.getImposto()+"%");
        System.out.println("Valor produção: "+opr.getValorProducao());
        System.out.println("O salário do operário é: "+opr.calcularSalario());
    }
}
