public class Produto {
    private String name;
    private double preco;

    Produto(String name, double preco){
        this.name = name;
        this.preco = preco;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }
    }

}

