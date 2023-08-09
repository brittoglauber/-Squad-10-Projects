package Exercicio5;

public class testeAdministrador {

    public static void main(String[] args) {
        Administrador adm = new Administrador("Luciano","Rua ferrari","81919191919",2343,5000,1,800);

        System.out.println("Nome: "+adm.getNome());
        System.out.println("Endereço: "+adm.getEndereco());
        System.out.println("Telefone: "+adm.getTelefone());
        System.out.println("Código setor: "+adm.getCodigoSetor());
        System.out.println("Salário base: R$"+adm.getSalarioBase());
        System.out.println("porcentagem de impostos: "+adm.getImposto()+"%");
        System.out.println("Valor produção: "+adm.getAjudaDeCusto());
        System.out.println("Salário do administrador: "+adm.calcularSalario());
    }
}
