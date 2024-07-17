package Sistema;

import Sistema.Conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
