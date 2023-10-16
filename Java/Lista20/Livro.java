public class Livro
{
    private String titulo, autor;
    private int anoLivro;

    public Livro(String titulo, String autor, int anoLivro)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLivro = anoLivro;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAnoLivro(int anoLivro){
        this.anoLivro = anoLivro;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnoLivro(){
        return anoLivro;
    }
}