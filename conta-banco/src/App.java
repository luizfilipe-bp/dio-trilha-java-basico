import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo!!");
        System.out.println("Digite o número da conta");
        int numero = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Digite o número da agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta");
        double saldo = Double.parseDouble(scanner.nextLine());

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        conta.exibirInformacoes();

        scanner.close();
    }
}
