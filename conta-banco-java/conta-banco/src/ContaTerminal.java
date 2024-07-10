import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        float saldo = 237.48f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome");
        String nomeClienteString = scanner.nextLine();

        // Solicitação e leitura do número da agência
        System.out.println("Por favor, digite o número da Agência");
        String numeroAgenciaString = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        String numeroConta = scanner.nextLine();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.%n",
                nomeClienteString, numeroAgenciaString, numeroConta, saldo);

    }
}
