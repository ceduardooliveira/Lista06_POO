public class Main{

    public static void main(String[] args) {
        // Criando uma instância da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(12345, 1000.0, "João");

        // Realizando algumas operações
        minhaConta.depositar(500.0);
        System.out.println("Saldo atual: " + minhaConta.verificarSaldo());

        minhaConta.sacar(200.0);
        System.out.println("Saldo atual: " + minhaConta.verificarSaldo());

        minhaConta.sacar(1500.0);
        System.out.println("Saldo atual: " + minhaConta.verificarSaldo());
    }
}
