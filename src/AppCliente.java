import java.util.ArrayList; // import arraylist
import java.util.List; // import list
import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite seu CPF: ");
            String cpf = sc.nextLine();
            System.out.println("Digite seu email: ");
            String email = sc.nextLine();
            clientes.add(new Cliente(nome, cpf, email));
        }

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Nome: " + clientes.get(i).getName());
            System.out.println("CPF: " + clientes.get(i).getCpf());
            System.out.println("Email: " + clientes.get(i).getEmail());
            System.out.println("===================================");
        }





    }
}


