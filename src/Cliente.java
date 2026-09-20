public class Cliente {
    private String name;
    private String cpf;
    private String email;

    Cliente(String name, String cpf, String email){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
