import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;

        System.out.print("Produto: ");
        nome = sc.nextLine();
        System.out.printf("Valor: ");
        valor = sc.nextDouble();
        Produto produto = new Produto(nome, valor);

        System.out.print("\nDigite um valor negativo para teste: ");
        produto.setPreco(sc.nextDouble());

        System.out.println("Preço modificado: " + produto.getPreco());
    }
}