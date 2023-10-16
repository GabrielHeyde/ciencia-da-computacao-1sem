public class Produto
{
    private String nome;
    private String descricao;
    private int valor;

    public Produto(String nome, String descricao, int valor)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public int getValor(){
        return valor;
    }
    
    public String toString(){
        return "Nome do Produto: " + getNome() + "\nDescrição do Produto: " + getDescricao() + "\nValor do Produto: " + getValor();
    }
}