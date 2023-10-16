public class Lanche
{
    private int codigo;
    private String especificacao;
    private double preco;

    public Lanche(int codigo, String especificacao, double preco)
    {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setEspecificacao(String especificacao){
        this.especificacao = especificacao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getEspecificacao(){
        return especificacao;
    }
    
    public double getPreco(){
        return preco;
    }
}