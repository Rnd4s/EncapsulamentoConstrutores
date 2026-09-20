import java.util.Scanner;

public class AppBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nConta;
        String tCliente;
        double sSaldo;

        System.out.println("Numero da conta: ");
        nConta = sc.nextLine();
        System.out.println("Nome do cliente: ");
        tCliente = sc.nextLine();
        System.out.println("Saldo inicial: ");
        sSaldo = sc.nextDouble();
        sc.nextLine(); //limpar buffer
        ContaBancaria cliente = new ContaBancaria(nConta, tCliente, sSaldo);

        System.out.print("Valor que deseja depositar: ");
        cliente.deposita(sc.nextDouble());

        System.out.println("====");
        cliente.exibirSaldo();

        System.out.println("\nDigite o valor que deseja sacar: ");
        cliente.sacar(sc.nextDouble());

        System.out.println("====");
        cliente.exibirSaldo();
    }
}
