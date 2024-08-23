import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criação de um scanner para receber a entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem final com os dados informados pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero 
                        + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
        
        // Fechar o scanner
        scanner.close();
    }
}
