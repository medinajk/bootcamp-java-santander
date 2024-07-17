package Sistema;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        Conta poupanca = new ContaCorrente();

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}