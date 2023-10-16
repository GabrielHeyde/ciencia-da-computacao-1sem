//Gabriel Heyde Pintos

public class Competicao
{
    private String nomeCompeticao;
    private Data dataCompeticao;

    public Competicao(String nomeCompeticao, Data dataCompeticao)
    {
        this.nomeCompeticao = nomeCompeticao;
        this.dataCompeticao = dataCompeticao;
    }

    public void setNomeCompeticao(String nomeCompeticao){
        this.nomeCompeticao = nomeCompeticao;
    }
    
    public void setDataCompeticao(Data dataCompeticao){
        this.dataCompeticao = dataCompeticao;
    }
    
    public String getNomeCompeticao(){
        return nomeCompeticao;
    }
    
    public Data dataCompeticao(){
        return dataCompeticao;
    }
    
    public void imprimeData(){
        dataCompeticao.imprimeData();
    }
}