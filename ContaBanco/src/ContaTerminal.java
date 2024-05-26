import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Instruindo ao programa que os numeros e ponto flutuante devem ser no padão US
        Scanner scanner = new Scanner(System.in); // Iniciando Scanner para entrada de dados

        System.out.println("Por favor, digite o numero da Agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o numero da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Nome do Titular:");
        String nomeTitular = scanner.next();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "
                + nomeTitular
                +", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta "
                + numeroConta +
                " e seu saldo "
                + saldo +
                " já está disponível para saque.");

        scanner.close(); // Fechando a entrada de dados

    }
}
