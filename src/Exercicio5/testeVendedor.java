package Exercicio5;

public class testeVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Luciano","Rua aston martim","192839213",9876,8600,2.5,15000);

        System.out.println("Nome: "+vendedor.getNome());
        System.out.println("Endereço: "+vendedor.getEndereco());
        System.out.println("Telefone: "+vendedor.getTelefone());
        System.out.println("Código setor: "+vendedor.getCodigoSetor());
        System.out.println("Salário base: R$"+vendedor.getSalarioBase());
        System.out.println("porcentagem de impostos: "+vendedor.getImposto()+"%");
        System.out.println("Valor produção: "+vendedor.getValorVendas());
        System.out.println("O salário do vendedor é: "+vendedor.calcularSalario());
    }
}
