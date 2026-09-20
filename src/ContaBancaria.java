public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposita(double valor){
        if(valor >= 0){
        saldo = this.saldo + valor;
        }else{
            System.out.println("Valor de deposito negativo");
        };
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo(){
            System.out.println("Nome: " + this.titular);
            System.out.println("Saldo: " + this.saldo);
        }
}

