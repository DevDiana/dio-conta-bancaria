import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo, qual o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numero = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Qual seria o valor de deposito:");
        String saldo = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
        }
    }
