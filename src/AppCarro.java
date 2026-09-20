import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro("Civic");

        System.out.println("Modelo: " + carro.getModel());
        carro.acelerar(50);
        System.out.println("Acelerar: " + carro.getVel());
        carro.frear(20);
        System.out.println("Frear: " + carro.getVel());
        carro.frear(100);
        System.out.println("Frear (teste de erro): " + carro.getVel());
    }
}