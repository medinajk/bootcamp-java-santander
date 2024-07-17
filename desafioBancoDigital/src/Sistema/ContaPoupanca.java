package Sistema;

import Sistema.Conta;

public class ContaPoupanca extends Conta {
    public void imprimirExtrato() {
        System.out.println("=== Extrato Sistema.Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}


