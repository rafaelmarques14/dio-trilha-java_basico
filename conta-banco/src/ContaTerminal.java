import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as informações para nossos usuários

        // Obter pelo Scanner os valores digitados no terminal

        // Exibir a conta criada

        Scanner scanner = new Scanner(System.in);

        // Solicitando o número da conta
        System.out.print("Por favor, digite o nUmero da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Solicitando o número da agência
        System.out.print("Por favor, digite o nUmero da Agencia: ");
        String agencia = scanner.nextLine();

        // Solicitando o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitando o saldo da conta
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados inseridos
        String mensagem = String.format(
                "Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque.",
                nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
