package Sistema;

import Sistema.Conta;

public class ContaCorrente extends Conta {
    public void imprimirExtrato() {
        System.out.println("=== Extrato Sistema.Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
