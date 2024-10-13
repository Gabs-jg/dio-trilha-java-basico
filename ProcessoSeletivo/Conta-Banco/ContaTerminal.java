import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = sc.next();

        System.out.print("Por favor, digite o saldo em conta: ");
        double saldo = sc.nextFloat();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
