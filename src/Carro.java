public class Carro {
    private String model;
    private int vel;

    Carro(String model){
        this.model = model;
        this.vel = 0;
    }

    public void acelerar(int valor){
        this.vel = this.vel + valor;
    }

    public void frear(int valor){
        if(this.vel > valor){
            this.vel = this.vel - valor;
        }else{
            this.vel = 0;
        }
    }

    public int getVel(){
        return this.vel;
    }

    public String getModel(){
        return this.model;
    }



}
