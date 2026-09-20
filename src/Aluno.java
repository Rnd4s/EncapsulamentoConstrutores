public class Aluno {
    private String name;
    private double nota1;
    private double nota2;

    Aluno(String name, double nota1, double nota2){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }
    //
    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }

    public boolean verificarAprovacao(){
        if(this.calcularMedia() >= 7){
            return true;
        }else{
            return false;
        }
    }
}
