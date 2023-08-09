package Exercicio5;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Roy Mustang", "Amestris", "23249894", 7000, 4000);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito: R$ " + fornecedor.getValorCredito());
        System.out.println("Dívida: R$ " + fornecedor.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor.obterSaldo());
    }
}
