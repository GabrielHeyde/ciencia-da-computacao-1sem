public class Perecivel extends Produto
{
    private Data dataDeValidade;

    /**
     * Construtor para objetos da classe Perecivel
     */
    public Perecivel(String nome, String descricao, int valor, Data dataDeValidade)
    {
        super(nome, descricao, valor);
        this.dataDeValidade = dataDeValidade;
    }

    public void setDataDeValidade(Data dataDeValidade){
        this.dataDeValidade = dataDeValidade;
    }
    
    public Data getDataDeValidade(){
        return dataDeValidade;
    }
    
    public String toString(){
        return "Nome do Produto: " + getNome() + "\nDescrição do Produto: " + getDescricao() + "\nValor do Produto: " + getValor() + "\nData de Validade: " + getDataDeValidade();
    }
}