import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = 
        new ContaBancaria("12345",
                          "João Silva",
                          1000.0);

        while (true) {
            System.out.println("\nEscolha uma opção:\n" +
                    "1 - Ver o Saldo da conta.\n" +
                    "2 - Realizar um Depósito.\n" +
                    "3 - Realizar um Saque.\n" +
                    "Digite sua opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Quanto deseja depositar? R$");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Quanto deseja sacar? R$");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                default:
                    System.out.println("Tente novamente.");
            }
        }
    }
}
