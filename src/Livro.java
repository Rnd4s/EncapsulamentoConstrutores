public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }


}
