import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de sua agência");
        int numAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual sua agência?");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo disponível");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numAgencia +
                " e seu saldo de R$" + saldo + " já está disponível para saque");
    }
}
