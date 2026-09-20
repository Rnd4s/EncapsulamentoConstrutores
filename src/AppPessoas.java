import java.util.Scanner;

public class AppPessoas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoas[] cadastro = new Pessoas[2];
        String nome;
        int idade;
        int newidade;

        for (int i = 0; i < cadastro.length; i++) {
            System.out.println("Nome: ");
            nome = sc.nextLine();
            System.out.println("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            cadastro[i] = new Pessoas(nome, idade);
        }

        System.out.println("Digite a nova idade do primeiro usuário: ");
        newidade = sc.nextInt();
        cadastro[0].setAge(newidade);


        for (int i = 0; i < cadastro.length; i++) {
            System.out.println("Nome digitado: " + cadastro[i].getName());
            System.out.println("Idade digitada: " + cadastro[i].getAge());

        }

    }
}

//Um construtor que receba nome e idade. - feito
//• Métodos get e set para ambos os atributos. - feito
//Crie uma classe Main para instanciar duas pessoas, alterar a idade
//de uma delas e exibir os
//dados de ambas.