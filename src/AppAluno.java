import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nAluno;
        double nNota1;
        double nNota2;

        System.out.println("Aluno: ");
        nAluno = sc.nextLine();
        System.out.println("Nota 1: ");
        nNota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        nNota2 = sc.nextDouble();
        sc.nextLine();
        Aluno aluno = new Aluno(nAluno, nNota1, nNota2);

        System.out.println("Media: " + aluno.calcularMedia());
        System.out.println("Aluno está aprovado: " + aluno.verificarAprovacao());

    }
}

//Na classe principal, crie um aluno, atribua as notas, calcule e exiba se ele está aprovado.
