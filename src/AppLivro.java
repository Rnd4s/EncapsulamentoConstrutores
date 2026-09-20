import java.util.Scanner;

public class AppLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tLivro;
        String aAutor;
        int apPublicacao;

        System.out.println("Livro: ");
        tLivro = sc.nextLine();
        System.out.println("Autor: ");
        aAutor = sc.nextLine();
        System.out.println("Ano publicado: ");
        apPublicacao = sc.nextInt();
        Livro livro1 = new Livro(tLivro, aAutor, apPublicacao);
        Livro livro2 = new Livro(tLivro, aAutor);

        System.out.println("===Livro 1===");
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de publicacao: " + livro1.getAnoPublicacao());

        System.out.println("===Livro 2===");
        System.out.println("Livro: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano de publicacao: " + livro2.getAnoPublicacao());














    }
}
