public class NaoPerecivel extends Produto
{
    private Data dataDeFabricacao;

    /**
     * Construtor para objetos da classe Perecivel
     */
    public NaoPerecivel(String nome, String descricao, int valor, Data dataDeFabricacao)
    {
        super(nome, descricao, valor);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public void setDataDeFabricacao(Data dataDeFabricacao){
        this.dataDeFabricacao = dataDeFabricacao;
    }
    
    public Data getDataDeFabricacao(){
        return dataDeFabricacao;
    }
    
    public String toString(){
        return "Nome do Produto: " + getNome() + "\nDescrição do Produto: " + getDescricao() + "\nValor do Produto: " + getValor() + "\nData de Fabricação: " + getDataDeFabricacao();
    }
}